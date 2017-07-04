package com.free.sprstu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Li Yu on 2017/7/4.
 */
@Controller
@RequestMapping("/home")
public class HomepageController {
    //set static logger
    private static final Logger logger = LoggerFactory.getLogger(HomepageController.class);

    @RequestMapping("/index")
    public String indexPage(){
        logger.info("Request index page.");
        return "index";
    }

}
