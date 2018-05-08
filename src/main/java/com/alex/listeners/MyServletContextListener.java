
package com.alex.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author Alex
 */
public class MyServletContextListener implements ServletContextListener {
	public MyServletContextListener() {
		System.out.println(">>>> ServletContextListener - NEW !!!!!");
	}

	// private HashMap<String, HttpSession> sessionMap = new HashMap<String,
	// HttpSession>();

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println(">>>> ServletContext - init !!!!!");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext - desrtoyed !!!!!");
	}

}
