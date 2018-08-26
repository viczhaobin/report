package com.hanthink.report.user.service;

import java.util.List;

import com.hanthink.report.core.generic.GenericService;
import com.hanthink.report.user.model.Role;

/**
 * 角色业务接口
* @author 作者
* @version 创建时间：2018年8月26日 下午3:55:12
* 类说明
*/
public interface RoleService extends GenericService<Role, Long>  {
	/**
     * 通过用户id 查询用户 拥有的角色
     * 
     * @param userId
     * @return
     */
    List<Role> selectRolesByUserId(Long userId);
}
