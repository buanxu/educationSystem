package com.buanxu.educationSystem.service.impl;

import com.buanxu.educationSystem.dao.DataAnalysisDao;
import com.buanxu.educationSystem.entity.MonthIncome;
import com.buanxu.educationSystem.service.DataAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DataAnalysisServiceImpl implements DataAnalysisService {

    @Autowired
    private DataAnalysisDao dataAnalysisDao;

    @Override
    public List<MonthIncome> findMonthIncome() {
        return dataAnalysisDao.findMonthIncome();
    }
}
