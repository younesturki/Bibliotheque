package dao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import domain.EnumStatusExemplaire;
import domain.Exemplaire;

public class ExemplaireDao {
	
	public Exemplaire findByExemplaire(int idExemplaire) throws ParseException {
		
		Exemplaire ex = new Exemplaire(1, "10/08/1990","014656",EnumStatusExemplaire.DISPONIBLE);
		Exemplaire ex1 = new Exemplaire(2, "17/01/1981","014565",EnumStatusExemplaire.DISPONIBLE);
		Exemplaire ex2 = new Exemplaire(3, "21/02/2019","598852",EnumStatusExemplaire.DISPONIBLE);
		Exemplaire ex3 = new Exemplaire(4, "25/06/2015","567896",EnumStatusExemplaire.DISPONIBLE);
		List<Exemplaire> exe = new ArrayList<>();
		
		exe.add(ex);
		exe.add(ex1);
		exe.add(ex2);
		exe.add(ex3);
	    return exe.get(idExemplaire - 1);
		
	 
	   }

	

}
