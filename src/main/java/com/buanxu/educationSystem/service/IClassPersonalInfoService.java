package com.buanxu.educationSystem.service;

import com.buanxu.educationSystem.entity.CourseTable;
import com.buanxu.educationSystem.entity.PageResult;
import com.buanxu.educationSystem.entity.PersonalInfo;

public interface IClassPersonalInfoService {
    public PageResult<PersonalInfo> findPageResult(String classTable,PersonalInfo condition, int page, int pageSize);

    public void save(PersonalInfo personalInfo);

    public PersonalInfo findByStudentNumber(String studentNumber, String className);

    public void  delete(String studentNumber,String classNumber);

    public void update(PersonalInfo personalInfo);

    public PageResult<CourseTable> findPersonalCourse(String className,int page, int limit);




    /*public void save(CourseOrder courseOrder);

    public CourseOrder findByCourseId(String orderId);

    public void delete(String orderId);

    public void update(CourseOrder courseOrder);*/
}
