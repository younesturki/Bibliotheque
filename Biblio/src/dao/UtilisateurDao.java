package dao;

import domain.Adherent;
import domain.Employee;

public class UtilisateurDao {

	
	public Adherent findByKey(int idUtilisateur)  {
		
	    return new Adherent(idUtilisateur);
	   }
	

	public Employee findByEmployee(int idUtilisateur)  {
		
	    return new Employee(idUtilisateur);
	   }
}
