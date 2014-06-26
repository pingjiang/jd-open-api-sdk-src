// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Loader.java

package com.jd.open.api.sdk.internal.JSON;

import java.net.URL;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

class Loader {

    Loader() {
    }

    public static URL getResource(Class loadClass, String name, boolean checkParents)
            throws ClassNotFoundException {
        URL url = null;
        for (ClassLoader loader = Thread.currentThread().getContextClassLoader(); url == null && loader != null; loader = url != null || !checkParents ? null : loader.getParent())
            url = loader.getResource(name);

        for (ClassLoader loader = loadClass != null ? loadClass.getClassLoader() : null; url == null && loader != null; loader = url != null || !checkParents ? null : loader.getParent())
            url = loader.getResource(name);

        if (url == null)
            url = ClassLoader.getSystemResource(name);
        return url;
    }

    public static Class loadClass(Class loadClass, String name)
            throws ClassNotFoundException {
        return loadClass(loadClass, name, false);
    }

    public static Class loadClass(Class loadClass, String name, boolean checkParents)
            throws ClassNotFoundException {
        ClassNotFoundException ex = null;
        Class c = null;
        for (ClassLoader loader = Thread.currentThread().getContextClassLoader(); c == null && loader != null; loader = c != null || !checkParents ? null : loader.getParent())
            try {
                c = loader.loadClass(name);
                continue;
            } catch (ClassNotFoundException e) {
                if (ex == null)
                    ex = e;
            }

        for (ClassLoader loader = loadClass != null ? loadClass.getClassLoader() : null; c == null && loader != null; loader = c != null || !checkParents ? null : loader.getParent())
            try {
                c = loader.loadClass(name);
                continue;
            } catch (ClassNotFoundException e) {
                if (ex == null)
                    ex = e;
            }

        if (c == null)
            try {
                c = Class.forName(name);
            } catch (ClassNotFoundException e) {
                if (ex == null)
                    ex = e;
            }
        if (c != null)
            return c;
        else
            throw ex;
    }

    public static ResourceBundle getResourceBundle(Class loadClass, String name, boolean checkParents, Locale locale)
            throws MissingResourceException {
        MissingResourceException ex = null;
        ResourceBundle bundle = null;
        for (ClassLoader loader = Thread.currentThread().getContextClassLoader(); bundle == null && loader != null; loader = bundle != null || !checkParents ? null : loader.getParent())
            try {
                bundle = ResourceBundle.getBundle(name, locale, loader);
                continue;
            } catch (MissingResourceException e) {
                if (ex == null)
                    ex = e;
            }

        for (ClassLoader loader = loadClass != null ? loadClass.getClassLoader() : null; bundle == null && loader != null; loader = bundle != null || !checkParents ? null : loader.getParent())
            try {
                bundle = ResourceBundle.getBundle(name, locale, loader);
                continue;
            } catch (MissingResourceException e) {
                if (ex == null)
                    ex = e;
            }

        if (bundle == null)
            try {
                bundle = ResourceBundle.getBundle(name, locale);
            } catch (MissingResourceException e) {
                if (ex == null)
                    ex = e;
            }
        if (bundle != null)
            return bundle;
        else
            throw ex;
    }
}
