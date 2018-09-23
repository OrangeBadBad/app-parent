package com.pzc.app.photoweb.controller;


import com.pzc.app.photoweb.model.Photo;
import com.pzc.app.photoweb.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


/**
 * TestController
 *
 * @author pengzc
 * @create 2018-05-23 13:23
 * @desc TEst
 **/
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private PhotoService photoService;

    @RequestMapping("/getAll")
    public @ResponseBody
    List<Photo> index() {
        List<Photo> result=photoService.getAll();
        return result;
    }


    @RequestMapping("/index1")
    public String index1() {
        return "/index1";
    }

}

