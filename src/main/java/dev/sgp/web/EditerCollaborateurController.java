package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String registrationNumberParam = req.getParameter("registrationNumber");
		
		if(registrationNumberParam == null){
			
			resp.sendError(400, "un matricule est attendu");
		}else{
			resp.setContentType("text/html");
			resp.getWriter().write("<h1>Edition de collaborateurs</h1>"
			+ "<p>Matricule : "+registrationNumberParam);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String registrationNumberParam = req.getParameter("registrationNumber");
		String titleParam = req.getParameter("title");
		String nameParam = req.getParameter("name");
		String firstNameParam = req.getParameter("firstName");
	
		if(registrationNumberParam == null || titleParam == null || nameParam == null || firstNameParam == null ){
			
			String paramNull = "";
			
			if(registrationNumberParam == null ){
				
				paramNull += " matricule ";
			}			
			if(titleParam == null ){
				
				paramNull += " titre ";
			}			
			if(nameParam == null ){
				
				paramNull += " nom ";
			}			
			if(firstNameParam == null ){
				
				paramNull += " prénom ";
			}
			
			resp.sendError(400, "Les paramètres suivants sont incorrects : "+paramNull);
		
		}else{
			
			resp.setStatus(201);
			resp.setContentType("text/html");

			// code HTML ecrit dans le corps de la reponse
			resp.getWriter().write("<h1>Edition de collaborateurs</h1>"
			+ "<p>Création d'un collaborateur avec les informations suivantes :</p>"
			+ "<ul>"
			+ "<li>matricule => "+ registrationNumberParam + "</li>"
			+ "<li>titre => "+ titleParam + "</li>"
			+ "<li>nom => "+ nameParam + "</li>"
			+ "<li>prénom => "+ firstNameParam + "</li>"
			+ "</ul>");
		}
	}
}
