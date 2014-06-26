// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   FileItem.java

package com.jd.open.api.sdk;

import com.jd.open.api.sdk.internal.util.JdUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileItem {

    public FileItem(File file) {
        this.file = file;
    }

    public FileItem(String filePath) {
        this(new File(filePath));
    }

    public FileItem(String fileName, byte content[]) {
        this.fileName = fileName;
        this.content = content;
    }

    public FileItem(String fileName, byte content[], String mimeType) {
        this(fileName, content);
        this.mimeType = mimeType;
    }

    public String getFileName() {
        if (fileName == null && file != null && file.exists())
            fileName = file.getName();
        return fileName;
    }

    public String getMimeType()
            throws IOException {
        if (mimeType == null)
            mimeType = JdUtils.getMimeType(getContent());
        return mimeType;
    }

    public byte[] getContent()
            throws IOException {
        return Files.readAllBytes(Paths.get(file.toURI()));
    }

    private String fileName;
    private String mimeType;
    private byte content[];
    private File file;
}
