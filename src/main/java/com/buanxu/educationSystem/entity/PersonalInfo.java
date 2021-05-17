package com.buanxu.educationSystem.entity;


import java.io.Serializable;
import java.util.Date;

public class PersonalInfo implements Serializable {
    private int id;
    private String studentNumber;
    private String name;
    private String phone;
    private String age;
    private String sex;
    private String address;
    private Date birthday;
    private String course="个人课程";

    public PersonalInfo() {
    }

    public PersonalInfo(int id, String studentNumber, String name, String phone, String age, String sex, String address, Date birthday) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public Date getDate() {
        return birthday;
    }

    public void setDate(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "id=" + id +
                ", studentNumber='" + studentNumber + '\'' +
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

