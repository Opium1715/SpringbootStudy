package com.springboot.zq.pojo;

public class Cartitem {
    private Integer cartitemId;

    private Integer userId;

    private Integer productId;

    private Integer cartitemPnum;

    public Integer getCartitemId() {
        return cartitemId;
    }

    public void setCartitemId(Integer cartitemId) {
        this.cartitemId = cartitemId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCartitemPnum() {
        return cartitemPnum;
    }

    public void setCartitemPnum(Integer cartitemPnum) {
        this.cartitemPnum = cartitemPnum;
    }
}