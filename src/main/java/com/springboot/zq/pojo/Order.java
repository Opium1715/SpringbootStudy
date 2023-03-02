package com.springboot.zq.pojo;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer userId;

    private String orderState;

    private Date orderCtime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    public Date getOrderCtime() {
        return orderCtime;
    }

    public void setOrderCtime(Date orderCtime) {
        this.orderCtime = orderCtime;
    }
}