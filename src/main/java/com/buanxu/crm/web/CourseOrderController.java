package com.buanxu.crm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("courseOrder")
public class CourseOrderController {

    @RequestMapping("/list")
    public String index(){
        return "courseOrder/list";
    }
}
