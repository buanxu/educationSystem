package com.buanxu.educationSystem.dao;

import com.buanxu.educationSystem.entity.CourseTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface MajorCourseDao {
    /**
     * 查询课表中有几门课
     * @param majorCourse  专业名称
     * @return
     */
    public int findCountOfCourse(String majorCourse);

    /**
     * 查询课表
     * @param majorCourse 专业名称
     * @return
     */
    public List<CourseTable> findMajorCourse(String majorCourse);
}
