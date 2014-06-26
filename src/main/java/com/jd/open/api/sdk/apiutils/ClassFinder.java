package com.jd.open.api.sdk.apiutils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by pingjiang on 14-6-26.
 *
 * http://stackoverflow.com/questions/15519626/how-to-get-all-classes-names-in-a-package
 *
 * List<Class<?>> classes = ClassFinder.find("com.package");
 */
public final class ClassFinder {

    private final static char DOT = '.';
    private final static char SLASH = '/';
    private final static String CLASS_SUFFIX = ".class";
    private final static String BAD_PACKAGE_ERROR = "Unable to get resources from path '%s'. Are you sure the given '%s' package exists?";

    public final static List<String> findPackages(final String scannedPackage) {
        final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        final String scannedPath = scannedPackage.replace(DOT, SLASH);
        final Enumeration<URL> resources;
        try {
            resources = classLoader.getResources(scannedPath);
        } catch (IOException e) {
            throw new IllegalArgumentException(String.format(BAD_PACKAGE_ERROR, scannedPath, scannedPackage), e);
        }
        final List<String> pkgs = new LinkedList<String>();
        while (resources.hasMoreElements()) {
            final File file = new File(resources.nextElement().getFile());
            pkgs.addAll(findPackages(file, scannedPackage));
        }
        return pkgs;
    }

    private final static List<String> findPackages(final File file, final String scannedPackage) {
        final List<String> pkgs = new LinkedList<String>();
        if (!file.isDirectory()) {
            return pkgs;
        }

        final String resource = scannedPackage + DOT + file.getName();
        pkgs.add(resource);
        for (File nestedFile : file.listFiles()) {
            pkgs.addAll(findPackages(nestedFile, scannedPackage));
        }

        return pkgs;
    }

    public final static List<Class<?>> find(final String scannedPackage, final Class<?> abstractClass) {
        final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        final String scannedPath = scannedPackage.replace(DOT, SLASH);
        final Enumeration<URL> resources;
        try {
            resources = classLoader.getResources(scannedPath);
        } catch (IOException e) {
            throw new IllegalArgumentException(String.format(BAD_PACKAGE_ERROR, scannedPath, scannedPackage), e);
        }
        final List<Class<?>> classes = new LinkedList<Class<?>>();
        while (resources.hasMoreElements()) {
            URL url = resources.nextElement();
            //System.out.println("Found: " + url);
            final File file = new File(url.getFile());
            classes.addAll(find(file, scannedPackage, abstractClass));
        }
        return classes;
    }

    /**
     * 递归的查找包下面所有的类
     *
     * @param file 当前路径
     * @param abstractClass 实现的接口
     * @return 所有找到的类
     */
    private final static List<Class<?>> find(final File file, final String scannedPackage, final Class<?> abstractClass) {
        final List<Class<?>> classes = new LinkedList<Class<?>>();
        String filePath = file.getPath();
        //System.out.println("find file: " + filePath);
        if (file.isDirectory()) {
            for (File nestedFile : file.listFiles()) {
                classes.addAll(find(nestedFile, scannedPackage, abstractClass));
            }
        } else if (filePath.endsWith(CLASS_SUFFIX)) {
            final int beginIndex = 0;
            final int endIndex = filePath.length() - CLASS_SUFFIX.length();
            String className = filePath.substring(beginIndex, endIndex).replace(SLASH, DOT);
            int pos = className.indexOf(scannedPackage);
            if (pos != -1) {
                className = className.substring(pos);
            }
            //System.out.println("package name: " + filePath + " => " + className);
            try {
                Class<?> clz = Class.forName(className);
                if (abstractClass == null || hasImplemented(clz, abstractClass)) {
                    classes.add(clz);
                }

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return classes;
    }

    private static boolean hasImplemented(Class<?> clz, Class<?> interfaceClz) {
        //System.out.println(clz.getName() + " #" + clz.getInterfaces().length);
        for (Class<?> iclz : clz.getInterfaces()) {
            //System.out.println(clz.getName() + " implements " + iclz.getName());
            if (iclz == interfaceClz || iclz.equals(interfaceClz)) {
                return true;
            }
        }

        return false;
    }
}