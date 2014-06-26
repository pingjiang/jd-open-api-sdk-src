// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JSONPojoConvertor.java

package com.jd.open.api.sdk.internal.JSON;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

// Referenced classes of package com.jd.open.api.sdk.internal.JSON:
//            Logger, Log, JSON

public class JSONPojoConvertor
        implements JSON.Convertor {
    public static interface NumberType {

        public abstract Object getActualValue(Number number);
    }

    public static class Setter {

        public String getPropertyName() {
            return _propertyName;
        }

        public Method getMethod() {
            return _setter;
        }

        public NumberType getNumberType() {
            return _numberType;
        }

        public Class getType() {
            return _type;
        }

        public Class getComponentType() {
            return _componentType;
        }

        public boolean isPropertyNumber() {
            return _numberType != null;
        }

        public void invoke(Object obj, Object value)
                throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
            if (value == null)
                _setter.invoke(obj, JSONPojoConvertor.NULL_ARG);
            else
                invokeObject(obj, value);
        }

        protected void invokeObject(Object obj, Object value)
                throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
            if (_type.isEnum()) {
                if (value instanceof Enum)
                    _setter.invoke(obj, new Object[]{
                            value
                    });
                else
                    _setter.invoke(obj, new Object[]{
                            Enum.valueOf(_type, value.toString())
                    });
            } else if (_numberType != null && (value instanceof Number))
                _setter.invoke(obj, new Object[]{
                        _numberType.getActualValue((Number) value)
                });
            else if (Character.TYPE.equals(_type) || Character.class.equals(_type))
                _setter.invoke(obj, new Object[]{
                        Character.valueOf(String.valueOf(value).charAt(0))
                });
            else if (_componentType != null && value.getClass().isArray()) {
                if (_numberType == null) {
                    int len = Array.getLength(value);
                    Object array = Array.newInstance(_componentType, len);
                    try {
                        System.arraycopy(value, 0, array, 0, len);
                    } catch (Exception e) {
                        JSONPojoConvertor.LOG.ignore(e);
                        _setter.invoke(obj, new Object[]{
                                value
                        });
                        return;
                    }
                    _setter.invoke(obj, new Object[]{
                            array
                    });
                } else {
                    Object old[] = (Object[]) (Object[]) value;
                    Object array = Array.newInstance(_componentType, old.length);
                    try {
                        for (int i = 0; i < old.length; i++)
                            Array.set(array, i, _numberType.getActualValue((Number) old[i]));

                    } catch (Exception e) {
                        JSONPojoConvertor.LOG.ignore(e);
                        _setter.invoke(obj, new Object[]{
                                value
                        });
                        return;
                    }
                    _setter.invoke(obj, new Object[]{
                            array
                    });
                }
            } else {
                _setter.invoke(obj, new Object[]{
                        value
                });
            }
        }

        protected String _propertyName;
        protected Method _setter;
        protected NumberType _numberType;
        protected Class _type;
        protected Class _componentType;

        public Setter(String propertyName, Method method) {
            _propertyName = propertyName;
            _setter = method;
            _type = method.getParameterTypes()[0];
            _numberType = (NumberType) JSONPojoConvertor.__numberTypes.get(_type);
            if (_numberType == null && _type.isArray()) {
                _componentType = _type.getComponentType();
                _numberType = (NumberType) JSONPojoConvertor.__numberTypes.get(_componentType);
            }
        }
    }


    public static NumberType getNumberType(Class clazz) {
        return (NumberType) __numberTypes.get(clazz);
    }

    public JSONPojoConvertor(Class pojoClass) {
        this(pojoClass, (Set) null, true);
    }

    public JSONPojoConvertor(Class pojoClass, String excluded[]) {
        this(pojoClass, ((Set) (new HashSet(Arrays.asList(excluded)))), true);
    }

    public JSONPojoConvertor(Class pojoClass, Set excluded) {
        this(pojoClass, excluded, true);
    }

    public JSONPojoConvertor(Class pojoClass, Set excluded, boolean fromJSON) {
        _getters = new HashMap();
        _setters = new HashMap();
        _pojoClass = pojoClass;
        _excluded = excluded;
        _fromJSON = fromJSON;
        init();
    }

    public JSONPojoConvertor(Class pojoClass, boolean fromJSON) {
        this(pojoClass, (Set) null, fromJSON);
    }

    protected void init() {
        Method methods[] = _pojoClass.getMethods();
        for (int i = 0; i < methods.length; i++) {
            Method m = methods[i];
            if (!Modifier.isStatic(m.getModifiers()) && m.getDeclaringClass() != Object.class) {
                String name = m.getName();
                switch (m.getParameterTypes().length) {
                    default:
                        break;

                    case 0: // '\0'
                        if (m.getReturnType() == null)
                            break;
                        if (name.startsWith("is") && name.length() > 2) {
                            name = (new StringBuilder()).append(name.substring(2, 3).toLowerCase()).append(name.substring(3)).toString();
                        } else {
                            if (!name.startsWith("get") || name.length() <= 3)
                                break;
                            name = (new StringBuilder()).append(name.substring(3, 4).toLowerCase()).append(name.substring(4)).toString();
                        }
                        if (includeField(name, m))
                            addGetter(name, m);
                        break;

                    case 1: // '\001'
                        if (name.startsWith("set") && name.length() > 3) {
                            name = (new StringBuilder()).append(name.substring(3, 4).toLowerCase()).append(name.substring(4)).toString();
                            if (includeField(name, m))
                                addSetter(name, m);
                        }
                        break;
                }
            }
        }

    }

    protected void addGetter(String name, Method method) {
        _getters.put(name, method);
    }

    protected void addSetter(String name, Method method) {
        _setters.put(name, new Setter(name, method));
    }

    protected Setter getSetter(String name) {
        return (Setter) _setters.get(name);
    }

    protected boolean includeField(String name, Method m) {
        return _excluded == null || !_excluded.contains(name);
    }

    protected int getExcludedCount() {
        return _excluded != null ? _excluded.size() : 0;
    }

    public Object fromJSON(Map object) {
        Object obj = null;
        try {
            obj = _pojoClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        setProps(obj, object);
        return obj;
    }

    public int setProps(Object obj, Map props) {
        int count = 0;
        Iterator iterator = props.entrySet().iterator();
        do {
            if (!iterator.hasNext())
                break;
            java.util.Map.Entry entry = (java.util.Map.Entry) iterator.next();
            Setter setter = getSetter((String) entry.getKey());
            if (setter != null)
                try {
                    setter.invoke(obj, entry.getValue());
                    count++;
                } catch (Exception e) {
                    LOG.warn((new StringBuilder()).append(_pojoClass.getName()).append("#").append(setter.getPropertyName()).append(" not set from ").append(entry.getValue().getClass().getName()).append("=").append(entry.getValue().toString()).toString(), new Object[0]);
                    log(e);
                }
        } while (true);
        return count;
    }

    public void toJSON(Object obj, JSON.Output out) {
        if (_fromJSON)
            out.addClass(_pojoClass);
        for (Iterator i$ = _getters.entrySet().iterator(); i$.hasNext(); ) {
            java.util.Map.Entry entry = (java.util.Map.Entry) i$.next();
            try {
                out.add((String) entry.getKey(), ((Method) entry.getValue()).invoke(obj, GETTER_ARG));
            } catch (Exception e) {
                LOG.warn("{} property '{}' excluded. (errors)", new Object[]{
                        _pojoClass.getName(), entry.getKey()
                });
                log(e);
            }
        }

    }

    protected void log(Throwable t) {
        LOG.ignore(t);
    }

    private static final Logger LOG = Log.getLogger(com.jd.open.api.sdk.internal.JSON.JSONPojoConvertor.class);
    public static final Object GETTER_ARG[] = new Object[0];
    public static final Object NULL_ARG[] = {
            null
    };
    private static final Map __numberTypes;
    protected boolean _fromJSON;
    protected Class _pojoClass;
    protected Map _getters;
    protected Map _setters;
    protected Set _excluded;
    public static final NumberType SHORT;
    public static final NumberType INTEGER;
    public static final NumberType FLOAT;
    public static final NumberType LONG;
    public static final NumberType DOUBLE;

    static {
        __numberTypes = new HashMap();
        SHORT = new NumberType() {

            public Object getActualValue(Number number) {
                return new Short(number.shortValue());
            }

        }
        ;
        INTEGER = new NumberType() {

            public Object getActualValue(Number number) {
                return new Integer(number.intValue());
            }

        }
        ;
        FLOAT = new NumberType() {

            public Object getActualValue(Number number) {
                return new Float(number.floatValue());
            }

        }
        ;
        LONG = new NumberType() {

            public Object getActualValue(Number number) {
                return (number instanceof Long) ? number : new Long(number.longValue());
            }

        }
        ;
        DOUBLE = new NumberType() {

            public Object getActualValue(Number number) {
                return (number instanceof Double) ? number : new Double(number.doubleValue());
            }

        }
        ;
        __numberTypes.put(Short.class, SHORT);
        __numberTypes.put(Short.TYPE, SHORT);
        __numberTypes.put(Integer.class, INTEGER);
        __numberTypes.put(Integer.TYPE, INTEGER);
        __numberTypes.put(Long.class, LONG);
        __numberTypes.put(Long.TYPE, LONG);
        __numberTypes.put(Float.class, FLOAT);
        __numberTypes.put(Float.TYPE, FLOAT);
        __numberTypes.put(Double.class, DOUBLE);
        __numberTypes.put(Double.TYPE, DOUBLE);
    }


}
