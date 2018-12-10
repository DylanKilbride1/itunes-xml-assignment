package com.dylankilbride.itunesbackup.services;

import com.dylankilbride.itunesbackup.entities.User;
import com.dylankilbride.itunesbackup.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

	@Autowired
	UserRepository userRepository;

	public void persistNewUser(User user) {
		userRepository.save(user);
	}

	public boolean checkIfUserAlreadyExists(String email){
		if(userRepository.existsByEmail(email)){
			return true;
		} else {
			return false;
		}

	}
}
