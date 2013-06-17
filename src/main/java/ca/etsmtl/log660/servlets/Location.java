package ca.etsmtl.log660.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
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
				
		Object clientID = request.getSession().getAttribute("id");
		int filmID = Integer.parseInt(request.getParameter("filmid"));
		
		Client client = (Client) session.createQuery(
				"FROM Client c" +
                " WHERE "+
                "  c.id = :clientID "
           ).setParameter("clientID", clientID)
           .uniqueResult();
		
		Film film = (Film) session.createQuery(
           "FROM Film f" +
           " WHERE "+
           "  f.id = :filmid "
      ).setParameter("filmid", filmID)
      .uniqueResult();
		
		 List<Location> locations = session.createQuery(
                "FROM Location l" +
                " WHERE " +
                "  l.id = :clientID "
           ).setParameter("clientID", clientID)
           .list();
		
		Forfait forfait = client.getForfait();
		
		forfait.setLocationMax(forfait.getLocationMax() - locations.size());
		
		request.setAttribute("film", film);
		request.setAttribute("forfait", forfait);
		
		request.getRequestDispatcher("location.jsp").forward(request,response);
		
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
