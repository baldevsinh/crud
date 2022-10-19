package com.crud.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.crud.dao.Student;

public class HibernateUtils {
	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure().addAnnotatedClass(Student.class);

			sessionFactory = cfg.buildSessionFactory();

		}

		return sessionFactory;
	}
}
