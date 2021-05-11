package com.buanxu.crm.web;

import com.buanxu.crm.entity.CourseOrder;
import com.buanxu.crm.entity.PageResult;
import com.buanxu.crm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public PageResult<CourseOrder> listJson(int page,int limit){//layui传来的参数用来做分页
        System.out.println(page);
        System.out.println(limit);
        PageResult<CourseOrder> result=courseOrderService.findPageResult(null, page, limit);

        return result;
    }
}
