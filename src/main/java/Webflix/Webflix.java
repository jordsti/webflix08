package Webflix;

import java.util.List;

import org.hibernate.Session;

import ca.etsmtl.log660.configuration.SessionFactoryHelper;

public class Webflix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session uneSession = SessionFactoryHelper.getSessionFactory().openSession();
		
		uneSession.beginTransaction();
		
		List lesClients = uneSession.createQuery(
				"FROM Client c WHERE c.courriel = 'RobertCFlores21@gmail.com' ").list();
		
		System.out.println(lesClients);
	}

}
