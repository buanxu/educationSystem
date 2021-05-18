package com.buanxu.educationSystem.service.impl;

import com.buanxu.educationSystem.dao.MajorCourseDao;
import com.buanxu.educationSystem.entity.CourseTable;
import com.buanxu.educationSystem.entity.PageResult;
import com.buanxu.educationSystem.service.IMajorCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MajorCourseServiceImpl implements IMajorCourseService {

    @Autowired
    private MajorCourseDao majorCourseDao;

    @Override
    public PageResult<CourseTable> findMajorCourse(String majorCourse) {
        PageResult<CourseTable> pageResult=new PageResult<CourseTable>();

        int count = majorCourseDao.findCountOfCourse(majorCourse);
        List<CourseTable> courseList = majorCourseDao.findMajorCourse(majorCourse);

        pageResult.setCode(0);
        pageResult.setData(courseList);
        pageResult.setCount(count);

        return pageResult;
    }
}
