package dao;

import java.util.List;

import domain.EmpruntEnCours;
import domain.Utilisateur;

public class EmpruntEnCoursDao {
	
	public Utilisateur util ;
	
	 public List<EmpruntEnCours> findByEmprunt(int id) {
		 
	    return util.getEmpruntEnCours();
	   }

}
