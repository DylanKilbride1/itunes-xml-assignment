package com.dylankilbride.itunesbackup.controllers;

import com.dylankilbride.itunesbackup.entities.User;
import com.dylankilbride.itunesbackup.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller //Use @Controler instead of @RestController "When you annotate a class with RestController, all methods annotated with @RequestMapping assume @ResponseBody semantics by default. In other words, your method #home is serializing the String /webapp/WEB-INF/home.jsp as JSON, instead of mapping its value to a view."
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginLandingPage(ModelMap map) {
		return "login_welcome";
	}

	@RequestMapping(value="/login_user", method = RequestMethod.POST)
	public String showHomePage(ModelMap model, @ModelAttribute User user){


		String email = user.getEmail();
		String password = user.getPassword();
		 //= loginService.validateUserDb(email, password);

		if(loginService.validateUserDb(email, password) != null){
			return "user_home";
		} else {
			return "login_welcome";
		}
	}



}
