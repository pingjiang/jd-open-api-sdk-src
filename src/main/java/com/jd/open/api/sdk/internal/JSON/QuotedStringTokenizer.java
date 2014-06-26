// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QuotedStringTokenizer.java

package com.jd.open.api.sdk.internal.JSON;

import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

// Referenced classes of package com.jd.open.api.sdk.internal.JSON:
//            TypeUtil

class QuotedStringTokenizer extends StringTokenizer {

    public QuotedStringTokenizer(String str, String delim, boolean returnDelimiters, boolean returnQuotes) {
        super("");
        _delim = "\t\n\r";
        _returnQuotes = false;
        _returnDelimiters = false;
        _hasToken = false;
        _i = 0;
        _lastStart = 0;
        _double = true;
        _single = true;
        _string = str;
        if (delim != null)
            _delim = delim;
        _returnDelimiters = returnDelimiters;
        _returnQuotes = returnQuotes;
        if (_delim.indexOf('\'') >= 0 || _delim.indexOf('"') >= 0) {
            throw new Error((new StringBuilder()).append("Can't use quotes as delimiters: ").append(_delim).toString());
        } else {
            _token = new StringBuffer(_string.length() <= 1024 ? _string.length() / 2 : 512);
            return;
        }
    }

    public QuotedStringTokenizer(String str, String delim, boolean returnDelimiters) {
        this(str, delim, returnDelimiters, false);
    }

    public QuotedStringTokenizer(String str, String delim) {
        this(str, delim, false, false);
    }

    public QuotedStringTokenizer(String str) {
        this(str, null, false, false);
    }

    public boolean hasMoreTokens() {
        if (_hasToken)
            return true;
        _lastStart = _i;
        int state = 0;
        boolean escape = false;
        do {
            if (_i >= _string.length())
                break;
            char c = _string.charAt(_i++);
            switch (state) {
                case 0: // '\0'
                    if (_delim.indexOf(c) >= 0) {
                        if (_returnDelimiters) {
                            _token.append(c);
                            return _hasToken = true;
                        }
                    } else if (c == '\'' && _single) {
                        if (_returnQuotes)
                            _token.append(c);
                        state = 2;
                    } else if (c == '"' && _double) {
                        if (_returnQuotes)
                            _token.append(c);
                        state = 3;
                    } else {
                        _token.append(c);
                        _hasToken = true;
                        state = 1;
                    }
                    break;

                case 1: // '\001'
                    _hasToken = true;
                    if (_delim.indexOf(c) >= 0) {
                        if (_returnDelimiters)
                            _i--;
                        return _hasToken;
                    }
                    if (c == '\'' && _single) {
                        if (_returnQuotes)
                            _token.append(c);
                        state = 2;
                    } else if (c == '"' && _double) {
                        if (_returnQuotes)
                            _token.append(c);
                        state = 3;
                    } else {
                        _token.append(c);
                    }
                    break;

                case 2: // '\002'
                    _hasToken = true;
                    if (escape) {
                        escape = false;
                        _token.append(c);
                    } else if (c == '\'') {
                        if (_returnQuotes)
                            _token.append(c);
                        state = 1;
                    } else if (c == '\\') {
                        if (_returnQuotes)
                            _token.append(c);
                        escape = true;
                    } else {
                        _token.append(c);
                    }
                    break;

                case 3: // '\003'
                    _hasToken = true;
                    if (escape) {
                        escape = false;
                        _token.append(c);
                    } else if (c == '"') {
                        if (_returnQuotes)
                            _token.append(c);
                        state = 1;
                    } else if (c == '\\') {
                        if (_returnQuotes)
                            _token.append(c);
                        escape = true;
                    } else {
                        _token.append(c);
                    }
                    break;
            }
        } while (true);
        return _hasToken;
    }

    public String nextToken()
            throws NoSuchElementException {
        if (!hasMoreTokens() || _token == null) {
            throw new NoSuchElementException();
        } else {
            String t = _token.toString();
            _token.setLength(0);
            _hasToken = false;
            return t;
        }
    }

    public String nextToken(String delim)
            throws NoSuchElementException {
        _delim = delim;
        _i = _lastStart;
        _token.setLength(0);
        _hasToken = false;
        return nextToken();
    }

    public boolean hasMoreElements() {
        return hasMoreTokens();
    }

    public Object nextElement()
            throws NoSuchElementException {
        return nextToken();
    }

    public int countTokens() {
        return -1;
    }

    public static String quoteIfNeeded(String s, String delim) {
        if (s == null)
            return null;
        if (s.length() == 0)
            return "\"\"";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '\\' || c == '"' || c == '\'' || Character.isWhitespace(c) || delim.indexOf(c) >= 0) {
                StringBuffer b = new StringBuffer(s.length() + 8);
                quote(b, s);
                return b.toString();
            }
        }

        return s;
    }

    public static String quote(String s) {
        if (s == null)
            return null;
        if (s.length() == 0) {
            return "\"\"";
        } else {
            StringBuffer b = new StringBuffer(s.length() + 8);
            quote(((Appendable) (b)), s);
            return b.toString();
        }
    }

    public static void quote(Appendable buffer, String input) {
        try {
            buffer.append('"');
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c >= ' ') {
                    if (c == '"' || c == '\\')
                        buffer.append('\\');
                    buffer.append(c);
                    continue;
                }
                char escape = escapes[c];
                if (escape == '\uFFFF') {
                    buffer.append('\\').append('u').append('0').append('0');
                    if (c < '\020')
                        buffer.append('0');
                    buffer.append(Integer.toString(c, 16));
                } else {
                    buffer.append('\\').append(escape);
                }
            }

            buffer.append('"');
        } catch (IOException x) {
            throw new RuntimeException(x);
        }
    }

    public static boolean quoteIfNeeded(Appendable buf, String s, String delim) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (delim.indexOf(c) >= 0) {
                quote(buf, s);
                return true;
            }
        }

        try {
            buf.append(s);
            return false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String unquote(String s) {
        if (s == null)
            return null;
        if (s.length() < 2)
            return s;
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        if (first != last || first != '"' && first != '\'')
            return s;
        StringBuilder b = new StringBuilder(s.length() - 2);
        boolean escape = false;
        for (int i = 1; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (escape) {
                escape = false;
                switch (c) {
                    case 110: // 'n'
                        b.append('\n');
                        break;

                    case 114: // 'r'
                        b.append('\r');
                        break;

                    case 116: // 't'
                        b.append('\t');
                        break;

                    case 102: // 'f'
                        b.append('\f');
                        break;

                    case 98: // 'b'
                        b.append('\b');
                        break;

                    case 92: // '\\'
                        b.append('\\');
                        break;

                    case 47: // '/'
                        b.append('/');
                        break;

                    case 34: // '"'
                        b.append('"');
                        break;

                    case 117: // 'u'
                        b.append((char) ((TypeUtil.convertHexDigit((byte) s.charAt(i++)) << 24) + (TypeUtil.convertHexDigit((byte) s.charAt(i++)) << 16) + (TypeUtil.convertHexDigit((byte) s.charAt(i++)) << 8) + TypeUtil.convertHexDigit((byte) s.charAt(i++))));
                        break;

                    default:
                        b.append(c);
                        break;
                }
                continue;
            }
            if (c == '\\')
                escape = true;
            else
                b.append(c);
        }

        return b.toString();
    }

    public boolean getDouble() {
        return _double;
    }

    public void setDouble(boolean d) {
        _double = d;
    }

    public boolean getSingle() {
        return _single;
    }

    public void setSingle(boolean single) {
        _single = single;
    }

    private static final String __delim = "\t\n\r";
    private String _string;
    private String _delim;
    private boolean _returnQuotes;
    private boolean _returnDelimiters;
    private StringBuffer _token;
    private boolean _hasToken;
    private int _i;
    private int _lastStart;
    private boolean _double;
    private boolean _single;
    private static final char escapes[];

    static {
        escapes = new char[32];
        Arrays.fill(escapes, '\uFFFF');
        escapes[8] = 'b';
        escapes[9] = 't';
        escapes[10] = 'n';
        escapes[12] = 'f';
        escapes[13] = 'r';
    }
}
