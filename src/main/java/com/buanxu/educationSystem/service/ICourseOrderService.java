package com.buanxu.educationSystem.service;

import com.buanxu.educationSystem.entity.CourseOrder;
import com.buanxu.educationSystem.entity.PageResult;

public interface ICourseOrderService {
    public PageResult<CourseOrder> findPageResult(CourseOrder condition,int page,int pageSize);

    public void save(CourseOrder courseOrder);

    public CourseOrder findByCourseId(String orderId);

    public void delete(String orderId);

    public void update(CourseOrder courseOrder);
}
