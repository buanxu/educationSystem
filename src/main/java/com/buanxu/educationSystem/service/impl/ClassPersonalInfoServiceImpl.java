package com.buanxu.educationSystem.service.impl;

import com.buanxu.educationSystem.dao.ClassPersonalInfoDao;
import com.buanxu.educationSystem.entity.PageResult;
import com.buanxu.educationSystem.entity.PersonalInfo;
import com.buanxu.educationSystem.service.IClassPersonalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ClassPersonalInfoServiceImpl implements IClassPersonalInfoService {

    @Autowired
    private ClassPersonalInfoDao classPersonalInfoDao;

    @Override
    public PageResult<PersonalInfo> findPageResult(String classTable, PersonalInfo condition, int page, int pageSize) {
        PageResult<PersonalInfo> result=new PageResult<PersonalInfo>();
        result.setCode(0);

        //把查询的条件都封装在map里
        Map<String,Object> params= new HashMap<String, Object>();
        params.put("classTable",classTable);
        params.put("condition",condition);
        params.put("startIndex", (page-1)*pageSize);
        params.put("pageSize", pageSize);

        //把查询到的list数据封装到模型里
        List<PersonalInfo> personalInfos = classPersonalInfoDao.finListByMap(params);
        result.setData(personalInfos);

        //把查询到的记录数封装到模型里
        int counts = classPersonalInfoDao.findCountByMap(params);
        result.setCount(counts);

        return result;
    }

    @Override
    public void save(PersonalInfo personalInfo) {
        classPersonalInfoDao.save(personalInfo);
    }

    @Override
    public PersonalInfo findByStudentNumber(String studentNumber, String className) {
        return classPersonalInfoDao.findByStudentNumber(studentNumber,className);
    }

    @Override
    public void delete(String studentNumber, String classNumber) {
        //把删除学生所需要的班级和学号信息封装在map里
        /*Map<String,Object> params=new HashMap<String, Object>();
        params.put("studentNumber",studentNumber);
        params.put("classNumber",classNumber);
        classPersonalInfoDao.delete(params);*/

        classPersonalInfoDao.delete(studentNumber, classNumber);
    }

    @Override
    public void update(PersonalInfo personalInfo) {
        classPersonalInfoDao.update(personalInfo);
    }


}
