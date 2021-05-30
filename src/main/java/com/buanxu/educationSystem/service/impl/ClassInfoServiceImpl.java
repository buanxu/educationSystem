package com.buanxu.educationSystem.service.impl;

import com.buanxu.educationSystem.dao.ClassInfoDao;
import com.buanxu.educationSystem.entity.ClassInfo;
import com.buanxu.educationSystem.entity.CourseTable;
import com.buanxu.educationSystem.entity.PageResult;
import com.buanxu.educationSystem.service.IClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClassInfoServiceImpl implements IClassInfoService {

    @Autowired
    private ClassInfoDao classInfoDao;

    @Override
    public PageResult<ClassInfo> findClassInfo(String className) {
        PageResult<ClassInfo> pageResult=new PageResult<ClassInfo>();

        List<ClassInfo> classInfo = classInfoDao.findClassInfo(className);
        System.out.println(classInfo);

        pageResult.setData(classInfo);
        pageResult.setCount(1);
        pageResult.setCode(0);

        return pageResult;
    }
}
