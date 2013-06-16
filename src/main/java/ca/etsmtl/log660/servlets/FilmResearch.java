package ca.etsmtl.log660.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;

import ca.etsmtl.log660.configuration.SessionFactoryHelper;
import ca.etsmtl.log660.entity.Film;

/**
 * Servlet implementation class TestServlet
 */
public class FilmResearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public FilmResearch() {
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
		
		String titre = request.getParameter("titre");
		int anneeMin = Integer.parseInt(request.getParameter("anneeMin"));
		int anneeMax = Integer.parseInt(request.getParameter("anneeMax"));
		String pays = request.getParameter("pays");
		String langue = request.getParameter("langue");
		String genre = request.getParameter("genre");
		String realisateur = request.getParameter("realisateur");
		String acteur = request.getParameter("acteur");
						
		Query query = session.createQuery(
			//"FROM Film WHERE " +
			//"titre LIKE CONCAT('%', :titre, '%') AND " +
			//"annee BETWEEN :anneeMin AND :anneeMax"
			"FROM Film"
		);//.setParameter("titre", titre)
		//.setParameter("anneeMin", anneeMin)
		//.setParameter("anneeMax", anneeMax);
		//.setParameter("pays", pays)
		//.setParameter("langue", langue)
		//.setParameter("genre", genre)
		//.setParameter("realisateur", realisateur)
		//.setParameter("acteur", acteur);
		
		List<Film> films = query.list();
		
		for(Film f : films){
			response.getWriter().println(f.getTitre());
		}
		
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
