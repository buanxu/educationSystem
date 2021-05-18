package com.buanxu.educationSystem.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class PersonalInfo implements Serializable {
    private int id;
    private String studentNumber;
    private String className;
    private String name;
    private String phone;
    private String age;
    private String sex;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String course="个人课程";

    public PersonalInfo() {
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "id=" + id +
                ", studentNumber='" + studentNumber + '\'' +
                ", className='" + className + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", course='" + course + '\'' +
                '}';
    }
}

