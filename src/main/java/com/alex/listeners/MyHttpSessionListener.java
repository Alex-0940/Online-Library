package com.alex.listeners;

import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author Alex
 */
public class MyHttpSessionListener implements HttpSessionListener {
	public MyHttpSessionListener() {
		System.out.println(">>>> HttpSessionListener - NEW !!!!!");
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println(">>>> HttpSession - created");
		HttpSession session = se.getSession();
		ServletContext context = session.getServletContext();
		HashMap sessionMap = (HashMap) context.getAttribute("sessionMap");
		sessionMap.put(session.getId(), session);

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(">>>> HttpSession - destroyed");
		HttpSession session = se.getSession();
		ServletContext context = session.getServletContext();
		HashMap sessionMap = (HashMap) context.getAttribute("sessionMap");
		sessionMap.remove(session.getId());

	}

}
