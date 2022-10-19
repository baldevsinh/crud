package com.crud.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class CrudAppInitializer implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(CrudAppConfig.class);

		DispatcherServlet ds = new DispatcherServlet(context);

		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", ds);
		dispatcher.addMapping("/");
		dispatcher.setLoadOnStartup(1);
	}

}
