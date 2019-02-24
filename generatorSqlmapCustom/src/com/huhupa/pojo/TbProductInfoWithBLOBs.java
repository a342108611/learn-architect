package com.huhupa.pojo;

public class TbProductInfoWithBLOBs extends TbProductInfo {
    private String introduce;

    private String extrattribute;

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getExtrattribute() {
        return extrattribute;
    }

    public void setExtrattribute(String extrattribute) {
        this.extrattribute = extrattribute == null ? null : extrattribute.trim();
    }
}