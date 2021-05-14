package com.buanxu.crm.service.impl;

import com.buanxu.crm.dao.DataAnalysisDao;
import com.buanxu.crm.entity.MonthIncome;
import com.buanxu.crm.service.DataAnalysisService;
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
