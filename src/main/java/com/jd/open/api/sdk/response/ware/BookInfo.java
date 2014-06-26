// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BookInfo.java

package com.jd.open.api.sdk.response.ware;

import java.io.Serializable;

public class BookInfo
        implements Serializable {

    public BookInfo() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setFirstCategory(Integer firstCategory) {
        this.firstCategory = firstCategory;
    }

    public Integer getFirstCategory() {
        return firstCategory;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getIssn() {
        return issn;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setForeignBookName(String foreignBookName) {
        this.foreignBookName = foreignBookName;
    }

    public String getForeignBookName() {
        return foreignBookName;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setEditer(String editer) {
        this.editer = editer;
    }

    public String getEditer() {
        return editer;
    }

    public void setProofreader(String proofreader) {
        this.proofreader = proofreader;
    }

    public String getProofreader() {
        return proofreader;
    }

    public void setRemarker(String remarker) {
        this.remarker = remarker;
    }

    public String getRemarker() {
        return remarker;
    }

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    public String getTransfer() {
        return transfer;
    }

    public void setDrawer(String drawer) {
        this.drawer = drawer;
    }

    public String getDrawer() {
        return drawer;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public String getPublishers() {
        return publishers;
    }

    public void setPublishNo(String publishNo) {
        this.publishNo = publishNo;
    }

    public String getPublishNo() {
        return publishNo;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

    public String getPackages() {
        return packages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPages() {
        return pages;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPrintNo(int printNo) {
        this.printNo = printNo;
    }

    public int getPrintNo() {
        return printNo;
    }

    public void setPrintTime(String printTime) {
        this.printTime = printTime;
    }

    public String getPrintTime() {
        return printTime;
    }

    public void setSizeAndHeight(String sizeAndHeight) {
        this.sizeAndHeight = sizeAndHeight;
    }

    public String getSizeAndHeight() {
        return sizeAndHeight;
    }

    public void setChinaCatalog(String chinaCatalog) {
        this.chinaCatalog = chinaCatalog;
    }

    public String getChinaCatalog() {
        return chinaCatalog;
    }

    public void setSheet(String sheet) {
        this.sheet = sheet;
    }

    public String getSheet() {
        return sheet;
    }

    public void setPapers(String papers) {
        this.papers = papers;
    }

    public String getPapers() {
        return papers;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachmentNum(int attachmentNum) {
        this.attachmentNum = attachmentNum;
    }

    public int getAttachmentNum() {
        return attachmentNum;
    }

    public void setPackNum(int packNum) {
        this.packNum = packNum;
    }

    public int getPackNum() {
        return packNum;
    }

    public void setLetters(int letters) {
        this.letters = letters;
    }

    public int getLetters() {
        return letters;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setPickState(String pickState) {
        this.pickState = pickState;
    }

    public String getPickState() {
        return pickState;
    }

    public void setCompile(String compile) {
        this.compile = compile;
    }

    public String getCompile() {
        return compile;
    }

    public void setPhotography(String photography) {
        this.photography = photography;
    }

    public String getPhotography() {
        return photography;
    }

    public void setDictation(String dictation) {
        this.dictation = dictation;
    }

    public String getDictation() {
        return dictation;
    }

    public void setRead(String read) {
        this.read = read;
    }

    public String getRead() {
        return read;
    }

    public void setFinishing(String finishing) {
        this.finishing = finishing;
    }

    public String getFinishing() {
        return finishing;
    }

    public void setWrite(String write) {
        this.write = write;
    }

    public String getWrite() {
        return write;
    }

    private String id;
    private Integer firstCategory;
    private String isbn;
    private String issn;
    private String bookName;
    private String foreignBookName;
    private String language;
    private String author;
    private String editer;
    private String proofreader;
    private String remarker;
    private String transfer;
    private String drawer;
    private String publishers;
    private String publishNo;
    private String series;
    private String brand;
    private String format;
    private String packages;
    private String pages;
    private String batchNo;
    private String publishTime;
    private int printNo;
    private String printTime;
    private String sizeAndHeight;
    private String chinaCatalog;
    private String sheet;
    private String papers;
    private String attachment;
    private int attachmentNum;
    private int packNum;
    private int letters;
    private String barCode;
    private String keywords;
    private String pickState;
    private String compile;
    private String photography;
    private String dictation;
    private String read;
    private String finishing;
    private String write;
}
