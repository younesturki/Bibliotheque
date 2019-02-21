package test;

import java.text.ParseException;

import domain.Adherent;
import domain.EmpruntEnCours;

public class TestAdherentTroisEmprunts {

	public static void main(String[] args) throws ParseException {
		

        System.out.println("Un emprunt est en retard l'adherent ne peux plus emprunter ");
		
		Adherent ad = new Adherent();
		
		ad.addEmpruntEnCours(new EmpruntEnCours("15/02/2019"));
		ad.addEmpruntEnCours(new EmpruntEnCours("15/02/2019"));
		ad.addEmpruntEnCours(new EmpruntEnCours("15/02/2019"));
		
		ad.isConditionsPretAcceptees();
		
	}

}
