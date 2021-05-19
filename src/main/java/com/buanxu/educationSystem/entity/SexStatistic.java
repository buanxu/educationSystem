package com.buanxu.educationSystem.entity;

import java.io.Serializable;

public class SexStatistic implements Serializable {
    private String sex;
    private Integer number;

    public SexStatistic() {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "SexStatistic{" +
                "sex='" + sex + '\'' +
                ", number=" + number +
                '}';
    }
}
