package com.quizApp;

import java.util.logging.Level;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppConfig {
	private static SessionFactory factory = null;
    public static SessionFactory getSessionFactory() {
    	java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);
    	if(factory==null) {
    		factory = new Configuration()
    				.configure()
    				.buildSessionFactory();
    	}
    	return factory;
    }
}
