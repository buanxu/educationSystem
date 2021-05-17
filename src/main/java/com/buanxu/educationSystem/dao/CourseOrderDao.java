package com.buanxu.educationSystem.dao;

import com.buanxu.educationSystem.entity.CourseOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface CourseOrderDao {
    /**
     * 查询有多少条记录
     * @param map
     * @return
     */
    public int findCountByMap(Map<String,Object> map);

    /**
     * 查询所有的记录并封装到list
     * @param map
     * @return
     */
    public List<CourseOrder> finListByMap(Map<String,Object> map);

    /**
     * 保存课程订单信息
     */
    public void save(CourseOrder courseOrder);

    /**
     * 通过课程id查询课程的订单信息
     */
    public CourseOrder findByCourseId(String orderId);

    /**
     * 删除某人的课程订单信息
     */
    public void delete(String orderId);

    /**
     * 修改订单信息
     */
    public void update(CourseOrder courseOrder);
}
