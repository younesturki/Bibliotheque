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


	public boolean isConditionsPretAcceptees() throws Exception {
		
		
		
		long date = (new Date().getTime() - ep.getDateEmprunt().getTime())/86400000 ;
		
		if (super.getNbEmpruntsEnCours() <= nbMaxPret && date < 15) {
			
			return true ;
		}
		else throw new Exception("La duree de l'emprunt est de "  +"Vous ne pouvez plus emprunter!!!");
	   }
	   
	   
	   public int getNbRetards()  {
	    return 0;
	   }



	@Override
	public String toString() {
	
		return "l'Adherent est un " + super.toString() ;
	}

	   
	  
}
