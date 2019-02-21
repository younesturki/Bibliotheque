package domain;

public class Employee extends Utilisateur {
	
	private String codeMatricule ;
	private EnumCategorieEmploye categorieEmployee ;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer idUtilisateur, String pwd, String pseudonyme) {
		super(idUtilisateur, pwd, pseudonyme);
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer idUtilisateur) {
		super(idUtilisateur);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "L'Employee est un " + super.toString();
	}
	
	

}
