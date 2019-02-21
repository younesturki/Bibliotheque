package controller;

import dao.EmpruntEnCoursDao;
import dao.ExemplaireDao;
import dao.UtilisateurDao;
import domain.EmpruntEnCours;
import ui.FenetreEmprunter;
import ui.FenetreSaisieIdUtilisateur;

public class EmpruntCtrl {
	
	   public EmpruntEnCours theEmpruntEnCours = new EmpruntEnCours();
	   public UtilisateurDao theUtilisateurDao = new UtilisateurDao() ;
	   public EmpruntEnCoursDao theEmpruntEnCoursDao = new EmpruntEnCoursDao();
	   public ExemplaireDao theExemplaireDao = new ExemplaireDao();
	   public FenetreSaisieIdUtilisateur theFenetreSaisieIdUtilisateur = new FenetreSaisieIdUtilisateur();
	   public FenetreEmprunter theFenetreEmprunter = new FenetreEmprunter();
	   
	

	   
}
