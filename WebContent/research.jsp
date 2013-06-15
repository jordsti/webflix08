<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Recherche de film</h3>
	
	<div>
		<form name="research" action="FilmResearch" method="get">
			
			<label>Titre : </label>
			<input type="text" name="title" />
			<br />
			
			<label>Role : </label>
			<input type="text" name="role" />
			<br />
			
			<label>Sc&eacute;nariste : </label>
			<input type="text" name="scenariste" />
			<br />
			
			<label>Acteur : </label>
			<input type="text" name="acteur" />
			<br />
			
			<label>Langue : </label>
			<input type="text" name="langue" />
			<br />
			
			<label>Pays : </label>
			<input type="text" name="pays">
			<br />
			
			<input type="submit" name="search" value="Rechercher">
		</form>
	</div>
	
	<div>
		Result
	</div>
</body>
</html>