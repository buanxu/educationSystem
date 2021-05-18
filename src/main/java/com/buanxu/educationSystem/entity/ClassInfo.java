package com.buanxu.educationSystem.entity;

import java.io.Serializable;

public class ClassInfo implements Serializable {
    private Integer class_id;
    private String class_name;
    private Integer student_number;
    private String monitor;
    private String counselor;

    public ClassInfo() {
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public Integer getStudent_number() {
        return student_number;
    }

    public void setStudent_number(Integer student_number) {
        this.student_number = student_number;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getCounselor() {
        return counselor;
    }

    public void setCounselor(String counselor) {
        this.counselor = counselor;
    }

    @Override
    public String toString() {
        return "ClassInfo{" +
                "class_id=" + class_id +
                ", class_name='" + class_name + '\'' +
                ", student_number=" + student_number +
                ", monitor='" + monitor + '\'' +
                ", counselor='" + counselor + '\'' +
                '}';
    }
}
