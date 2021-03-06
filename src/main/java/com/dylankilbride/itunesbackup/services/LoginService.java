package com.dylankilbride.itunesbackup.services;

import com.dylankilbride.itunesbackup.entities.User;
import com.dylankilbride.itunesbackup.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;

	public User validateUserInDb(String email, String password) {
		User user = userRepository.findByEmailAndPassword(email, password);
		return user;
	}
}
