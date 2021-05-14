package com.buanxu.crm.service.impl;

import com.buanxu.crm.dao.CourseOrderDao;
import com.buanxu.crm.entity.CourseOrder;
import com.buanxu.crm.entity.PageResult;
import com.buanxu.crm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class CourseOrderServiceImpl implements ICourseOrderService {

    @Autowired
    private CourseOrderDao courseOrderDao;

    @Override
    public PageResult<CourseOrder> findPageResult(CourseOrder condition, int page, int pageSize) {
        PageResult<CourseOrder> result=new PageResult<CourseOrder>();
        result.setCode(0);

        Map<String,Object> params=new HashMap<>();
        params.put("condition", condition);
        params.put("page",(page-1)*pageSize);
        params.put("pageSize", pageSize);
        //查询有多少条记录
        int totalCount=courseOrderDao.findCountByMap(params);
        result.setCount(totalCount);

        //获取查询到的数据
        List<CourseOrder> list=courseOrderDao.finListByMap(params);
        result.setData(list);

        return result;
    }

    @Override
    public void save(CourseOrder courseOrder) {
        courseOrderDao.save(courseOrder);
    }

    @Override
    public CourseOrder findByCourseId(String orderId) {
        CourseOrder courseOrder = courseOrderDao.findByCourseId(orderId);
        return courseOrder;
    }

    @Override
    public void delete(String orderId) {
        courseOrderDao.delete(orderId);
    }

    @Override
    public void update(CourseOrder courseOrder) {
        courseOrderDao.update(courseOrder);
    }


}
