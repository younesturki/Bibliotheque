package test;

import java.text.ParseException;

import domain.Employee;
import domain.EmpruntEnCours;

public class TestEmployeTroisEmprunts {

	public static void main(String[] args) throws ParseException {
		
        System.out.println("Un emprunt est en retard , l'employe  peux toujours emprunter ");
		
		Employee ep1 = new Employee();
		
		ep1.addEmpruntEnCours(new EmpruntEnCours("15/02/2019",1));
		ep1.addEmpruntEnCours(new EmpruntEnCours("15/02/2019",2));
		ep1.addEmpruntEnCours(new EmpruntEnCours("15/02/2019",3));
		
		ep1.isConditionsPretAcceptees();

	}

}
