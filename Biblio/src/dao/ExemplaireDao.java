package dao;

import domain.Exemplaire;

public class ExemplaireDao {
	
	public Exemplaire findByExemplaire(int idExemplaire) {
		
	    return new Exemplaire(idExemplaire);
	   }

	

}
