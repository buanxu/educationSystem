package com.buanxu.educationSystem.entity;

import java.io.Serializable;

public class CourseTable implements Serializable {
    private String course_id;
    private String course_name;
    private String teacher;
    private String address;
    private String date;
    private String start_end;
    private String investigation_exam;

    public CourseTable() {
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStart_end() {
        return start_end;
    }

    public void setStart_end(String start_end) {
        this.start_end = start_end;
    }

    public String getInvestigation_exam() {
        return investigation_exam;
    }

    public void setInvestigation_exam(String investigation_exam) {
        this.investigation_exam = investigation_exam;
    }

    @Override
    public String toString() {
        return "CourseTable{" +
                "course_id='" + course_id + '\'' +
                ", course_name='" + course_name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", address='" + address + '\'' +
                ", date='" + date + '\'' +
                ", start_end='" + start_end + '\'' +
                ", investigation_exam='" + investigation_exam + '\'' +
                '}';
    }
}
