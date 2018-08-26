package com.hanthink.report.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author 作者 zhaobin
* @version 创建时间：2018年8月18日 下午2:22:03
* 类说明
*/

@Controller
public class CommonController {
	
	 /**
     * 首页
     * 
     * @param request
     * @return
     */
    @RequestMapping("index")
    public String index(HttpServletRequest request) {
        return "common/index";
    }	
}
