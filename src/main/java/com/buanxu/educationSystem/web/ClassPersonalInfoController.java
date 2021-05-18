package com.buanxu.educationSystem.web;

import com.buanxu.educationSystem.entity.CRUDResult;
import com.buanxu.educationSystem.entity.CourseOrder;
import com.buanxu.educationSystem.entity.PageResult;
import com.buanxu.educationSystem.entity.PersonalInfo;
import com.buanxu.educationSystem.service.IClassPersonalInfoService;
import com.buanxu.educationSystem.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/personalinfo")
public class ClassPersonalInfoController {
    @Autowired
    private IClassPersonalInfoService classPersonalInfoService;

    @RequestMapping("list")
    public String index(String classTable, Model model){//从前台获取要对哪个班级进行crud
        System.out.println("classTable="+classTable);
        model.addAttribute("classTable",classTable);
        return "/classPersonalinfo/list";
    }

    @RequestMapping("/add")
    public String add(){
        return "/classPersonalinfo/add";
    }

    @RequestMapping("/save")
    @ResponseBody
    public CRUDResult save(PersonalInfo studentInfo){
        CRUDResult crudResult=new CRUDResult();
        classPersonalInfoService.save(studentInfo);

        return crudResult;
    }


    @RequestMapping("/detail")
    public String detail(String studentNumber,String className,Model model){//查询某一学生的信息
        PersonalInfo studentInfo = classPersonalInfoService.findByStudentNumber(studentNumber, className);
        model.addAttribute("studentInfo",studentInfo);
        return "/classPersonalinfo/studentInfo";
    }

    @RequestMapping("/listJson")
    @ResponseBody
    public PageResult<PersonalInfo> listJson(String classTable, PersonalInfo condition, int page, int limit){//layui传来的参数用来做分页
        System.out.println(page);
        System.out.println(limit);
        System.out.println(condition);
        System.out.println("classTable："+classTable);
        PageResult<PersonalInfo> result=classPersonalInfoService.findPageResult(classTable, condition, page, limit);
        System.out.println(result.getData().get(0));

        return result;
    }
}