// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CategoryAttributeSearchResponse.java

package com.jd.open.api.sdk.response.category;

import com.jd.open.api.sdk.response.AbstractResponse;

import java.util.List;

public class CategoryAttributeSearchResponse extends AbstractResponse {
    public static class Attribute {

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public long getAid() {
            return aid;
        }

        public void setAid(long aid) {
            this.aid = aid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean getKeyProp() {
            return isKeyProp;
        }

        public void setKeyProp(boolean keyProp) {
            isKeyProp = keyProp;
        }

        public boolean getSaleProp() {
            return isSaleProp;
        }

        public void setSaleProp(boolean saleProp) {
            isSaleProp = saleProp;
        }

        public boolean isColorProp() {
            return isColorProp;
        }

        public void setColorProp(boolean colorProp) {
            isColorProp = colorProp;
        }

        public boolean isSizeProp() {
            return isSizeProp;
        }

        public void setSizeProp(boolean sizeProp) {
            isSizeProp = sizeProp;
        }

        public long getIndexId() {
            return indexId;
        }

        public void setIndexId(long indexId) {
            this.indexId = indexId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getAttType() {
            return attType;
        }

        public void setAttType(String attType) {
            this.attType = attType;
        }

        public long getInputType() {
            return inputType;
        }

        public void setInputType(long inputType) {
            this.inputType = inputType;
        }

        public String getOptions() {
            return options;
        }

        public void setOptions(String options) {
            this.options = options;
        }

        public String getReq() {
            return isReq;
        }

        public void setReq(String req) {
            isReq = req;
        }

        public String getFet() {
            return isFet;
        }

        public void setFet(String fet) {
            isFet = fet;
        }

        public String getNav() {
            return isNav;
        }

        public void setNav(String nav) {
            isNav = nav;
        }

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        private long aid;
        private String name;
        private boolean isKeyProp;
        private boolean isColorProp;
        private boolean isSizeProp;
        private boolean isSaleProp;
        private long indexId;
        private String status;
        private String attType;
        private long inputType;
        private String options;
        private String isReq;
        private String isFet;
        private String isNav;
        private String cid;
        private String groupId;

        public Attribute() {
        }
    }


    public CategoryAttributeSearchResponse() {
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List getAttributes() {
        return attributes;
    }

    public void setAttributes(List attributes) {
        this.attributes = attributes;
    }

    private List attributes;
    private int total;
}
