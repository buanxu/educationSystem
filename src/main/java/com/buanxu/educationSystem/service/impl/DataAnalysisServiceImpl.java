package com.buanxu.educationSystem.service.impl;

import com.buanxu.educationSystem.dao.DataAnalysisDao;
import com.buanxu.educationSystem.entity.AreaStatistic;
import com.buanxu.educationSystem.entity.ClassStudentNumber;
import com.buanxu.educationSystem.entity.SexStatistic;
import com.buanxu.educationSystem.service.IDataAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DataAnalysisServiceImpl implements IDataAnalysisService {

    @Autowired
    private DataAnalysisDao dataAnalysisDao;

    @Override
    public List<ClassStudentNumber> findClassStudentNumber() {
        return dataAnalysisDao.findClassStudentNumber();
    }

    @Override
    public List<AreaStatistic> findAreaStatistic() {
        return dataAnalysisDao.findAreaStatistic();
    }

    @Override
    public List<SexStatistic> findSexStatistic() {
        return dataAnalysisDao.findSexStatistic();
    }
}
