package com.buanxu.educationSystem.service;

import com.buanxu.educationSystem.entity.ClassInfo;
import com.buanxu.educationSystem.entity.CourseTable;
import com.buanxu.educationSystem.entity.PageResult;

public interface IClassInfoService {

    public PageResult<ClassInfo> findClassInfo(String className);
}
