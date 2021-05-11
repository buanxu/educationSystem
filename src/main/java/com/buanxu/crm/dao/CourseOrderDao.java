package com.buanxu.crm.dao;

import com.buanxu.crm.entity.CourseOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

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
}
