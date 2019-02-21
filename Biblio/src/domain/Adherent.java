package domain;

import java.util.Date;

public class Adherent extends Utilisateur {
	
	   private String telephone;
	   private static Integer nbMaxPret = 3;
	   private static Integer dureeMaxPrets = 15;
	   
	   
	public Adherent() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Adherent(Integer idUtilisateur) {
		super(idUtilisateur);
		// TODO Auto-generated constructor stub
	}

	
	public boolean isConditionsPretAcceptees() {
		
		
		
		long date = (new Date().getTime() - ep.getDateEmprunt().getTime())/86400000 ;
		
		if (super.getNbEmpruntsEnCours() < nbMaxPret && date < 15) {
			
			System.out.println("Emprunt OK!!!");
			
			return true ;
		} else
			try {
				throw new Exception("La duree de l'emprunt est de "  + date + " jours et le nombre d'emprunt est de " + super.getNbEmpruntsEnCours() + " , par consequent vous ne pouvez plus emprunter!!!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println("La duree de l'emprunt est de "  + date + " jours et le nombre d'emprunt est de " + super.getNbEmpruntsEnCours() + " , par consequent vous ne pouvez plus emprunter!!!");
			}
		return false;	
	
	   }
	   
	   
	   public int getNbRetards()  {
	    return 0;
	   }



	@Override
	public String toString() {
	
		return "l'Adherent est un " + super.toString() ;
	}

	   
	  
}
