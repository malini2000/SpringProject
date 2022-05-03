package com.abc.OnlinePlantStore1.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.onlinestore.repository.UserDetailsRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDetailsRepository udr;
	
	@Override
	public String login(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}