package com.hanthink.report.production.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author 作者 zhaobin
* @version 创建时间：2018年8月23日 上午12:33:03
* 类说明
*/

@Controller
public class ProdutctionController {
	
	@RequestMapping("/production_summery")
    public String dashboard() {
		
        return "production/production_summery";
    }

}
