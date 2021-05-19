package com.buanxu.educationSystem.entity;

import java.io.Serializable;

public class ClassStudentNumber implements Serializable {
    private String className;
    private Integer number;

    public ClassStudentNumber() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "classStudentNumber{" +
                "className='" + className + '\'' +
                ", number=" + number +
                '}';
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
