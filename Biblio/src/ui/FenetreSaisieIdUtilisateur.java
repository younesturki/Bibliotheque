package ui;

import javax.swing.JOptionPane;

import domain.Utilisateur;

public class FenetreSaisieIdUtilisateur {
	
	public Utilisateur ad ;
	
	public void afficherUtilisateur() {
		
		String message = JOptionPane.showInputDialog("Entrer votre ID");
		
		Integer id = Integer.parseInt(message);
		
		ad.setIdUtilisateur(id);
		
		String message1 = String.format("Votre ID est : %d", id);
		
		JOptionPane.showMessageDialog(null, message1);
		
	}

}
