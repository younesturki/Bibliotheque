package domain;

import java.util.Date;

public class Employee extends Utilisateur {
	
	private String codeMatricule ;
	private EnumCategorieEmploye categorieEmployee ;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer idUtilisateur, String pwd, String pseudonyme) {
		super(idUtilisateur, pwd, pseudonyme);
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer idUtilisateur) {
		super(idUtilisateur);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "L'Employee est un " + super.toString();
	}
	
	@Override
	public boolean isConditionsPretAcceptees() {
		
		long date = (new Date().getTime() - ep.getDateEmprunt().getTime())/86400000 ;
		if (date > 15 || super.getNbEmpruntsEnCours() >= 3) {
			System.err.println("La date de Votre emprunt est de: " + date + " jours, et le nombre d'emprunt est de: " + super.getNbEmpruntsEnCours() + " mais vous pouvez toujours emprunter");
		}
		return true;
	}
	
	

}
