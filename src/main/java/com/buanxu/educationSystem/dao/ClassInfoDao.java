package com.buanxu.educationSystem.dao;

import com.buanxu.educationSystem.entity.ClassInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ClassInfoDao {
    /**
     * 查询班级信息
     * @param className
     * @return
     */
    public List<ClassInfo> findClassInfo(String className);
}
