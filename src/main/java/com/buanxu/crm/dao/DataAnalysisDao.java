package com.buanxu.crm.dao;

import com.buanxu.crm.entity.CourseOrder;
import com.buanxu.crm.entity.MonthIncome;
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
