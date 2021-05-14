package com.buanxu.crm.web;

import com.buanxu.crm.entity.MonthIncome;
import com.buanxu.crm.service.DataAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/analysis")
public class DataAnalysisController {

    @Autowired
    private DataAnalysisService dataAnalysisService;

    @RequestMapping("/income")
    public String income(){
        return "/dataAnalysis/income";
    }

    @RequestMapping("/monthIncome")
    @ResponseBody
    public List<MonthIncome> monthIncome(){
        return dataAnalysisService.findMonthIncome();
    }
}
