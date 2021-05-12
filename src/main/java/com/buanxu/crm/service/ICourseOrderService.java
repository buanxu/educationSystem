package com.buanxu.crm.service;

import com.buanxu.crm.entity.CourseOrder;
import com.buanxu.crm.entity.PageResult;

public interface ICourseOrderService {
    public PageResult<CourseOrder> findPageResult(CourseOrder condition,int page,int pageSize);

    public void save(CourseOrder courseOrder);

    public CourseOrder findByCourseId(String orderId);

    public void delete(String orderId);

}
