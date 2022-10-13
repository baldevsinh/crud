package com.crud.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "login_action", method = RequestMethod.POST)
	public void checkCreds(
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			HttpServletRequest request, 
			HttpServletResponse response) throws IOException {
		
		if(username.equals("baldev") && password.equals("123")) {
			request.getSession().setAttribute("username", username);
			response.sendRedirect("dashboard");
		}
		else {
			response.sendRedirect("login");
		}
		
	}
	
	@RequestMapping("/logout")
	public void logoutUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.getSession().invalidate();
		response.sendRedirect("login");
	}
	
}
