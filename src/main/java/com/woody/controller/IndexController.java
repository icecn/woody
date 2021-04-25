package com.woody.controller;

import com.woody.util.IPUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class IndexController {

    Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("")
    public String index(HttpServletRequest request) throws Exception {

        return "index";
    }

}
