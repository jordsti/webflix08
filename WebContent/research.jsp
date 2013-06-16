<%
	if(session.getAttribute("id") == null){
		response.sendRedirect("/lab02/index.jsp");
	}
%>
<%@ page import="ca.etsmtl.log660.entity.Film" %>
<%@ page import="java.util.List" %>
<jsp:include page="FilmResearch" />


<%@ include file="/header.jsp" %>
<div class="container">
	<h2>Bienvenue <%= request.getSession().getAttribute("nom") %> !</h2>
	<h3>Recherche de film</h3>
	<div>
		<form name="research" action="research.jsp" method="get">
			
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
	<div class="container">
	<% for(Film f : (List<Film>)request.getAttribute("films"))
	{
	%>
		<div class="row-fluid">
			<div class="span8">
			<a href="film.jsp?filmid=<%= f.getId() %>"><%= f.getTitre() %> - <%= f.getAnnee() %></a>
			</div>
			<div class="span3">
			<a href="#">Louer</a>
			</div>
		</div>
	<% } %>
	</div>
	
</div>
<%@ include file="/footer.jsp" %>
