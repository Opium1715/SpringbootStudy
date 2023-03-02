package com.springboot.zq.pojo;

import lombok.ToString;

import java.math.BigDecimal;
@ToString
public class Product {
    private Integer productId;

    private Integer categoryId;

    private String productName;

    private BigDecimal productPrice;

    private String productImg;

    private Integer mercId;

    private Integer productStock;

    private Merchant merchant;

    private Category category;



    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg == null ? null : productImg.trim();
    }

    public Integer getMercId() {
        return mercId;
    }

    public void setMercId(Integer mercId) {
        this.mercId = mercId;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }
}