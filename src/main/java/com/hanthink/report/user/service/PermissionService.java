package com.hanthink.report.user.service;

import java.util.List;

import com.hanthink.report.core.generic.GenericService;
import com.hanthink.report.user.model.Permission;

/**
 * 业务权限接口
 * 
* @author 作者
* @version 创建时间：2018年8月26日 下午3:52:57
* 类说明
*/
public interface PermissionService extends GenericService<Permission, Long> {
	/**
     * 通过角色id 查询角色 拥有的权限
     * 
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Long roleId);
}
