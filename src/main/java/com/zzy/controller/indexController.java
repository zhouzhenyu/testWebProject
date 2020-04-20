package com.zzy.controller;

import com.zzy.service.impl.IndexServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This is Description
 *
 * @author 周振宇
 * @date 2020/04/19
 */
@Controller
@RequestMapping("/index")
public class indexController {

    @Autowired
    private IndexServiceImpl indexService;

    @RequestMapping
    public String index(){
        return "index";
    }

    @RequestMapping("aa")
    public String index(String a, Model model){
        model.addAttribute("m","dasdfa");
        return "index";
    }

    @RequestMapping("bb")
    public String index2(String b, Model model){
        model.addAttribute("m",indexService.index(b));
        return "index";
    }

    public IndexServiceImpl getIndexService() {
        return indexService;
    }

    public void setIndexService(IndexServiceImpl indexService) {
        this.indexService = indexService;
    }
}
