package com.hanthink.report.user.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hanthink.report.core.generic.GenericDao;
import com.hanthink.report.core.generic.GenericServiceImpl;
import com.hanthink.report.user.dao.UserMapper;
import com.hanthink.report.user.model.User;
import com.hanthink.report.user.model.UserExample;

/**
 * 用户Service实现类
* @author 作者
* @version 创建时间：2018年8月26日 上午11:46:21
* 类说明
*/

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

	@Resource
    private UserMapper userMapper;
	
	public int insert(User model) {
		return userMapper.insertSelective(model);
	}

	public int update(User model) {
		return userMapper.updateByPrimaryKeySelective(model);
	}

	public User selectById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public User selectOne() {
		// TODO Auto-generated method stub
		return null;
	}

	public User authentication(User user) {
		return userMapper.authentication(user);
	}

	public User selectByUsername(String username) {
		UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        final List<User> list = userMapper.selectByExample(example);
        return list.get(0);
	}


	public int delete(Long id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	public List<User> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenericDao<User, Long> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
