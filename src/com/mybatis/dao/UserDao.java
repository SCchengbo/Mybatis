package com.mybatis.dao;

import java.util.List;

import com.mybatis.entity.User;

public interface UserDao {
	List<User> findAllUser();

	User selectUser(int id);

	void deleteUser(int id);

	List<User> selectLike(String userName);

	void updateUser(User user);
}
