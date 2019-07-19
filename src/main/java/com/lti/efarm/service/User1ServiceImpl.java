package com.lti.efarm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.efarm.dao.User1Dao;
import com.lti.efarm.model.User1;

@Service
public class User1ServiceImpl implements User1Service 
{
	@Autowired
	private User1Dao user1DAO;
	
	
	@Transactional
	public User1 checkUser1(User1 theUser1) {
		return user1DAO.checkUser1(theUser1);
	}
	
}


