package edu.ucla.cs.scai.canali.webapp.utils;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

public class WebAppUtils {

	static public void printParameters(String servletName, HttpServletRequest request) {
		System.out.println("Print request parameters of " + servletName);
		Enumeration<String> parametersNames = request.getParameterNames();
		while(parametersNames.hasMoreElements()) {
			String param = parametersNames.nextElement();
			System.out.println(param + " = " + request.getParameter(param));
		}
	}
}
