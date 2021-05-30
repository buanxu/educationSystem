package com.buanxu.educationSystem.web;

import com.buanxu.educationSystem.entity.AreaStatistic;
import com.buanxu.educationSystem.entity.ClassStudentNumber;
import com.buanxu.educationSystem.entity.SexStatistic;
import com.buanxu.educationSystem.service.impl.DataAnalysisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/analysis")
public class DataAnalysisController {

    @Autowired
    private DataAnalysisServiceImpl dataAnalysisService;

    @RequestMapping("/index")
    public String index(String condition){
        switch(condition){
            case "地区分布":
                return "dataAnalysis/areaStatistic";
            case "班级人数统计":
                return "dataAnalysis/classStudentNumber";
            case "性别统计":
                return "dataAnalysis/sexStatistics";
        }
        return "dataAnalysis/error";
    }

    @RequestMapping("/classStudentNumber")
    @ResponseBody
    public List<ClassStudentNumber> classStudentNumber(){
        List<ClassStudentNumber> list = dataAnalysisService.findClassStudentNumber();
        return list;
    }

    @RequestMapping("/areaStatistic")
    @ResponseBody
    public List<AreaStatistic> areaStatistics(){
        List<AreaStatistic> list = dataAnalysisService.findAreaStatistic();
        return list;
    }

    @RequestMapping("/sexStatistic")
    @ResponseBody
    public List<SexStatistic> sexStatistic(){
        List<SexStatistic> list = dataAnalysisService.findSexStatistic();
        return list;
    }

}
