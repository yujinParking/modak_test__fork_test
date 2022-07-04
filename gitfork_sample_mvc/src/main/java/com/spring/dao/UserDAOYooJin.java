package com.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Transactional
@Repository
public class UserDAOYooJin implements UserDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int getYoojinCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
