package com.hanthink.report.web.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
	
	@RequestMapping("login")
    public String signonForm() {
		
        return "account/login";
    }

}
