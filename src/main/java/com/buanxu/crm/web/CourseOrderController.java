package com.buanxu.crm.web;

import com.buanxu.crm.entity.CRUDResult;
import com.buanxu.crm.entity.CourseOrder;
import com.buanxu.crm.entity.PageResult;
import com.buanxu.crm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping("/add")
    public String add(){
        return "courseOrder/add";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public CRUDResult delete(String order_id){
        CRUDResult crudResult=new CRUDResult();
        courseOrderService.delete(order_id);

        return crudResult;
    }

    @RequestMapping("/update")
    public String update(Model model,String order_id){
        CourseOrder courseOrder = courseOrderService.findByCourseId(order_id);
        model.addAttribute("courseOrder", courseOrder);
        return "courseOrder/update";
    }

    @RequestMapping("/detail")
    public String detail(Model model,String order_id) {
        CourseOrder courseOrder = courseOrderService.findByCourseId(order_id);
        model.addAttribute("courseOrder", courseOrder);
        return "courseOrder/orderDetail";
    }

    @RequestMapping("/save")
    @ResponseBody
    public CRUDResult save(CourseOrder order){
        CRUDResult result=new CRUDResult();

        if (order.getOrder_id()==null){//插入数据
            courseOrderService.save(order);
        }else{//修改数据
            courseOrderService.update(order);
        }
        System.out.println(order);
        return result;
    }

    @RequestMapping("/listJson")
    @ResponseBody
    public PageResult<CourseOrder> listJson(CourseOrder condition,int page,int limit){//layui传来的参数用来做分页
        System.out.println(page);
        System.out.println(limit);
        System.out.println(condition);
        PageResult<CourseOrder> result=courseOrderService.findPageResult(condition, page, limit);

        return result;
    }


}
