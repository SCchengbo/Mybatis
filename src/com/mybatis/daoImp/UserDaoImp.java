package com.mybatis.daoImp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.config.UserDao;
import com.mybatis.entity.User;
import com.mybatis.util.GetMybatisSeesion;

public class UserDaoImp implements UserDao {

	@Override
	public List<User> findAllUser() {
		SqlSession seesion = GetMybatisSeesion.getSeesion();
		String path = "crud.findAllUser";
		List<User> selectList = seesion.selectList(path);
		return selectList;
	}

	@Override
	public User selectUser(int id) {
		SqlSession seesion = GetMybatisSeesion.getSeesion();
		String path = "crud.selectUser";
		User selectOne = seesion.selectOne(path, id);
		return selectOne;
	}

	@Override
	public void deleteUser(int id) {
		SqlSession seesion = GetMybatisSeesion.getSeesion();
		String path = "crud.deleteUser";
		seesion.delete(path, id);
		seesion.commit();
	}

	@Override
	public List<User> selectLike(String userName) {
		SqlSession seesion = GetMybatisSeesion.getSeesion();
		String path = "crud.selectLike";
		List<User> selectList = seesion.selectList(path, userName);
		return selectList;
	}

	@Override
	public void updateUser(User user) {
		SqlSession seesion = GetMybatisSeesion.getSeesion();
		String path = "crud.updateUser";
		seesion.selectList(path, user);
		seesion.commit();
	}

}
