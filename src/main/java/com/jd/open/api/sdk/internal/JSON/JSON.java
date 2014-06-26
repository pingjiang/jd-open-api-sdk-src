// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JSON.java

package com.jd.open.api.sdk.internal.JSON;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.jd.open.api.sdk.internal.JSON:
//            QuotedStringTokenizer, Loader, Logger, TypeUtil, 
//            Log

public class JSON {
    public static class Literal
            implements Generator {

        public String toString() {
            return _json;
        }

        public void addJSON(Appendable buffer) {
            try {
                buffer.append(_json);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private String _json;

        public Literal(String json) {
            if (JSON.LOG.isDebugEnabled())
                JSON.parse(json);
            _json = json;
        }
    }

    public static interface Generator {

        void addJSON(Appendable appendable);
    }

    public static interface Convertor {

        void toJSON(Object obj, Output output);

        Object fromJSON(Map map);
    }

    public static interface Convertible {

        void toJSON(Output output);

        void fromJSON(Map map);
    }

    public static interface Output {

        void addClass(Class class1);

        void add(Object obj);

        void add(String s, Object obj);

        void add(String s, double d);

        void add(String s, long l);

        void add(String s, boolean flag);
    }

    public static class ReaderSource
            implements Source {

        public void setReader(Reader reader) {
            _reader = reader;
            _next = -1;
        }

        public boolean hasNext() {
            getNext();
            if (_next < 0) {
                scratch = null;
                return false;
            } else {
                return true;
            }
        }

        public char next() {
            getNext();
            char c = (char) _next;
            _next = -1;
            return c;
        }

        public char peek() {
            getNext();
            return (char) _next;
        }

        private void getNext() {
            if (_next < 0)
                try {
                    _next = _reader.read();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }

        public char[] scratchBuffer() {
            if (scratch == null)
                scratch = new char[1024];
            return scratch;
        }

        private Reader _reader;
        private int _next;
        private char scratch[];

        public ReaderSource(Reader r) {
            _next = -1;
            _reader = r;
        }
    }

    public static class StringSource
            implements Source {

        public boolean hasNext() {
            if (index < string.length()) {
                return true;
            } else {
                scratch = null;
                return false;
            }
        }

        public char next() {
            return string.charAt(index++);
        }

        public char peek() {
            return string.charAt(index);
        }

        public String toString() {
            return (new StringBuilder()).append(string.substring(0, index)).append("|||").append(string.substring(index)).toString();
        }

        public char[] scratchBuffer() {
            if (scratch == null)
                scratch = new char[string.length()];
            return scratch;
        }

        private final String string;
        private int index;
        private char scratch[];

        public StringSource(String s) {
            string = s;
        }
    }

    public static interface Source {

        boolean hasNext();

        char next();

        char peek();

        char[] scratchBuffer();
    }

    private final class ConvertableOutput
            implements Output {

        public void complete() {
            try {
                // 如果c当前指针为{，那么就直接返回{}
                if (c == '{')
                    _buffer.append("{}");
                else {
                    // 如果c不为0，那么就结束
                    if (c != 0) {
                        _buffer.append("}");
                    }
                    // 如果c为0，表示结束
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void add(Object obj) {
            if (c == 0) {
                throw new IllegalStateException();
            } else {
                append(_buffer, obj);
                c = '\0';
                return;
            }
        }

        public void addClass(Class type) {
            try {
                if (c == 0)
                    throw new IllegalStateException();
                _buffer.append(c);
                _buffer.append("\"class\":");
                append(_buffer, type.getName());
                c = ',';
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void add(String name, Object value) {
            try {
                if (c == 0)
                    throw new IllegalStateException();
                _buffer.append(c);
                QuotedStringTokenizer.quote(_buffer, name);
                _buffer.append(':');
                append(_buffer, value);
                c = ',';
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void add(String name, double value) {
            try {
                if (c == 0)
                    throw new IllegalStateException();
                _buffer.append(c);
                QuotedStringTokenizer.quote(_buffer, name);
                _buffer.append(':');
                appendNumber(_buffer, new Double(value));
                c = ',';
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void add(String name, long value) {
            try {
                if (c == 0)
                    throw new IllegalStateException();
                _buffer.append(c);
                QuotedStringTokenizer.quote(_buffer, name);
                _buffer.append(':');
                appendNumber(_buffer, Long.valueOf(value));
                c = ',';
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void add(String name, boolean value) {
            try {
                if (c == 0)
                    throw new IllegalStateException();
                _buffer.append(c);
                QuotedStringTokenizer.quote(_buffer, name);
                _buffer.append(':');
                appendBoolean(_buffer, value ? Boolean.TRUE : Boolean.FALSE);
                c = ',';
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private final Appendable _buffer;
        char c = '{';

        private ConvertableOutput(Appendable buffer) {
            _buffer = buffer;
        }

    }


    public JSON() {
        _convertors = new ConcurrentHashMap();
        _stringBufferSize = 1024;
    }

    public int getStringBufferSize() {
        return _stringBufferSize;
    }

    public void setStringBufferSize(int stringBufferSize) {
        _stringBufferSize = stringBufferSize;
    }

    public static void registerConvertor(Class forClass, Convertor convertor) {
        DEFAULT.addConvertor(forClass, convertor);
    }

    public static JSON getDefault() {
        return DEFAULT;
    }

    public static String toString(Object object) {
        StringBuilder buffer = new StringBuilder(DEFAULT.getStringBufferSize());
        DEFAULT.append(buffer, object);
        return buffer.toString();
    }

    public static String toString(Map object) throws IOException {
        StringBuilder buffer = new StringBuilder(DEFAULT.getStringBufferSize());
        DEFAULT.appendMap(buffer, object);
        return buffer.toString();
    }

    public static String toString(Object array[]) throws IOException {
        StringBuilder buffer = new StringBuilder(DEFAULT.getStringBufferSize());
        DEFAULT.appendArray(buffer, ((Object) (array)));
        return buffer.toString();
    }

    public static Object parse(String s) {
        return DEFAULT.parse(((Source) (new StringSource(s))), false);
    }

    public static Object parse(String s, boolean stripOuterComment) {
        return DEFAULT.parse(((Source) (new StringSource(s))), stripOuterComment);
    }

    public static Object parse(Reader in)
            throws IOException {
        return DEFAULT.parse(((Source) (new ReaderSource(in))), false);
    }

    public static Object parse(Reader in, boolean stripOuterComment)
            throws IOException {
        return DEFAULT.parse(((Source) (new ReaderSource(in))), stripOuterComment);
    }

    public String toJSON(Object object) {
        StringBuilder buffer = new StringBuilder(getStringBufferSize());
        append(buffer, object);
        return buffer.toString();
    }

    public Object fromJSON(String json) {
        Source source = new StringSource(json);
        return parse(source);
    }

    public void append(Appendable buffer, Object object) {
        try {
            if (object == null)
                buffer.append("null");
            else if (object instanceof Convertible)
                appendJSON(buffer, (Convertible) object);
            else if (object instanceof Generator)
                appendJSON(buffer, (Generator) object);
            else if (object instanceof Map)
                appendMap(buffer, (Map) object);
            else if (object instanceof Collection)
                appendArray(buffer, (Collection) object);
            else if (object.getClass().isArray())
                appendArray(buffer, object);
            else if (object instanceof Number)
                appendNumber(buffer, (Number) object);
            else if (object instanceof Boolean)
                appendBoolean(buffer, (Boolean) object);
            else if (object instanceof Character)
                appendString(buffer, object.toString());
            else if (object instanceof String) {
                appendString(buffer, (String) object);
            } else {
                Convertor convertor = getConvertor(object.getClass());
                if (convertor != null)
                    appendJSON(buffer, convertor, object);
                else
                    appendString(buffer, object.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void appendNull(Appendable buffer) throws IOException {
        buffer.append("null");
    }

    public void appendJSON(Appendable buffer, final Convertor convertor, final Object object) {
        appendJSON(buffer, new Convertible() {
            public void toJSON(Output out) {
                convertor.toJSON(object, out);
            }

            public void fromJSON(Map map) {
                //convertor.toJSON(object, map);
            }
        });
    }

    public void appendJSON(Appendable buffer, Convertible converter) {
        ConvertableOutput out = new ConvertableOutput(buffer);
        converter.toJSON(out);
        out.complete();
    }

    public void appendJSON(Appendable buffer, Generator generator) {
        generator.addJSON(buffer);
    }

    public void appendMap(Appendable buffer, Map map) throws IOException {
        if (map == null) {
            appendNull(buffer);
            return;
        }
        buffer.append('{');
        Iterator iter = map.entrySet().iterator();
        do {
            if (!iter.hasNext())
                break;
            java.util.Map.Entry entry = (java.util.Map.Entry) iter.next();
            QuotedStringTokenizer.quote(buffer, entry.getKey().toString());
            buffer.append(':');
            append(buffer, entry.getValue());
            if (iter.hasNext())
                buffer.append(',');
        } while (true);
        buffer.append('}');
    }

    public void appendArray(Appendable buffer, Collection collection) throws IOException {
        Iterator iter;
        boolean first;
        if (collection == null) {
            appendNull(buffer);
            return;
        }
        buffer.append('[');
        iter = collection.iterator();
        first = true;
        for (; iter.hasNext(); append(buffer, iter.next())) {
            if (!first)
                buffer.append(',');
            first = false;
        }

        buffer.append(']');
    }

    public void appendArray(Appendable buffer, Object array) throws IOException {
        int length;
        if (array == null) {
            appendNull(buffer);
            return;
        }
        buffer.append('[');
        length = Array.getLength(array);
        for (int i = 0; i < length; i++) {
            if (i != 0)
                buffer.append(',');
            append(buffer, Array.get(array, i));
        }

        buffer.append(']');
    }

    public void appendBoolean(Appendable buffer, Boolean b) throws IOException {
        try {
            if (b == null) {
                appendNull(buffer);
                return;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        buffer.append(((CharSequence) (b.booleanValue() ? "true" : "false")));
    }

    public void appendNumber(Appendable buffer, Number number) throws IOException {
        if (number == null) {
            appendNull(buffer);
            return;
        }
        buffer.append(String.valueOf(number));
    }

    public void appendString(Appendable buffer, String string) throws IOException {
        if (string == null) {
            appendNull(buffer);
            return;
        } else {
            QuotedStringTokenizer.quote(buffer, string);
            return;
        }
    }

    protected String toString(char buffer[], int offset, int length) {
        return new String(buffer, offset, length);
    }

    protected Map newMap() {
        return new HashMap();
    }

    protected Object[] newArray(int size) {
        return new Object[size];
    }

    protected JSON contextForArray() {
        return this;
    }

    protected JSON contextFor(String field) {
        return this;
    }

    protected Object convertTo(Class type, Map map) {
        if (type != null && Convertible.class.isAssignableFrom(type))
            try {
                Convertible conv = (Convertible) type.newInstance();
                conv.fromJSON(map);
                return conv;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        Convertor convertor = getConvertor(type);
        if (convertor != null)
            return convertor.fromJSON(map);
        else
            return map;
    }

    public void addConvertor(Class forClass, Convertor convertor) {
        _convertors.put(forClass.getName(), convertor);
    }

    protected Convertor getConvertor(Class forClass) {
        Class cls = forClass;
        Convertor convertor = (Convertor) _convertors.get(cls.getName());
        if (convertor == null && this != DEFAULT)
            convertor = DEFAULT.getConvertor(cls);
        do {
            if (convertor != null || cls == null || cls == Object.class)
                break;
            Class ifs[] = cls.getInterfaces();
            for (int i = 0; convertor == null && ifs != null && i < ifs.length; convertor = (Convertor) _convertors.get(ifs[i++].getName()))
                ;
            if (convertor == null) {
                cls = cls.getSuperclass();
                convertor = (Convertor) _convertors.get(cls.getName());
            }
        } while (true);
        return convertor;
    }

    public void addConvertorFor(String name, Convertor convertor) {
        _convertors.put(name, convertor);
    }

    public Convertor getConvertorFor(String name) {
        String clsName = name;
        Convertor convertor = (Convertor) _convertors.get(clsName);
        if (convertor == null && this != DEFAULT)
            convertor = DEFAULT.getConvertorFor(clsName);
        return convertor;
    }

    public Object parse(Source source, boolean stripOuterComment) {
        int comment_state = 0;
        if (!stripOuterComment)
            return parse(source);
        int strip_state = 1;
        Object o = null;
        do {
            if (!source.hasNext())
                break;
            char c = source.peek();
            if (comment_state == 1)
                switch (c) {
                    case 47: // '/'
                        comment_state = -1;
                        break;

                    case 42: // '*'
                        comment_state = 2;
                        if (strip_state == 1) {
                            comment_state = 0;
                            strip_state = 2;
                        }
                        break;
                }
            else if (comment_state > 1)
                switch (c) {
                    case 42: // '*'
                        comment_state = 3;
                        break;

                    case 47: // '/'
                        if (comment_state == 3) {
                            comment_state = 0;
                            if (strip_state == 2)
                                return o;
                        } else {
                            comment_state = 2;
                        }
                        break;

                    default:
                        comment_state = 2;
                        break;
                }
            else if (comment_state < 0)
                switch (c) {
                    case 10: // '\n'
                    case 13: // '\r'
                        comment_state = 0;
                        break;
                }
            else if (!Character.isWhitespace(c))
                if (c == '/')
                    comment_state = 1;
                else if (c == '*')
                    comment_state = 3;
                else if (o == null) {
                    o = parse(source);
                    continue;
                }
            source.next();
        } while (true);
        return o;
    }

    public Object parse(Source source) {
        int comment_state = 0;
        for (; source.hasNext(); source.next()) {
            char c = source.peek();
            if (comment_state == 1) {
                switch (c) {
                    case 47: // '/'
                        comment_state = -1;
                        break;

                    case 42: // '*'
                        comment_state = 2;
                        break;
                }
                continue;
            }
            if (comment_state > 1) {
                switch (c) {
                    case 42: // '*'
                        comment_state = 3;
                        break;

                    case 47: // '/'
                        if (comment_state == 3)
                            comment_state = 0;
                        else
                            comment_state = 2;
                        break;

                    default:
                        comment_state = 2;
                        break;
                }
                continue;
            }
            if (comment_state < 0) {
                switch (c) {
                    case 10: // '\n'
                    case 13: // '\r'
                        comment_state = 0;
                        break;
                }
                continue;
            }
            switch (c) {
                case 123: // '{'
                    return parseObject(source);

                case 91: // '['
                    return parseArray(source);

                case 34: // '"'
                    return parseString(source);

                case 45: // '-'
                    return parseNumber(source);

                case 110: // 'n'
                    complete("null", source);
                    return null;

                case 116: // 't'
                    complete("true", source);
                    return Boolean.TRUE;

                case 102: // 'f'
                    complete("false", source);
                    return Boolean.FALSE;

                case 117: // 'u'
                    complete("undefined", source);
                    return null;

                case 78: // 'N'
                    complete("NaN", source);
                    return null;

                case 47: // '/'
                    comment_state = 1;
                    break;

                default:
                    if (Character.isDigit(c))
                        return parseNumber(source);
                    if (!Character.isWhitespace(c))
                        return handleUnknown(source, c);
                    break;
            }
        }

        return null;
    }

    protected Object handleUnknown(Source source, char c) {
        throw new IllegalStateException((new StringBuilder()).append("unknown char '").append(c).append("'(").append(c).append(") in ").append(source).toString());
    }

    protected Object parseObject(Source source) {
        if (source.next() != '{')
            throw new IllegalStateException();
        Map map = newMap();
        char next = seekTo("\"}", source);
        do {
            if (!source.hasNext())
                break;
            if (next == '}') {
                source.next();
                break;
            }
            String name = parseString(source);
            seekTo(':', source);
            source.next();
            Object value = contextFor(name).parse(source);
            map.put(name, value);
            seekTo(",}", source);
            next = source.next();
            if (next == '}')
                break;
            next = seekTo("\"}", source);
        } while (true);
        String classname = (String) map.get("class");
        if (classname != null)
            try {
                Class c = Loader.loadClass(com.jd.open.api.sdk.internal.JSON.JSON.class, classname);
                return convertTo(c, map);
            } catch (ClassNotFoundException e) {
                LOG.warn(e);
            }
        return map;
    }

    protected Object parseArray(Source source) {
        if (source.next() != '[')
            throw new IllegalStateException();
        int size = 0;
        ArrayList list = null;
        Object item = null;
        boolean coma = true;
        do {
            if (!source.hasNext())
                break;
            char c = source.peek();
            switch (c) {
                case 93: // ']'
                    source.next();
                    switch (size) {
                        case 0: // '\0'
                            return ((Object) (newArray(0)));

                        case 1: // '\001'
                            Object array = ((Object) (newArray(1)));
                            Array.set(array, 0, item);
                            return array;
                    }
                    return ((Object) (list.toArray(newArray(list.size()))));

                case 44: // ','
                    if (coma)
                        throw new IllegalStateException();
                    coma = true;
                    source.next();
                    break;

                default:
                    if (Character.isWhitespace(c)) {
                        source.next();
                    } else {
                        coma = false;
                        if (size++ == 0)
                            item = contextForArray().parse(source);
                        else if (list == null) {
                            list = new ArrayList();
                            list.add(item);
                            item = contextForArray().parse(source);
                            list.add(item);
                            item = null;
                        } else {
                            item = contextForArray().parse(source);
                            list.add(item);
                            item = null;
                        }
                    }
                    break;
            }
        } while (true);
        throw new IllegalStateException("unexpected end of array");
    }

    protected String parseString(Source source) {
        if (source.next() != '"')
            throw new IllegalStateException();
        boolean escape = false;
        StringBuilder b = null;
        char scratch[] = source.scratchBuffer();
        if (scratch != null) {
            int i = 0;
            do {
                if (!source.hasNext())
                    break;
                if (i >= scratch.length) {
                    b = new StringBuilder(scratch.length * 2);
                    b.append(scratch, 0, i);
                    break;
                }
                char c = source.next();
                if (escape) {
                    escape = false;
                    switch (c) {
                        case 34: // '"'
                            scratch[i++] = '"';
                            break;

                        case 92: // '\\'
                            scratch[i++] = '\\';
                            break;

                        case 47: // '/'
                            scratch[i++] = '/';
                            break;

                        case 98: // 'b'
                            scratch[i++] = '\b';
                            break;

                        case 102: // 'f'
                            scratch[i++] = '\f';
                            break;

                        case 110: // 'n'
                            scratch[i++] = '\n';
                            break;

                        case 114: // 'r'
                            scratch[i++] = '\r';
                            break;

                        case 116: // 't'
                            scratch[i++] = '\t';
                            break;

                        case 117: // 'u'
                            char uc = (char) ((TypeUtil.convertHexDigit((byte) source.next()) << 12) + (TypeUtil.convertHexDigit((byte) source.next()) << 8) + (TypeUtil.convertHexDigit((byte) source.next()) << 4) + TypeUtil.convertHexDigit((byte) source.next()));
                            scratch[i++] = uc;
                            break;

                        default:
                            scratch[i++] = c;
                            break;
                    }
                } else if (c == '\\') {
                    escape = true;
                } else {
                    if (c == '"')
                        return toString(scratch, 0, i);
                    scratch[i++] = c;
                }
            } while (true);
            if (b == null)
                return toString(scratch, 0, i);
        } else {
            b = new StringBuilder(getStringBufferSize());
        }
        StringBuilder builder = b;
        do {
            if (!source.hasNext())
                break;
            char c = source.next();
            if (escape) {
                escape = false;
                switch (c) {
                    case 34: // '"'
                        builder.append('"');
                        break;

                    case 92: // '\\'
                        builder.append('\\');
                        break;

                    case 47: // '/'
                        builder.append('/');
                        break;

                    case 98: // 'b'
                        builder.append('\b');
                        break;

                    case 102: // 'f'
                        builder.append('\f');
                        break;

                    case 110: // 'n'
                        builder.append('\n');
                        break;

                    case 114: // 'r'
                        builder.append('\r');
                        break;

                    case 116: // 't'
                        builder.append('\t');
                        break;

                    case 117: // 'u'
                        char uc = (char) ((TypeUtil.convertHexDigit((byte) source.next()) << 12) + (TypeUtil.convertHexDigit((byte) source.next()) << 8) + (TypeUtil.convertHexDigit((byte) source.next()) << 4) + TypeUtil.convertHexDigit((byte) source.next()));
                        builder.append(uc);
                        break;

                    default:
                        builder.append(c);
                        break;
                }
                continue;
            }
            if (c == '\\') {
                escape = true;
                continue;
            }
            if (c == '"')
                break;
            builder.append(c);
        } while (true);
        return builder.toString();
    }

    public Number parseNumber(Source source) {
        boolean minus = false;
        long number = 0L;
        StringBuilder buffer = null;
        label0:
        do {
            if (!source.hasNext())
                break;
            char c = source.peek();
            switch (c) {
                case 44: // ','
                case 47: // '/'
                case 58: // ':'
                case 59: // ';'
                case 60: // '<'
                case 61: // '='
                case 62: // '>'
                case 63: // '?'
                case 64: // '@'
                case 65: // 'A'
                case 66: // 'B'
                case 67: // 'C'
                case 68: // 'D'
                case 70: // 'F'
                case 71: // 'G'
                case 72: // 'H'
                case 73: // 'I'
                case 74: // 'J'
                case 75: // 'K'
                case 76: // 'L'
                case 77: // 'M'
                case 78: // 'N'
                case 79: // 'O'
                case 80: // 'P'
                case 81: // 'Q'
                case 82: // 'R'
                case 83: // 'S'
                case 84: // 'T'
                case 85: // 'U'
                case 86: // 'V'
                case 87: // 'W'
                case 88: // 'X'
                case 89: // 'Y'
                case 90: // 'Z'
                case 91: // '['
                case 92: // '\\'
                case 93: // ']'
                case 94: // '^'
                case 95: // '_'
                case 96: // '`'
                case 97: // 'a'
                case 98: // 'b'
                case 99: // 'c'
                case 100: // 'd'
                default:
                    break label0;

                case 48: // '0'
                case 49: // '1'
                case 50: // '2'
                case 51: // '3'
                case 52: // '4'
                case 53: // '5'
                case 54: // '6'
                case 55: // '7'
                case 56: // '8'
                case 57: // '9'
                    number = number * 10L + (long) (c - 48);
                    source.next();
                    break;

                case 43: // '+'
                case 45: // '-'
                    if (number != 0L)
                        throw new IllegalStateException("bad number");
                    minus = true;
                    source.next();
                    break;

                case 46: // '.'
                case 69: // 'E'
                case 101: // 'e'
                    buffer = new StringBuilder(16);
                    if (minus)
                        buffer.append('-');
                    buffer.append(number);
                    buffer.append(c);
                    source.next();
                    break label0;
            }
        } while (true);
        if (buffer == null)
            return Long.valueOf(minus ? -1L * number : number);
        label1:
        do {
            if (!source.hasNext())
                break;
            char c = source.peek();
            switch (c) {
                case 44: // ','
                case 47: // '/'
                case 58: // ':'
                case 59: // ';'
                case 60: // '<'
                case 61: // '='
                case 62: // '>'
                case 63: // '?'
                case 64: // '@'
                case 65: // 'A'
                case 66: // 'B'
                case 67: // 'C'
                case 68: // 'D'
                case 70: // 'F'
                case 71: // 'G'
                case 72: // 'H'
                case 73: // 'I'
                case 74: // 'J'
                case 75: // 'K'
                case 76: // 'L'
                case 77: // 'M'
                case 78: // 'N'
                case 79: // 'O'
                case 80: // 'P'
                case 81: // 'Q'
                case 82: // 'R'
                case 83: // 'S'
                case 84: // 'T'
                case 85: // 'U'
                case 86: // 'V'
                case 87: // 'W'
                case 88: // 'X'
                case 89: // 'Y'
                case 90: // 'Z'
                case 91: // '['
                case 92: // '\\'
                case 93: // ']'
                case 94: // '^'
                case 95: // '_'
                case 96: // '`'
                case 97: // 'a'
                case 98: // 'b'
                case 99: // 'c'
                case 100: // 'd'
                default:
                    break label1;

                case 43: // '+'
                case 45: // '-'
                case 46: // '.'
                case 48: // '0'
                case 49: // '1'
                case 50: // '2'
                case 51: // '3'
                case 52: // '4'
                case 53: // '5'
                case 54: // '6'
                case 55: // '7'
                case 56: // '8'
                case 57: // '9'
                case 69: // 'E'
                case 101: // 'e'
                    buffer.append(c);
                    source.next();
                    break;
            }
        } while (true);
        return new Double(buffer.toString());
    }

    protected void seekTo(char seek, Source source) {
        for (; source.hasNext(); source.next()) {
            char c = source.peek();
            if (c == seek)
                return;
            if (!Character.isWhitespace(c))
                throw new IllegalStateException((new StringBuilder()).append("Unexpected '").append(c).append(" while seeking '").append(seek).append("'").toString());
        }

        throw new IllegalStateException((new StringBuilder()).append("Expected '").append(seek).append("'").toString());
    }

    protected char seekTo(String seek, Source source) {
        for (; source.hasNext(); source.next()) {
            char c = source.peek();
            if (seek.indexOf(c) >= 0)
                return c;
            if (!Character.isWhitespace(c))
                throw new IllegalStateException((new StringBuilder()).append("Unexpected '").append(c).append("' while seeking one of '").append(seek).append("'").toString());
        }

        throw new IllegalStateException((new StringBuilder()).append("Expected one of '").append(seek).append("'").toString());
    }

    protected static void complete(String seek, Source source) {
        int i;
        for (i = 0; source.hasNext() && i < seek.length(); ) {
            char c = source.next();
            if (c != seek.charAt(i++))
                throw new IllegalStateException((new StringBuilder()).append("Unexpected '").append(c).append(" while seeking  \"").append(seek).append("\"").toString());
        }

        if (i < seek.length())
            throw new IllegalStateException((new StringBuilder()).append("Expected \"").append(seek).append("\"").toString());
        else
            return;
    }

    static final Logger LOG = Log.getLogger(com.jd.open.api.sdk.internal.JSON.JSON.class);
    public static final JSON DEFAULT = new JSON();
    private Map _convertors;
    private int _stringBufferSize;

}
