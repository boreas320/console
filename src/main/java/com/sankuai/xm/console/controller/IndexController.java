package com.sankuai.xm.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiangshuai on 2017/2/21.
 */
@Controller
@RequestMapping
public class IndexController {

    @RequestMapping()
    public String index() {
        return "index";
    }

    @RequestMapping("/index1")
    public String index1() {

        return "index1";
    }
}
