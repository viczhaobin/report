package com.hanthink.report.user.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hanthink.report.core.generic.GenericDao;
import com.hanthink.report.core.generic.GenericServiceImpl;
import com.hanthink.report.user.dao.PermissionMapper;
import com.hanthink.report.user.model.Permission;

/**
* @author 作者
* @version 创建时间：2018年8月26日 下午4:06:48
* 类说明
*/
@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission, Long> implements PermissionService {

	@Resource
    private PermissionMapper permissionMapper;
	
	public List<Permission> selectPermissionsByRoleId(Long roleId) {
		return permissionMapper.selectPermissionsByRoleId(roleId);
	}

	@Override
	public GenericDao<Permission, Long> getDao() {
		return permissionMapper;
	}

}
