package com.spring.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class BoardDAOPoong implements BoardDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int getCount() {
		return sqlSession.selectOne("genera"
				+ "lSQL.poongCount");
		
	}
}
