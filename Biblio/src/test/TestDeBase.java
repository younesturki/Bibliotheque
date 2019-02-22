package test;

import java.text.ParseException;

import javax.swing.JOptionPane;

import controller.EmpruntCtrl;
import domain.Adherent;
import domain.Employee;
import domain.EmpruntEnCours;
import domain.Exemplaire;

public class TestDeBase {
	
	public static void main(String [] args) throws ParseException {
		
		System.out.println("Recuperation de Deux Exemplaires avec leur Id aux Dao");
		
		EmpruntCtrl emp = new EmpruntCtrl();
		
		String message = JOptionPane.showInputDialog("Quel est le premier Id");
		
		int n1 = Integer.parseInt(message);
		
		String message2 = JOptionPane.showInputDialog("Quel est le deuxieme Id");
		
		int n2 = Integer.parseInt(message2);
		
		Exemplaire ex1 = emp.theExemplaireDao.findByExemplaire(n1);
		Exemplaire ex2 = emp.theExemplaireDao.findByExemplaire(n2);
		
		JOptionPane.showMessageDialog(null, ex1, "EXEMPLAIRE N°1", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, ex2, "EXEMPLAIRE N°2", JOptionPane.PLAIN_MESSAGE);
		
		
		System.out.println("\nDemande d'un Adherent par son id aux Dao");
        String message3 = JOptionPane.showInputDialog("Entrer votre Id");
		
		int n3 = Integer.parseInt(message3);
		Adherent ad1 = emp.theUtilisateurDao.findByKey(n3);
		
		JOptionPane.showMessageDialog(null, ad1, "ADHERENT", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("\n" + ad1);
		
		System.out.println("\nDemande d'un Employee par son id aux Dao");
        String message4 = JOptionPane.showInputDialog("Entrer votre Id");
		
		int n4 = Integer.parseInt(message4);
		Employee ep1 = emp.theUtilisateurDao.findByEmployee(n4);
		
		JOptionPane.showMessageDialog(null, ep1, "EMPLOYEE", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("\n" + ep1);
		
		System.out.println("\nCreation d'un Emprunt en Cours pour l'Adherent: ");
		

		ad1.addEmpruntEnCours(new EmpruntEnCours("20/02/2019"));
	
		System.out.println(ad1);
		
        System.out.println("\nCreation d'un Emprunt en Cours pour l'Employee: ");
		
		ep1.addEmpruntEnCours(new EmpruntEnCours("16/02/2019"));
	
		System.out.println(ep1);
		
		
	}

}
