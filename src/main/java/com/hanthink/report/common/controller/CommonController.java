package com.hanthink.report.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author 作者 zhaobin
* @version 创建时间：2018年8月18日 下午2:22:03
* 类说明
*/

@Controller
public class CommonController {
	
	@RequestMapping("login")
    public String signonForm() {
		
        return "common/login";
    }
	
	@RequestMapping("/dashboard")
    public String dashboard() {
		
        return "common/dashboard";
    }
	

    /**
     * 404页
     */
    @RequestMapping("/404")
    public String error404() {
        return "common/404";
    }

    /**
     * 401页
     */
    @RequestMapping("/401")
    public String error401() {
        return "common/401";
    }

    /**
     * 500页
     */
    @RequestMapping("/500")
    public String error500() {
        return "common/500";
    }
	
}
