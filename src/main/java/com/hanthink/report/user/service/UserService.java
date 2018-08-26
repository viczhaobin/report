package com.hanthink.report.user.service;

import com.hanthink.report.core.generic.GenericService;
import com.hanthink.report.user.model.User;

/**
 * 用户业务接口
*
* @author 作者
* @version 创建时间：2018年8月26日 上午11:41:04
* 类说明
*/
public interface UserService extends GenericService<User, Long> {
	/**
	 *       用户验证
     * 
     * @param user
     * @return
     */
    User authentication(User user);

    /**
     *    根据用户名查询用户
     * 
     * @param username
     * @return
     */
    User selectByUsername(String username);
}
