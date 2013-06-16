<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<title>WebFlix</title>
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a class="brand">WebFlix</a>
				<ul class="nav">
				<% if(request.getSession().getAttribute("id") == null)
				{
				%>
					<li><a href="index.jsp">Connexion</a></li>
				<% } else { %>
					<li><a href="/researh.jsp">Consulter les films</a></li>
					<li><a href="index.jsp">Se déconnecter</a></li>
				<% } %>
				</ul>
			</div>
		</div>
	</div>
	<br />
	<br />