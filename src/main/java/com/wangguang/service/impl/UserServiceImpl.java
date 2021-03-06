package com.wangguang.service.impl;

import com.wangguang.dao.UserDao;
import com.wangguang.entity.User;
import com.wangguang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service - 商家信息
 *
 * @author peakren
 * @since 2017-10-29
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public void say(){
		System.out.println("say.........");
	}



	@Override
	public User findById(Integer id) {
		return userDao.findById(id);
	}
	@Override
	public User save(String name) {
		User user = new User();
		user.setName(name);
		return userDao.save(user);
	}
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

}

