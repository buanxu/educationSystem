package com.buanxu.educationSystem.web;

import com.buanxu.educationSystem.entity.CourseTable;
import com.buanxu.educationSystem.entity.PageResult;
import com.buanxu.educationSystem.service.impl.MajorCourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/majorCourse")
@Controller
public class MajorCourseController {

    @Autowired
    private MajorCourseServiceImpl majorCourseService;

    @RequestMapping("/list")
    public String list(String majorCourse, Model model) {
        model.addAttribute("majorCourse", majorCourse);

        return "majorCourse/list";
    }

    @RequestMapping("/courseJson")
    @ResponseBody
    public PageResult<CourseTable> courseJson(String majorCourse) {
        PageResult<CourseTable> pageResult = new PageResult<CourseTable>();
        pageResult = majorCourseService.findMajorCourse(majorCourse);
        return pageResult;
    }
}
