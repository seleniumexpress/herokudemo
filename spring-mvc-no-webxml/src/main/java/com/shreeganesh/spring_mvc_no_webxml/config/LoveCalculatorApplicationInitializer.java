package com.shreeganesh.spring_mvc_no_webxml.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		XmlWebApplicationContext context = new XmlWebApplicationContext();
		context.setConfigLocation("classpath:beans.xml");
		
		//create dispatcher servlet
		
		DispatcherServlet ds = new DispatcherServlet(context);
		
		//register dispatcher servlet with servlet context
		ServletRegistration.Dynamic srd= servletContext.addServlet("myDispatcherServlet", ds);
		srd.addMapping("/home/*");
		srd.setLoadOnStartup(1);
	}

}
