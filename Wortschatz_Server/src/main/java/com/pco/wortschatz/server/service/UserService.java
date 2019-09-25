package com.pco.wortschatz.server.service;

import java.util.ArrayList;

import com.pco.wortschatz.common.model.User;


public interface UserService {
	public ArrayList<User> findAllUsers();
	
	public User saveUser(User user);
	
	public boolean existsByEmail(String email);
	
	long count();
	
	public void saveAll(ArrayList<User> users);
	
	public void flush();
	
	public ArrayList<User> findBatchAsc(Integer startRow, Integer limitSize); 

}
