package com.crud.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.dao.Student;
import com.crud.utils.HibernateUtils;

@Controller
public class StudentController {

	@RequestMapping("/add_student")
	public String getAddStudentForm() {
		return "student_add_form";
	}

	@RequestMapping(value = "/add_student_action", method = RequestMethod.POST)
	public void addStudent(HttpServletResponse response, @ModelAttribute("student") Student student)
			throws IOException {

		SessionFactory factory = HibernateUtils.getSessionFactory();

		Session hsession = factory.openSession();

		Transaction t = hsession.beginTransaction();

		hsession.persist(student);

		t.commit();

		response.sendRedirect("dashboard");
	}

	@RequestMapping("/delete")
	public void deleteUser(HttpServletResponse response, @RequestParam("id") int id) throws IOException {
		System.out.println("\n\nid :" + id + "\n\n");

		SessionFactory factory = HibernateUtils.getSessionFactory();

		Session hsession = factory.openSession();

//transaction
		Transaction t = hsession.beginTransaction();

		Student student = new Student();
		student.setId(id);

		hsession.remove(student);

		t.commit();

		response.sendRedirect("dashboard");
	}

	@RequestMapping("/edit")
	public String getEditForm(Model model, HttpServletResponse response, @RequestParam("id") int id)
			throws IOException {
		System.out.println("\n\nid :" + id + "\n\n");

		SessionFactory factory = HibernateUtils.getSessionFactory();

		Session hsession = factory.openSession();

		Student student = hsession.get(Student.class, id);

// Query query = hsession.createQuery("FROM Student WHERE id = :id");
// query.setParameter("id", id);
// 
// Student std = (Student) query.getSingleResult();

		model.addAttribute("student", student);

		return "edit_student";
	}

	@RequestMapping(value = "/edit_student_action", method = RequestMethod.POST)
	public void editStudent(HttpServletResponse response, @ModelAttribute("student") Student student)
			throws IOException {

		SessionFactory factory = HibernateUtils.getSessionFactory();

		Session hsession = factory.openSession();

//transaction
		Transaction t = hsession.beginTransaction();

		hsession.merge(student);

		t.commit();

		response.sendRedirect("dashboard");
	}
}
