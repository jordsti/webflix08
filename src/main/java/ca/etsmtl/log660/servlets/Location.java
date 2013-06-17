package ca.etsmtl.log660.servlets;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import ca.etsmtl.log660.configuration.SessionFactoryHelper;
import ca.etsmtl.log660.entity.Client;
import ca.etsmtl.log660.entity.Film;
import ca.etsmtl.log660.entity.Forfait;


/**
 * Servlet implementation class TestServlet
 */
public class Location extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Location() {
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
		
		int clientID = (int)request.getSession().getAttribute("id");
		int filmID = Integer.parseInt(request.getParameter("filmid"));
		
		Client client = (Client) session.createQuery(
				"FROM Client c" +
                " WHERE "+
                "  c.id = :clientID "
           ).setParameter("clientID", clientID)
           .uniqueResult();
		
		
		Film film = (Film)(session.createQuery(
				"FROM Film f WHERE f.id = :id"
      ).setParameter("id", filmID)
      .uniqueResult());
		
		 Query query3 = session.createQuery("FROM Location l WHERE l.id = :clientID")
				 .setParameter("clientID", clientID);
           
		List<Location> locations = query3.list();
		
		SQLQuery squery = session.createSQLQuery("SELECT QUANTITE FROM INVENTAIRE_FILMS WHERE NO_FILM_FK = :id");
		
		squery.setParameter("id", filmID);
		BigDecimal maxqte = (BigDecimal)squery.uniqueResult();
		
		SQLQuery s2query = session.createSQLQuery("SELECT COUNT(*) FROM LOCATIONS WHERE NO_FILM_FK = :id");
		s2query.setParameter("id", filmID);
		
		int louer = 0;
		
		Object olouer = s2query.uniqueResult();
		if(olouer != null)
		{
			louer = ((BigDecimal)olouer).intValue();
		}
		
		Forfait forfait = client.getForfait();
		
		forfait.setLocationMax(forfait.getLocationMax() - locations.size());
		
		request.setAttribute("film", film);
		request.setAttribute("forfait", forfait);
		

		//request.getRequestDispatcher("location.jsp").forward(request,response);
		
		
		if(forfait.getLocationMax() != 0 && louer < maxqte.intValue())
		{
			ca.etsmtl.log660.entity.Location loc = new ca.etsmtl.log660.entity.Location();
			
			//SATAN
			int lid = (int)Math.random()*100000;
			
			SQLQuery q5 = session.createSQLQuery("INSERT INTO LOCATIONS (NO_LOCATION_PK, NO_FILM_FK, NO_INTERVENANT_FK, DEBUT) VALUES(:id, :film, :client, SYSDATE)");
			
			q5.setParameter("id", lid);
			q5.setParameter("film", filmID);
			q5.setParameter("client", clientID);
			
			q5.executeUpdate();
			request.setAttribute("success", true);
		}
		else
		{
			request.setAttribute("success", false);
		}
		
		//session.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
