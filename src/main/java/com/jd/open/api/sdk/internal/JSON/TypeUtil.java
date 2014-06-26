// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TypeUtil.java

package com.jd.open.api.sdk.internal.JSON;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.jd.open.api.sdk.internal.JSON:
//            Loader, Logger, Log

class TypeUtil {

    TypeUtil() {
    }

    public static List asList(Object a[]) {
        if (a == null)
            return Collections.emptyList();
        else
            return Arrays.asList(a);
    }

    public static Class fromName(String name) {
        return (Class) name2Class.get(name);
    }

    public static String toName(Class type) {
        return (String) class2Name.get(type);
    }

    public static Object valueOf(Class type, String value) {
        if (type.equals(String.class))
            return value;
        Method m = (Method) class2Value.get(type);
        if (m != null)
            try {
                return m.invoke(null, value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        if (type.equals(Character.TYPE) || type.equals(Character.class))
            return new Character(value.charAt(0));
        try {
            Constructor c = type.getConstructor(new Class[]{
                    String.class
            });
            return c.newInstance(new Object[]{
                    value
            });
        } catch (NoSuchMethodException e) {
        } catch (IllegalAccessException e) {
        } catch (InstantiationException e) {
        } catch (InvocationTargetException e) {
            if (e.getTargetException() instanceof Error)
                throw (Error) (Error) e.getTargetException();
        }
        return null;
    }

    public static Object valueOf(String type, String value) {
        return valueOf(fromName(type), value);
    }

    public static int parseInt(String s, int offset, int length, int base)
            throws NumberFormatException {
        int value = 0;
        if (length < 0)
            length = s.length() - offset;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(offset + i);
            int digit = c - 48;
            if (digit < 0 || digit >= base || digit >= 10) {
                digit = (10 + c) - 65;
                if (digit < 10 || digit >= base)
                    digit = (10 + c) - 97;
            }
            if (digit < 0 || digit >= base)
                throw new NumberFormatException(s.substring(offset, offset + length));
            value = value * base + digit;
        }

        return value;
    }

    public static int parseInt(byte b[], int offset, int length, int base)
            throws NumberFormatException {
        int value = 0;
        if (length < 0)
            length = b.length - offset;
        for (int i = 0; i < length; i++) {
            char c = (char) (0xff & b[offset + i]);
            int digit = c - 48;
            if (digit < 0 || digit >= base || digit >= 10) {
                digit = (10 + c) - 65;
                if (digit < 10 || digit >= base)
                    digit = (10 + c) - 97;
            }
            if (digit < 0 || digit >= base)
                throw new NumberFormatException(new String(b, offset, length));
            value = value * base + digit;
        }

        return value;
    }

    public static byte[] parseBytes(String s, int base) {
        byte bytes[] = new byte[s.length() / 2];
        for (int i = 0; i < s.length(); i += 2)
            bytes[i / 2] = (byte) parseInt(s, i, 2, base);

        return bytes;
    }

    public static String toString(byte bytes[], int base) {
        StringBuilder buf = new StringBuilder();
        byte arr$[] = bytes;
        int len$ = arr$.length;
        for (int i$ = 0; i$ < len$; i$++) {
            byte b = arr$[i$];
            int bi = 0xff & b;
            int c = 48 + (bi / base) % base;
            if (c > 57)
                c = 97 + (c - 48 - 10);
            buf.append((char) c);
            c = 48 + bi % base;
            if (c > 57)
                c = 97 + (c - 48 - 10);
            buf.append((char) c);
        }

        return buf.toString();
    }

    public static byte convertHexDigit(byte b) {
        if (b >= 48 && b <= 57)
            return (byte) (b - 48);
        if (b >= 97 && b <= 102)
            return (byte) ((b - 97) + 10);
        if (b >= 65 && b <= 70)
            return (byte) ((b - 65) + 10);
        else
            throw new IllegalArgumentException((new StringBuilder()).append("!hex:").append(Integer.toHexString(0xff & b)).toString());
    }

    public static void toHex(byte b, Appendable buf) {
        try {
            int bi = 0xff & b;
            int c = 48 + (bi / 16) % 16;
            if (c > 57)
                c = 65 + (c - 48 - 10);
            buf.append((char) c);
            c = 48 + bi % 16;
            if (c > 57)
                c = 65 + (c - 48 - 10);
            buf.append((char) c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toHexString(byte b) {
        return toHexString(new byte[]{
                b
        }, 0, 1);
    }

    public static String toHexString(byte b[]) {
        return toHexString(b, 0, b.length);
    }

    public static String toHexString(byte b[], int offset, int length) {
        StringBuilder buf = new StringBuilder();
        for (int i = offset; i < offset + length; i++) {
            int bi = 0xff & b[i];
            int c = 48 + (bi / 16) % 16;
            if (c > 57)
                c = 65 + (c - 48 - 10);
            buf.append((char) c);
            c = 48 + bi % 16;
            if (c > 57)
                c = 97 + (c - 48 - 10);
            buf.append((char) c);
        }

        return buf.toString();
    }

    public static byte[] fromHexString(String s) {
        if (s.length() % 2 != 0)
            throw new IllegalArgumentException(s);
        byte array[] = new byte[s.length() / 2];
        for (int i = 0; i < array.length; i++) {
            int b = Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16);
            array[i] = (byte) (0xff & b);
        }

        return array;
    }

    public static void dump(Class c) {
        System.err.println((new StringBuilder()).append("Dump: ").append(c).toString());
        dump(c.getClassLoader());
    }

    public static void dump(ClassLoader cl) {
        System.err.println("Dump Loaders:");
        for (; cl != null; cl = cl.getParent())
            System.err.println((new StringBuilder()).append("  loader ").append(cl).toString());

    }

    public static byte[] readLine(InputStream in)
            throws IOException {
        byte buf[] = new byte[256];
        int i = 0;
        int loops = 0;
        int ch = 0;
        byte old_buf[];
        do {
            ch = in.read();
            if (ch < 0)
                break;
            if (++loops == 1 && ch == LF)
                continue;
            if (ch == CR || ch == LF)
                break;
            if (i >= buf.length) {
                old_buf = buf;
                buf = new byte[old_buf.length + 256];
                System.arraycopy(old_buf, 0, buf, 0, old_buf.length);
            }
            buf[i++] = (byte) ch;
        } while (true);
        if (ch == -1 && i == 0)
            return null;
        if (ch == CR && in.available() >= 1 && in.markSupported()) {
            in.mark(1);
            ch = in.read();
            if (ch != LF)
                in.reset();
        }
        old_buf = buf;
        buf = new byte[i];
        System.arraycopy(old_buf, 0, buf, 0, i);
        return buf;
    }

    public static URL jarFor(String className) {
        try {
            className = (new StringBuilder()).append(className.replace('.', '/')).append(".class").toString();
            URL url = Loader.getResource(null, className, false);
            String s = url.toString();
            if (s.startsWith("jar:file:"))
                return new URL(s.substring(4, s.indexOf("!/")));
        } catch (Exception e) {
            LOG.ignore(e);
        }
        return null;
    }

    public static Object call(Class oClass, String method, Object obj, Object arg[])
            throws InvocationTargetException, NoSuchMethodException {
        Method methods[] = oClass.getMethods();
        for (int c = 0; methods != null && c < methods.length; c++) {
            if (!methods[c].getName().equals(method) || methods[c].getParameterTypes().length != arg.length || Modifier.isStatic(methods[c].getModifiers()) != (obj == null) || obj == null && methods[c].getDeclaringClass() != oClass)
                continue;
            try {
                return methods[c].invoke(obj, arg);
            } catch (IllegalAccessException e) {
                LOG.ignore(e);
            } catch (IllegalArgumentException e) {
                LOG.ignore(e);
            }
        }

        throw new NoSuchMethodException(method);
    }

    private static final Logger LOG = Log.getLogger(com.jd.open.api.sdk.internal.JSON.TypeUtil.class);
    public static int CR = 13;
    public static int LF = 10;
    private static final HashMap name2Class;
    private static final HashMap class2Name;
    private static final HashMap class2Value;

    static {
        name2Class = new HashMap();
        name2Class.put("boolean", Boolean.TYPE);
        name2Class.put("byte", Byte.TYPE);
        name2Class.put("char", Character.TYPE);
        name2Class.put("double", Double.TYPE);
        name2Class.put("float", Float.TYPE);
        name2Class.put("int", Integer.TYPE);
        name2Class.put("long", Long.TYPE);
        name2Class.put("short", Short.TYPE);
        name2Class.put("void", Void.TYPE);
        name2Class.put("java.lang.Boolean.TYPE", Boolean.TYPE);
        name2Class.put("java.lang.Byte.TYPE", Byte.TYPE);
        name2Class.put("java.lang.Character.TYPE", Character.TYPE);
        name2Class.put("java.lang.Double.TYPE", Double.TYPE);
        name2Class.put("java.lang.Float.TYPE", Float.TYPE);
        name2Class.put("java.lang.Integer.TYPE", Integer.TYPE);
        name2Class.put("java.lang.Long.TYPE", Long.TYPE);
        name2Class.put("java.lang.Short.TYPE", Short.TYPE);
        name2Class.put("java.lang.Void.TYPE", Void.TYPE);
        name2Class.put("java.lang.Boolean", Boolean.class);
        name2Class.put("java.lang.Byte", Byte.class);
        name2Class.put("java.lang.Character", Character.class);
        name2Class.put("java.lang.Double", Double.class);
        name2Class.put("java.lang.Float", Float.class);
        name2Class.put("java.lang.Integer", Integer.class);
        name2Class.put("java.lang.Long", Long.class);
        name2Class.put("java.lang.Short", Short.class);
        name2Class.put("Boolean", Boolean.class);
        name2Class.put("Byte", Byte.class);
        name2Class.put("Character", Character.class);
        name2Class.put("Double", Double.class);
        name2Class.put("Float", Float.class);
        name2Class.put("Integer", Integer.class);
        name2Class.put("Long", Long.class);
        name2Class.put("Short", Short.class);
        name2Class.put(null, Void.TYPE);
        name2Class.put("string", String.class);
        name2Class.put("String", String.class);
        name2Class.put("java.lang.String", String.class);
        class2Name = new HashMap();
        class2Name.put(Boolean.TYPE, "boolean");
        class2Name.put(Byte.TYPE, "byte");
        class2Name.put(Character.TYPE, "char");
        class2Name.put(Double.TYPE, "double");
        class2Name.put(Float.TYPE, "float");
        class2Name.put(Integer.TYPE, "int");
        class2Name.put(Long.TYPE, "long");
        class2Name.put(Short.TYPE, "short");
        class2Name.put(Void.TYPE, "void");
        class2Name.put(Boolean.class, "java.lang.Boolean");
        class2Name.put(Byte.class, "java.lang.Byte");
        class2Name.put(Character.class, "java.lang.Character");
        class2Name.put(Double.class, "java.lang.Double");
        class2Name.put(Float.class, "java.lang.Float");
        class2Name.put(Integer.class, "java.lang.Integer");
        class2Name.put(Long.class, "java.lang.Long");
        class2Name.put(Short.class, "java.lang.Short");
        class2Name.put(null, "void");
        class2Name.put(String.class, "java.lang.String");
        class2Value = new HashMap();
        try {
            Class s[] = {
                    String.class
            };
            class2Value.put(Boolean.TYPE, Boolean.class.getMethod("valueOf", s));
            class2Value.put(Byte.TYPE, Byte.class.getMethod("valueOf", s));
            class2Value.put(Double.TYPE, Double.class.getMethod("valueOf", s));
            class2Value.put(Float.TYPE, Float.class.getMethod("valueOf", s));
            class2Value.put(Integer.TYPE, Integer.class.getMethod("valueOf", s));
            class2Value.put(Long.TYPE, Long.class.getMethod("valueOf", s));
            class2Value.put(Short.TYPE, Short.class.getMethod("valueOf", s));
            class2Value.put(Boolean.class, Boolean.class.getMethod("valueOf", s));
            class2Value.put(Byte.class, Byte.class.getMethod("valueOf", s));
            class2Value.put(Double.class, Double.class.getMethod("valueOf", s));
            class2Value.put(Float.class, Float.class.getMethod("valueOf", s));
            class2Value.put(Integer.class, Integer.class.getMethod("valueOf", s));
            class2Value.put(Long.class, Long.class.getMethod("valueOf", s));
            class2Value.put(Short.class, Short.class.getMethod("valueOf", s));
        } catch (Exception e) {
            throw new Error(e);
        }
    }
}
