package com.wc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author 王超
 * @ClassName JenkinsController
 * @PackageName com.wc.controller
 * @Description
 * @Date 2021/3/12 16:02
 * @Version 1.0
 */
@Controller
@RequestMapping("/jenkins")
public class JenkinsController {

    @GetMapping("/test/{username}")
    @ResponseBody
    public Object TestJenkins(@PathVariable String username){
        return "欢迎"+username+"!";
    }
}
