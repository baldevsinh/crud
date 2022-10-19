package com.crud.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.dao.Student;
import com.crud.utils.HibernateUtils;

@Controller
public class DashboardController {

	@RequestMapping("/dashboard")
	public String loadDashboard(Model model, HttpServletRequest request, HttpServletResponse response)
			throws IOException {

		String session = (String) request.getSession().getAttribute("username");
		if (session == null) {
			response.sendRedirect("login");
		}

		SessionFactory factory = HibernateUtils.getSessionFactory();

		Session hsession = factory.openSession();

	
		Query query = hsession.createQuery("FROM Student");
		List<Student> students = query.list();

		model.addAttribute("student_list", students);
		System.out.println(students);

		return "dashboard";
	}

}
