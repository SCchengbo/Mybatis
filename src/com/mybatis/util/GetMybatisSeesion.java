package com.mybatis.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GetMybatisSeesion {
	public static SqlSessionFactory sqlFactory;

	static{
		// mybatis的配置文件
		String resource = "config.xml";
		// 使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
		InputStream is = GetMybatisSeesion.class.getClassLoader().getResourceAsStream(resource);
		// 构建sqlSession的工厂
		sqlFactory = new SqlSessionFactoryBuilder().build(is);
	}

	public static SqlSession getSeesion() {
		SqlSession openSession = sqlFactory.openSession();
		return openSession;
	}

}
