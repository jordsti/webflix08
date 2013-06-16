<%
	if(session.getAttribute("id") == null){
		response.sendRedirect("/lab02/index.jsp");
	}
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bienvenue sur Webflix monsieur <%= request.getSession().getAttribute("nom") %></h1>
	<h3>Recherche de film</h3>
	<div>
		<form name="research" action="FilmResearch" method="get">
			
			<label>Titre : </label>
			<input type="text" name="titre" />
			<br />
			
			<label>Sortie entre : </label>
			<select name="anneeMin">
				<% for(int i = 1900; i <= 2013; i++){ %>
					<option value="<%= i %>"><%= i %></option>
				<% } %>
			</select>
			<select name="anneeMax">
				<% for(int i = 2013; i >= 1900; i--){ %>
					<option value="<%= i %>"><%= i %></option>
				<% } %>
			</select>
			<br />
			
			<label>Pays : </label>
			<input type="text" name="pays" />
			<br />
			
			<label>Langue : </label>
			<input type="text" name="langue" />
			<br />
			
			<label>Genre : </label>
			<input type="text" name="genre" />
			<br />
			
			<label>Sc&eacute;nariste : </label>
			<input type="text" name="scenariste" />
			<br />
			
			<label>R&eacute;alisateur : </label>
			<input type="text" name="realisateur" />
			<br />
			
			<label>Acteur : </label>
			<input type="text" name="acteur">
			<br />
			
			<input type="submit" name="search" value="Rechercher">
		</form>
	</div>
	
	<% if(request.getParameter("film1") != null){ %>
		<div>
			Result
		</div>
	<% } %>
	
</body>
</html>