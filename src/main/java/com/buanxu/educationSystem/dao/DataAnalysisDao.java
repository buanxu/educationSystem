package com.buanxu.educationSystem.dao;

import com.buanxu.educationSystem.entity.MonthIncome;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DataAnalysisDao {
    /**
     * 查询每个月的订单和总收入
     * @return
     */
    public List<MonthIncome> findMonthIncome();
}
