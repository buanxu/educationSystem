package com.buanxu.educationSystem.entity;

import java.io.Serializable;

public class AreaStatistic implements Serializable {
    private String area;
    private Integer number;

    public AreaStatistic() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "AreaStatistic{" +
                "area='" + area + '\'' +
                ", number=" + number +
                '}';
    }
}
