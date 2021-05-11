package com.buanxu.crm.web;

import com.buanxu.crm.entity.CourseOrder;
import com.buanxu.crm.entity.PageResult;
import com.buanxu.crm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/courseOrder")
public class CourseOrderController {

    @Autowired
    private ICourseOrderService courseOrderService;

    @RequestMapping("/list")
    public String index(){
        return "courseOrder/list";
    }

    @RequestMapping("/listJson")
    @ResponseBody
    public PageResult<CourseOrder> listJson(){
        PageResult<CourseOrder> result=courseOrderService.findPageResult(null, 1, 8);

        return result;
    }
}
