package com.hanthink.report.user.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hanthink.report.core.generic.GenericDao;
import com.hanthink.report.core.generic.GenericServiceImpl;
import com.hanthink.report.user.dao.RoleMapper;
import com.hanthink.report.user.model.Role;

/**
* @author 作者
* @version 创建时间：2018年8月26日 下午3:57:11
* 类说明
*/
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {

	@Resource
    private RoleMapper roleMapper;
	
	@Override
	public List<Role> selectRolesByUserId(Long userId) {
		return roleMapper.selectRolesByUserId(userId);
	}

	@Override
	public GenericDao<Role, Long> getDao() {
		return roleMapper;
	}

}
