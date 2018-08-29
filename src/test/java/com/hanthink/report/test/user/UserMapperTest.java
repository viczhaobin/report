package com.hanthink.report.test.user;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.hanthink.report.core.feature.orm.mybatis.Page;
import com.hanthink.report.core.feature.test.TestSupport;
import com.hanthink.report.user.dao.UserMapper;
import com.hanthink.report.user.model.User;
import com.hanthink.report.user.model.UserExample;

/**
* @author 作者
* @version 创建时间：2018年8月26日 下午4:15:37
* 类说明
*/
public class UserMapperTest extends TestSupport {
	@Resource
    private UserMapper userMapper;
	

    @Test
    public void test_selectByExampleAndPage() {
        start();
        Page<User> page = new Page<User>(1, 3);
        UserExample example = new UserExample();
        example.createCriteria().andIdGreaterThan(0L);
        
        final List<User> users = userMapper.selectByExampleAndPage(page, example);
        for (User user : users) {
            System.err.println(user);
        }
        end();
    }

}
