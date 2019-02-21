package domain;

import java.util.Date;

public class Exemplaire {
	
	private int idExemplaire ;
	private Date dateAchat ;
	private String isbn ;
	private EnumStatusExemplaire status ;


	public Exemplaire() {
		super();
		// TODO Auto-generated constructor stub
	}



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



	public int getIdExemplaire() {
		return idExemplaire;
	}



	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public EnumStatusExemplaire getStatus() {
		return status;
	}



	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}
	
	

}
