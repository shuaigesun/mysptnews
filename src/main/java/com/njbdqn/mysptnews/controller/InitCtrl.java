package com.njbdqn.mysptnews.controller;

import com.github.pagehelper.PageInfo;
import com.njbdqn.mysptnews.service.NewsDetailService;
import com.njbdqn.mysptnews.vo.NewsDetail;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@CrossOrigin("*")
public class InitCtrl {
    @Resource
    private NewsDetailService newsDetailService;

//    @InitBinder
//    public void dateHandler(WebDataBinder wdb) {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        sdf.setLenient(true);
//        wdb.registerCustomEditor(Date.class,new CustomDateEditor(sdf,true));
//    }

    @RequestMapping("/search")
    public PageInfo<NewsDetail> init(@RequestParam(defaultValue = "1",required = false) int cp,
                                     String title){
        return newsDetailService.getBean(cp,title);
    }
}
