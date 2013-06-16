<%@ include file="/header.jsp" %>
<div class="container">
	<% if(request.getParameter("erreurMSG") != null){ %>
		<h2>Courriel ou mot de passe invalide</h2>
	<% } %>
	<h3>Connexion client</h3>
	<div>
		<form name="authentification" action="UserLogin" method="post">
			
			<label>Courriel :</label>
			<input type="text" name="courriel" />
			<br />
			
			<label>Mot de passe : </label>
			<input type="password" name="mdp" />
			<br />
			
			<input type="submit" name="connexion" value="Connexion" class="button" />
		</form>
	</div>
</div>
<%@ include file="/footer.jsp" %>