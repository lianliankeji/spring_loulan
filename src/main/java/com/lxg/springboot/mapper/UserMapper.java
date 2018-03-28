package com.lxg.springboot.mapper;

import java.util.List;

import com.lxg.springboot.model.User;

public interface UserMapper {

	int count(User user);
	
	int save(User user);
	
	int validate(User user);
	
	int update(User user);
	
/*	int save(User user);
	
	int deleteauth(User user);

	User query(User user);
	
	User querybyno(User user);
	
	int saveboss(User user);
	
	int updateboss(User user);
	
	int updatebossbyphone(User user);

	User queryboss(User user);
	
	User querybossrole(User user);
	
	User querybossbyid(User user);
	
	List<User> querybynoboss(User user);
	
	int countboss(User user);
	
	int countbosss(User user);
	
	int countbossp(User user);
	
	int bosspay();
	
	List<User> queryallboss();
		
	String lasttime();
	
	void updatelasttime(String lasttime);*/
	
}