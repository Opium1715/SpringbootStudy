package com.springboot.zq.pojo;

import lombok.ToString;

@ToString
public class Merchant {
    private Integer mercId;

    private String mercName;

    private String mercAddress;

    private String mercPassword;

    private String mercEmail;

    private String mercPhone;

    private String mercProxy;

    private String mercImg;

    public Integer getMercId() {
        return mercId;
    }

    public void setMercId(Integer mercId) {
        this.mercId = mercId;
    }

    public String getMercName() {
        return mercName;
    }

    public void setMercName(String mercName) {
        this.mercName = mercName == null ? null : mercName.trim();
    }

    public String getMercAddress() {
        return mercAddress;
    }

    public void setMercAddress(String mercAddress) {
        this.mercAddress = mercAddress == null ? null : mercAddress.trim();
    }

    public String getMercPassword() {
        return mercPassword;
    }

    public void setMercPassword(String mercPassword) {
        this.mercPassword = mercPassword == null ? null : mercPassword.trim();
    }

    public String getMercEmail() {
        return mercEmail;
    }

    public void setMercEmail(String mercEmail) {
        this.mercEmail = mercEmail == null ? null : mercEmail.trim();
    }

    public String getMercPhone() {
        return mercPhone;
    }

    public void setMercPhone(String mercPhone) {
        this.mercPhone = mercPhone == null ? null : mercPhone.trim();
    }

    public String getMercProxy() {
        return mercProxy;
    }

    public void setMercProxy(String mercProxy) {
        this.mercProxy = mercProxy == null ? null : mercProxy.trim();
    }

    public String getMercImg() {
        return mercImg;
    }

    public void setMercImg(String mercImg) {
        this.mercImg = mercImg == null ? null : mercImg.trim();
    }
}