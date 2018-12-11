package com.dylankilbride.itunesbackup.controllers;

import com.dylankilbride.itunesbackup.entities.User;
import com.dylankilbride.itunesbackup.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;

	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public String goToLoginLandingPage(ModelMap map) {
		return "register";
	}

	@RequestMapping(value="/register_user", method = RequestMethod.POST)
	public String showHomePage(ModelMap model, @ModelAttribute User user){
		String email = user.getEmail();
		String password = user.getPassword();
		if((registrationService.checkIfUserAlreadyExists(email)) ||
						(email.equals("") || password.equals(""))){
			return "register";
		} else {
			registrationService.persistNewUser(new User(email, password));
			return "user_home";
		}
	}
}
