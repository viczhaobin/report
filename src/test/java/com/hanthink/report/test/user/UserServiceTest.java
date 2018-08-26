package com.hanthink.report.test.user;

import java.util.Date;

import javax.annotation.Resource;

import com.hanthink.report.core.feature.test.TestSupport;
import com.hanthink.report.core.util.ApplicationUtils;
import com.hanthink.report.user.model.User;
import com.hanthink.report.user.service.UserService;


/**
* @author 作者
* @version 创建时间：2018年8月26日 上午11:13:27
* 类说明
*/


public class UserServiceTest extends TestSupport {
	@Resource
    private UserService userService;
	
	//@Test
	public void test_insert() {
        User model = new User();
        model.setUsername("zhaobin");
        model.setPassword(ApplicationUtils.sha256Hex("123456"));
        model.setCreateTime(new Date());
        userService.insert(model);
    }
	
	//@Test
    public void test_10insert() {
		start();
        for (int i = 0; i < 10; i++) {
            User model = new User();
            model.setUsername("zhaobin" + i);
            model.setPassword(ApplicationUtils.sha256Hex("123456"));
            model.setCreateTime(new Date());
            userService.insert(model);
        }
        end();
    }
}
