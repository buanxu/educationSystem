package com.buanxu.educationSystem.web;

import com.buanxu.educationSystem.entity.ClassInfo;
import com.buanxu.educationSystem.entity.CourseTable;
import com.buanxu.educationSystem.entity.PageResult;
import com.buanxu.educationSystem.service.impl.ClassInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/classInfo")
@Controller
public class ClassInfoController {

    @Autowired
    private ClassInfoServiceImpl classInfoService;

    @RequestMapping("/list")
    public String list(String className, Model model){
        model.addAttribute("className",className);

        return "/classInfo/list";
    }

    @RequestMapping("/courseInfoJson")
    @ResponseBody
    public PageResult<ClassInfo> courseInfoJson(String className){
        PageResult<ClassInfo> pageResult=new PageResult<ClassInfo>();
        pageResult=classInfoService.findClassInfo(className);

        return pageResult;
    }
}
