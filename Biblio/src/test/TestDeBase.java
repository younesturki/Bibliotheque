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
		
		JOptionPane.showMessageDialog(null, "Recuperation de Deux Exemplaires avec leur Id aux Dao");
		System.out.println("Recuperation de Deux Exemplaires avec leur Id aux Dao");
		
		EmpruntCtrl emp = new EmpruntCtrl();
		
		String message = JOptionPane.showInputDialog("Quel est l'Id pour l'Exemplaire n°1");
		
		int n1 = Integer.parseInt(message);
		
		String message2 = JOptionPane.showInputDialog("Quel est l'Id pour l'Exemplaire n°2");
		
		int n2 = Integer.parseInt(message2);
		
		Exemplaire ex1 = emp.theExemplaireDao.findByExemplaire(n1);
		Exemplaire ex2 = emp.theExemplaireDao.findByExemplaire(n2);
		
		JOptionPane.showMessageDialog(null, ex1, "RETRIEVE", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, ex2, "RETRIEVE", JOptionPane.PLAIN_MESSAGE);
		
		
		JOptionPane.showMessageDialog(null, "Recuperation d'un Adherent par son id aux Dao");
		System.out.println("\nDemande d'un Adherent par son id aux Dao");
        String message3 = JOptionPane.showInputDialog("Entrer l'Id de l'Adherent");
		
		int n3 = Integer.parseInt(message3);
		Adherent ad1 = emp.theUtilisateurDao.findByKey(n3);
		
		JOptionPane.showMessageDialog(null, ad1, "RETRIEVE", JOptionPane.INFORMATION_MESSAGE);
		//System.out.println("\n" + ad1);
		
		JOptionPane.showMessageDialog(null, "Recuperation d'un Employe par son id aux Dao");
		System.out.println("\nDemande d'un Employee par son id aux Dao");
        String message4 = JOptionPane.showInputDialog("Entrer l'Id de l'Employe");
		
		int n4 = Integer.parseInt(message4);
		Employee ep1 = emp.theUtilisateurDao.findByEmployee(n4);
		
		JOptionPane.showMessageDialog(null, ep1, "RETRIEVE", JOptionPane.INFORMATION_MESSAGE);
		//System.out.println("\n" + ep1);
		
		System.out.println("\nCreation d'un Emprunt en Cours pour l'Adherent: ");
		JOptionPane.showMessageDialog(null, "Creation d'un Emprunt en Cours pour l'Adherent: ");

		ad1.addEmpruntEnCours(new EmpruntEnCours("20/02/2019"));
		JOptionPane.showMessageDialog(null, ad1);
		System.out.println(ad1);
		
		JOptionPane.showMessageDialog(null, "Creation d'un Emprunt en Cours pour l'Employee: ");
        System.out.println("\nCreation d'un Emprunt en Cours pour l'Employee: ");
		
		ep1.addEmpruntEnCours(new EmpruntEnCours("16/02/2019"));
	
		JOptionPane.showMessageDialog(null, ep1);
		System.out.println(ep1);
		
		
	}

}
