package com.crud.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

	@RequestMapping("/dashboard")
	public String loadDashboard(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String session = (String) request.getSession().getAttribute("username");
		if(session == null) {
			response.sendRedirect("login");
		}
		return "dashboard";
	}
}
