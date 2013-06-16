<%@ page import="ca.etsmtl.log660.entity.Film" %>
<jsp:include page="ViewFilm" />

<%@ include file="/header.jsp" %>

<% Film film = (Film)request.getAttribute("film"); %>

<%= film.getTitre() %>

<%@ include file="/footer.jsp" %>