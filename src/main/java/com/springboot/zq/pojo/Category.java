package com.springboot.zq.pojo;

import lombok.ToString;

@ToString
public class Category {
    private String contentId;

    private String contentName;

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId == null ? null : contentId.trim();
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName == null ? null : contentName.trim();
    }
}