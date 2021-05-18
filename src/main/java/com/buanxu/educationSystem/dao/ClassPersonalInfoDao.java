package com.buanxu.educationSystem.dao;

import com.buanxu.educationSystem.entity.CourseTable;
import com.buanxu.educationSystem.entity.PersonalInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ClassPersonalInfoDao {
    /**
     * 查询有多少条记录
     * @param map 把查询的条件在业务层都一并封装到了map里
     * @return
     */
    public int findCountByMap(Map<String,Object> map);

    /**
     * 查询所有的记录并封装到list
     * @param map  把查询的条件在业务层都一并封装到了map里
     * @return
     */
    public List<PersonalInfo> finListByMap(Map<String,Object> map);

    /**
     * 保存信息
     * @param personalInfo
     */
    public void save(PersonalInfo personalInfo);

    /**
     * 通过学号查询学生信息,且必须有班级
     * @param studentNumber
     * @param className
     * @return
     */
    public PersonalInfo findByStudentNumber(@Param("studentNumber") String studentNumber,@Param("className") String className);

    /**
     *把删除学生所需要的班级和学号信息封装在map里
     * 删除一条记录
     * @param
     */
    //public void delete(Map<String,Object> params);
    public void delete(@Param("studentNumber") String studentNumber,@Param("className") String className);

    /**
     * 修改学生信息
     * @param personalInfo
     */
    public void update(PersonalInfo personalInfo);

    /**
     * 查询课表中有几门课
     * @param className
     * @return
     */
    public int findCountOfCourse(@Param("className") String className);

    /**
     * 查询课表
     * @param params 封装了查询条件
     * @return
     */
    public List<CourseTable> findPersonalCourse(Map<String,Object> params);
}
