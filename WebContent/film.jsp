<%@ page import="ca.etsmtl.log660.entity.Film" %>
<%@ page import="ca.etsmtl.log660.entity.Role" %>
<%@ page import="ca.etsmtl.log660.entity.Genre" %>
<%@ page import="ca.etsmtl.log660.entity.Pays" %>
<%@ page import="ca.etsmtl.log660.entity.Annonce" %>
<jsp:include page="ViewFilm" />

<%@ include file="/header.jsp" %>
<div class="container">

<% Film film = (Film)request.getAttribute("film"); %>

<h3><%= film.getTitre() %></h3>
<p>
	<div class="span4">
		<a href="rent.jsp?filmid=<%= film.getId() %>">Louer</a>
	</div>
	<br />
	<em><%= film.getAnnee() %></em>
	<br /> Réalisateur : <%= film.getRealisateur().getNom() %>
	<br /> Langue : <%= film.getLangue().getLangue() %>
	<br /> Genre(s) :
	<% for(Genre g : film.getGenres())
	{
	%>
		<%= g.getGenre() %> 
	<% } %>
	<br /> Pays :
	<% for(Pays p : film.getPays())
	{
	%>
		<%= p.getNomPays() %> 
	<% } %>
	<%= film.getResume() %>
	<br />
	<%= film.getDuree() %> minute(s)
	<br />
	<ul>
	<% for(Role r : film.getRoles()) 
	{
	%>
	<li><%= r.getPersonne().getNom() %> dans le rôle de <%= r.getNomRole()%></li>
	<% } %>
	</ul>
	<br /> Annonce :
	<ul>
	<% for(Annonce a : film.getAnnonces())
	{
	%>
		<li><%= a.getUrl() %></li>
	<% } %>
	</ul>
</p>

</div>
<%@ include file="/footer.jsp" %>