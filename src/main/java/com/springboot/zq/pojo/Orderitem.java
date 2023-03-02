package com.springboot.zq.pojo;

public class Orderitem {
    private Integer orderdetailId;

    private Integer productId;

    private Integer orderId;

    private Integer orderdetailPnum;

    public Integer getOrderdetailId() {
        return orderdetailId;
    }

    public void setOrderdetailId(Integer orderdetailId) {
        this.orderdetailId = orderdetailId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderdetailPnum() {
        return orderdetailPnum;
    }

    public void setOrderdetailPnum(Integer orderdetailPnum) {
        this.orderdetailPnum = orderdetailPnum;
    }
}