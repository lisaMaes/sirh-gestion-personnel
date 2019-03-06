<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import = "dev.sgp.entite.Collaborateur" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.3.1-dist/css/bootstrap.css">
        <title>SGP - App</title>
    </head>
    <body>
        <h1>La liste des collaborateurs</h1>
	    <ul>
        <%
             List<Collaborateur> listeNoms =(List<Collaborateur>)request.getAttribute("listeNoms");
             for (Collaborateur collab : listeNoms) { %>
             
        <li><img src="<%= collab.getPhoto() %>" alt="avatar"> <%= collab.getNom() %> <%= collab.getPrenom() %></li>

        <%  } %>
        </ul>
    </body>
</html>