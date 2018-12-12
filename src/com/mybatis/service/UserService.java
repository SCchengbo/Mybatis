package com.mybatis.service;

import java.util.List;

import com.mybatis.entity.User;

public interface UserService {
	List<User> findAllUser();

	User selectUser(int id);

	void deleteUser(int id);

	List<User> selectLike(String userName);

	void updateUser(User user);
}
