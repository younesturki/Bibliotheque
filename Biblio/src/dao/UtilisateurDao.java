package dao;

import java.util.ArrayList;
import java.util.List;

import domain.Adherent;
import domain.Employee;
import domain.EnumCategorieEmploye;

public class UtilisateurDao {

	
	public Adherent findByKey(int idUtilisateur)  {
		
		Adherent ad = new Adherent(1, "Salut10","0146567896");
		Adherent ad1 = new Adherent(2, "Maman10","01456567887");
		Adherent ad2 = new Adherent(3, "Wech","0146598852");
		Adherent ad3 = new Adherent(4, "Coucou","0135567896");
		List<Adherent> adhe = new ArrayList<>();
		
		adhe.add(ad);
		adhe.add(ad1);
		adhe.add(ad2);
		adhe.add(ad3);
	    return adhe.get(idUtilisateur - 1);
	   }
	

	public Employee findByEmployee(int idUtilisateur)  {
		
		Employee ep = new Employee(1, "Paou",EnumCategorieEmploye.BIBLIOTHECAIRE);
		Employee ep1 = new Employee(2, "Mou",EnumCategorieEmploye.GESTIONNAIRE_DE_FONDS);
		Employee ep2 = new Employee(3, "Wech256",EnumCategorieEmploye.RESPONSABLE);
		Employee ep3 = new Employee(4, "Louo",EnumCategorieEmploye.BIBLIOTHECAIRE);
		List<Employee> adhe = new ArrayList<>();
		
		adhe.add(ep);
		adhe.add(ep1);
		adhe.add(ep2);
		adhe.add(ep3);
	    return adhe.get(idUtilisateur - 1);
	   }
}
