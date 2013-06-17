<%@ page import="ca.etsmtl.log660.entity.Film" %> 
<%@ page import="ca.etsmtl.log660.entity.Role" %> 
<%@ page import="ca.etsmtl.log660.entity.Genre" %> 
<%@ page import="ca.etsmtl.log660.entity.Pays" %> 
<%@ page import="ca.etsmtl.log660.entity.Annonce" %> 
<%@ page import="ca.etsmtl.log660.entity.Forfait" %> 
<jsp:include page="/ViewFilm" /> 
<% Film film = (Film)request.getAttribute("film"); 
     Forfait forfait = (Forfait)request.getAttribute("forfait"); 
 
     //Forfait forfait = (Forfait)request.getAttribute("forfait");%> 
 
<%@ include file="/header.jsp" %> 
 
     <h3>Confirmation pour la location</h3> 
      
     <div> 
      
     <br /> Titre : <%= film.getTitre() %> 
     <em><%= film.getAnnee() %></em> 
     <br /> R&eacute;alisateur : <%= film.getRealisateur().getNom() %> 
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
      
      
     <br /><br /><br /> Location disponible dans votre forfait : <%= forfait.getLocationMax() %>  
      
      <% if(forfait.getLocationMax() > 0){ %>
      	<a href="/lab02/ConfirmLocation?<%= film.getId() %>">Confirmer la location</a>
      <% } %>
           
     </div> 
<%@ include file="/footer.jsp" %>