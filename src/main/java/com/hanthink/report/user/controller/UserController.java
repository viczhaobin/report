package com.hanthink.report.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;

import com.hanthink.report.user.model.User;

/**
* @author 作者 zhaobin
* @version 创建时间：2018年8月18日 下午2:29:12
* 类说明
*/

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@RequestMapping(value ="/login", method = RequestMethod.POST)
	public String login(@Valid User user, BindingResult result, Model model, HttpServletRequest request) {
		
		return "common/index";
	}
}
