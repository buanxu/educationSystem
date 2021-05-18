package com.buanxu.educationSystem.web;

import com.buanxu.educationSystem.entity.CRUDResult;
import com.buanxu.educationSystem.entity.PageResult;
import com.buanxu.educationSystem.entity.PersonalInfo;
import com.buanxu.educationSystem.service.IClassPersonalInfoService;
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
        model.addAttribute("classTable",classTable);
        return "/classPersonalinfo/list";
    }

    @RequestMapping("/add")
    public String add(){
        return "/classPersonalinfo/add";
    }

    @RequestMapping("/save")
    @ResponseBody
    public CRUDResult save(PersonalInfo studentInfo){//插入数据和修改数据都请求该方法
        System.out.println("id="+studentInfo.getId());
        CRUDResult crudResult=new CRUDResult();
        if(studentInfo.getId()==null){//插入数据的时候id是null
            classPersonalInfoService.save(studentInfo);
        }else {//id不为null，则表示修改数据
            classPersonalInfoService.update(studentInfo);
        }

        return crudResult;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public CRUDResult delete(String studentNumber,String className){
        CRUDResult crudResult=new CRUDResult();
        classPersonalInfoService.delete(studentNumber, className);

        return crudResult;
    }

    @RequestMapping("/update")
    public String update(String studentNumber,String className,Model model){
        PersonalInfo studentInfo = classPersonalInfoService.findByStudentNumber(studentNumber, className);
        System.out.println("studentInfo:"+studentInfo);
        model.addAttribute("studentInfo",studentInfo);

        return "/classPersonalinfo/update";
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
        PageResult<PersonalInfo> result=classPersonalInfoService.findPageResult(classTable, condition, page, limit);
        return result;
    }
}