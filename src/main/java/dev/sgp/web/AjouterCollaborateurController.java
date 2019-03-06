package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class AjouterCollaborateurController extends HttpServlet {
	
	// recuperation du service
		private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("/WEB-INF/views/collab/nouveauCollaborateur.jsp")
		.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//recupération des données
		String prenomParam = req.getParameter("prenom");
		String nomParam = req.getParameter("nom");
		String numSecuriteParam = req.getParameter("numSecurite");
		String adresseParam = req.getParameter("adresse");
		String dateNaissanceParam = req.getParameter("dateNaissance");
	
		String errMessage ="";
		
		//test de validité sur les données envoyées
		if(numSecuriteParam.length() != 15){
			
			errMessage += " Le numéro de sécurité sociale n'est pas valide "+numSecuriteParam;
		}
		if(!this.checkForm(prenomParam)){
			errMessage += " Le prénom n'est pas valide "+prenomParam;
		}
		if(!this.checkForm(nomParam)){
			errMessage += " Le nom n'est pas valide "+nomParam;
		}		
		if(!this.checkForm(adresseParam)){
			errMessage += " L'adresse n'est pas valide "+adresseParam;
		}
		
		if(errMessage.length() > 0){
			
			resp.sendError(400, errMessage);
			
		}else{
			
			//génération des données manquantes
			String matricule = nomParam.substring(0,1)+prenomParam.substring(0,1)+(Math.random() * (9999));
			LocalDate dateNaissance = LocalDate.parse(dateNaissanceParam);
			ZonedDateTime dateCreation	= ZonedDateTime.now();
			String emailPro = prenomParam+"."+nomParam+"@societe.com";
			
			collabService.sauvegarderCollaborateur(new Collaborateur (matricule, nomParam, prenomParam, dateNaissance, adresseParam, numSecuriteParam, emailPro, "sgp/assets/default-avatar.jpg", dateCreation, true));
			
			
			resp.sendRedirect("/sgp/collaborateurs/lister");

		}	
		
	}
	
	/**
	 * Renvoie false si la data contient un caractère spécial
	 * @param data
	 * @return
	 */
	boolean checkForm (String data){
		
		boolean result = true;
		
		if(data.matches(".*[/+<>@].*")){
			
			result = false;
		}
		
		return result;
	}
}
