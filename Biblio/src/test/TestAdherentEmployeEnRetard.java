package test;

import java.text.ParseException;

import domain.Employee;
import domain.EmpruntEnCours;

public class TestAdherentEmployeEnRetard {
	
	public static void main(String [] args) throws ParseException {
		
		System.out.println("Un emprunt est en retard l'employe peux toujours emprunter ");
		
		Employee ep1 = new Employee();
		
		ep1.addEmpruntEnCours(new EmpruntEnCours("01/02/2019"));
		
		ep1.isConditionsPretAcceptees();
	}

}
