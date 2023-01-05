package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.User1Vo;

@Repository
public class User1DAO {
	
	private SqlSessionTemplate mybatis;
	
	public void insertUser1(User1Vo vo) {
		 mybatis.insert("user1.insertUser1", vo);
		
		
	}
	
	public User1Vo selectUser1(String uid) {
		return null;
	}
	
	public List<User1Vo> selectUser1s() {
		return null;
	}
	
	public void updateUser1(User1Vo vo) {
		
	}
	
	public void deleteUser1(String uid) {
		
	}
	
	
}
