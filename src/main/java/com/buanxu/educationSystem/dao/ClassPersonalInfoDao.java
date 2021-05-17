package com.buanxu.educationSystem.dao;

import com.buanxu.educationSystem.entity.CourseOrder;
import com.buanxu.educationSystem.entity.PersonalInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ClassPersonalInfoDao {
    /**
     * 查询有多少条记录
     * @param map 把查询的条件在业务层都一并封装到了map里
     * @return
     */
    public int findCountByMap(Map<String,Object> map);

    /**
     * 查询所有的记录并封装到list
     * @param map  把查询的条件在业务层都一并封装到了map里
     * @return
     */
    public List<PersonalInfo> finListByMap(Map<String,Object> map);
}
