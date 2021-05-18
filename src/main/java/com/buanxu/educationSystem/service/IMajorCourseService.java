package com.buanxu.educationSystem.service;

import com.buanxu.educationSystem.entity.CourseTable;
import com.buanxu.educationSystem.entity.PageResult;

import java.util.List;

public interface IMajorCourseService {

    public PageResult<CourseTable> findMajorCourse(String majorCourse);

}
