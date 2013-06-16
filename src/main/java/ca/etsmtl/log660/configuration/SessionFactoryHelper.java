package ca.etsmtl.log660.configuration;

import java.io.File;
import java.net.URL;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryHelper {

	private static final SessionFactory sessionFactory;

	static {
		try {
			URL hibernateConfig = SessionFactoryHelper.class.getResource("hibernate.cfg.xml");
			sessionFactory = new Configuration().configure(hibernateConfig).buildSessionFactory();
		} catch (Throwable e) {
			System.err.println("Could not create the session factory.");
			throw new ExceptionInInitializerError(e);
		}

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
