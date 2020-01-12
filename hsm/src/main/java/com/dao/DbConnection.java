package com.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbConnection {

	public static SessionFactory getSessionFectory() {
		Configuration config = new Configuration();
		config.configure("com/dao/hibernet.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		return factory;
	}

}
