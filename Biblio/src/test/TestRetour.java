package test;

import java.text.ParseException;

import domain.Adherent;
import domain.EmpruntEnCours;

public class TestRetour {

	public static void main(String[] args) throws ParseException {
		
        Adherent ad = new Adherent();
        
        EmpruntEnCours em1 = new EmpruntEnCours("15/02/2019",1);
        EmpruntEnCours em2 = new EmpruntEnCours("15/02/2019",2);
        EmpruntEnCours em3 = new EmpruntEnCours("15/02/2019",3);
		
		ad.addEmpruntEnCours(em1);
		ad.addEmpruntEnCours(em2);
		ad.addEmpruntEnCours(em3);
		
		ad.removeEmprunt(em2);
		int empruntEnCours = ad.getNbEmpruntsEnCours();
		
		System.out.println(empruntEnCours);

	}

}
