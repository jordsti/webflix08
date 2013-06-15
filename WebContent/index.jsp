<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Webflix 08</title>
</head>
<body>
	<h3>Connexion client</h3>
	<div>
		<form name="login" action="UserLogin" method="post">
			
			<label>Courriel :</label>
			<input type="text" name="email" />
			<br />
			
			<label>Mot de passe : </label>
			<input type="password" name="password" />
			<br />
			
			<input type="submit" name="connexion" value="Connexion" />
		</form>
	</div>
</body>
</html>