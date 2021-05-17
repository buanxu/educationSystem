package com.buanxu.educationSystem.service;

import com.buanxu.educationSystem.entity.CourseOrder;
import com.buanxu.educationSystem.entity.PageResult;
import com.buanxu.educationSystem.entity.PersonalInfo;

public interface IClassPersonalInfoService {
    public PageResult<PersonalInfo> findPageResult(String classTable,PersonalInfo condition, int page, int pageSize);

    /*public void save(CourseOrder courseOrder);

    public CourseOrder findByCourseId(String orderId);

    public void delete(String orderId);

    public void update(CourseOrder courseOrder);*/
}
