package domain;

import java.util.Date;

public class Exemplaire {
	
	private int idExemplaire ;
	private Date dateAchat ;
	private String isbn ;
	private EnumStatusExemplaire status ;


	public Exemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}



	public Exemplaire(int idExemplaire, String isbn) {
		this.idExemplaire = idExemplaire;
		this.isbn = isbn;
	}



	@Override
	public String toString() {
		return "L'Exemplaire a pour numero: " + idExemplaire ;
	}
	
	

}
