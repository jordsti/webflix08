package ca.etsmtl.log660.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// FIXME
		 PrintWriter out = response.getWriter();
		 printInitHtml(out);
		
		
		 out.println("<h3>Film Research</h3>");
		 
		out.println("<form name=\"filmResearch\" action=\"filmResearch.asp\" method=\"get\">");
		out.println("<label>Title :</label><input type=\"text\" name=\"Title\">");
		out.println(" <br>");
		out.println("<label>Role:</label><input type=\"text\" name=\"Role\">");
		out.println("<br>");
		out.println("<label>Scenariste: </label><input type=\"text\" name=\"Scenariste\">");
		out.println("<br>");
		out.println("<label>Acteur: </label><input type=\"text\" name=\"Acteur\">");
		out.println("<br>");
		out.println("<label>Langue: </label><input type=\"text\" name=\"Langue\">");
		out.println("<br>");
		out.println("<label>Pays: </label><input type=\"text\" name=\"Pays\">");
		out.println("<br>");
		out.println("<input type=\"submit\" value=\"search\">");
		out.println("</form>");
		out.println("</div>");
		out.println("<div>");
		out.println("<h3>Result</h3>");
		out.println("<div></div>");
		 
		 printEndHtml(out);
	}
	
	
	private void printInitHtml(PrintWriter out){
		 out.println("<h1>Webflix Team 08</h1>");
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<title>Webflix team 8</title>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println("<div>");
		 out.println("<h1>Webflix</h1>");
		 out.println("<h2>Team 8</h2>");
	}
	private void printEndHtml(PrintWriter out){
		 out.println("</body>");
		 out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<h2>Ninja</h2>");
	}

}
