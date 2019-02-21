package test;

import domain.Adherent;
import domain.EmpruntEnCours;

public class TestAdherentEnRetard {
	
	public static void main(String [] args) throws Exception {
		
		System.out.println("Un emprunt est en retard l'adherent ne peux plus emprunter ");
		
		Adherent ad = new Adherent();
		
		ad.addEmpruntEnCours(new EmpruntEnCours("01/02/2019"));
		
		ad.isConditionsPretAcceptees();
		
	}

}
