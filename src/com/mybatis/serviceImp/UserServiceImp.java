package com.mybatis.serviceImp;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis.config.UserDao;
import com.mybatis.daoImp.UserDaoImp;
import com.mybatis.entity.User;
import com.mybatis.service.UserService;
import com.mybatis.util.GetMybatisSeesion;

public class UserServiceImp implements UserService {
	@Test
	@Override
	public List<User> findAllUser() {
		UserDao dao = new UserDaoImp();
		List<User> findAllUser = dao.findAllUser();
		for (User user : findAllUser) {
			System.out.println(user);
		}
		return null;
	}

	@Test
	@Override
	public User selectUser(int id) {
		UserDao dao = new UserDaoImp();
		User selectUser = dao.selectUser(3);
		System.out.println(selectUser);
		return null;
	}

	@Override
	public void deleteUser(int id) {
		UserDao dao = new UserDaoImp();
		dao.deleteUser(4);
		findAllUser();
	}

	@Override
	public List<User> selectLike(String userName) {
		UserDao dao = new UserDaoImp();
		List<User> selectLike = dao.selectLike(userName);
		for (User user : selectLike) {
			System.out.println(user);
		}
		return null;
	}

	@Override
	public void updateUser(User user) {
		UserDao dao = new UserDaoImp();
		dao.updateUser(user);
	}

	public static void main(String[] args) {
		// UserService service = new UserServiceImp();
		// service.findAllUser();
		// service.selectUser(3);
		// service.deleteUser(4);
		// service.selectLike("飞");
		// User user = new User();
		// user.setAge(120);
		// user.setName("王五");
		// service.updateUser(user);
		SqlSession sqlSession = GetMybatisSeesion.getSeesion();
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		// userDao.deleteUser(11);
		List<User> findAllUser = userDao.findAllUser();
		for (User users : findAllUser) {
			System.out.println(users);
		}
	}
}
