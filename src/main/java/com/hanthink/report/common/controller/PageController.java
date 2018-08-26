package com.hanthink.report.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  视图控制器,返回jsp视图给前端
* 
* @author 作者
* @version 创建时间：2018年8月26日 下午5:11:44
* 类说明
*/

@Controller
@RequestMapping("/page")
public class PageController {
	/**
     * 登录页
     */
    @RequestMapping("/login")
    public String login() {
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
