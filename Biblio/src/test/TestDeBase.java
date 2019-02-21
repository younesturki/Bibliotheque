package test;

import java.text.ParseException;

import controller.EmpruntCtrl;
import domain.Adherent;
import domain.Employee;
import domain.EmpruntEnCours;
import domain.Exemplaire;

public class TestDeBase {
	
	public static void main(String [] args) throws ParseException {
		
		System.out.println("Recuperation de Deux Exemplaires avec leur Id aux Dao");
		
		EmpruntCtrl emp = new EmpruntCtrl();
		
		Exemplaire ex1 = emp.theExemplaireDao.findByExemplaire(123456);
		Exemplaire ex2 = emp.theExemplaireDao.findByExemplaire(789654);
		
		System.out.println("\n" + ex1);
		System.out.println(ex2);
		
		System.out.println("\nDemande d'un Adherent par son id aux Dao");
		Adherent ad1 = emp.theUtilisateurDao.findByKey(2563);
		
		System.out.println("\n" + ad1);
		
		System.out.println("\nDemande d'un Employee par son id aux Dao");
		Employee ep1 = emp.theUtilisateurDao.findByEmployee(369854);
		
		System.out.println("\n" + ep1);
		
		System.out.println("\nCreation d'un Emprunt en Cours pour l'Adherent: ");
		

		ad1.addEmpruntEnCours(new EmpruntEnCours("20/02/2019"));
	
		System.out.println(ad1);
		
        System.out.println("\nCreation d'un Emprunt en Cours pour l'Employee: ");
		
		ep1.addEmpruntEnCours(new EmpruntEnCours("16/02/2019"));
	
		System.out.println(ep1);
		
		
	}

}
