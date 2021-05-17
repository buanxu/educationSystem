package com.buanxu.educationSystem.entity;

import java.io.Serializable;

public class MonthIncome implements Serializable {
    private String month;  //月份
    private String totalIncome;  //每月的总收入
    private String orders;      //每月的订单

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(String totalIncome) {
        this.totalIncome = totalIncome;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "MonthIncome{" +
                "month='" + month + '\'' +
                ", totalIncome='" + totalIncome + '\'' +
                ", orders='" + orders + '\'' +
                '}';
    }
}
