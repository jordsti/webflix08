package ca.etsmtl.log660.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import ca.etsmtl.log660.configuration.SessionFactoryHelper;
import ca.etsmtl.log660.entity.Client;
import ca.etsmtl.log660.entity.Film;
import ca.etsmtl.log660.entity.Forfait;

public class ConfirmLocation extends HttpServlet {

	/**
	 * Default constructor.
	 */
	public ConfirmLocation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = SessionFactoryHelper.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		session.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
}
