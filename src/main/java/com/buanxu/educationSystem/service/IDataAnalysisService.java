package com.buanxu.educationSystem.service;

import com.buanxu.educationSystem.entity.AreaStatistic;
import com.buanxu.educationSystem.entity.ClassStudentNumber;
import com.buanxu.educationSystem.entity.SexStatistic;

import java.util.List;

public interface IDataAnalysisService {

    public List<ClassStudentNumber> findClassStudentNumber();

    public List<AreaStatistic> findAreaStatistic();

    public List<SexStatistic> findSexStatistic();



}
