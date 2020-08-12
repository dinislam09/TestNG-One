package com.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Utilities {

	public static Logger getlog(Class clazz) {
		Logger log = Logger.getLogger(clazz);
		PropertyConfigurator.configure("src\\main\\resources\\log4j.properties");
		return log;
	}
}
