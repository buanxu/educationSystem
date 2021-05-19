package com.buanxu.educationSystem.dao;

import com.buanxu.educationSystem.entity.AreaStatistic;
import com.buanxu.educationSystem.entity.ClassStudentNumber;
import com.buanxu.educationSystem.entity.SexStatistic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
@Mapper
public interface DataAnalysisDao {
    /**
     * 查询各个班级的人数
     * @return
     */
    public List<ClassStudentNumber> findClassStudentNumber();

    /**
     * 查询各地区的人数
     * @return
     */
    public List<AreaStatistic> findAreaStatistic();

    /**
     * 查询男女各有多少人
     * @return
     */
    public List<SexStatistic> findSexStatistic();

}
