package domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplaire {
	
	private int idExemplaire ;
	private Date dateAchat ;
	private String isbn ;
	private EnumStatusExemplaire status ;

	private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

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



	public Exemplaire(int idExemplaire, String date, String isbn, EnumStatusExemplaire status) throws ParseException {
		super();
		this.idExemplaire = idExemplaire;
		this.dateAchat = formatter.parse(date);
		this.isbn = isbn;
		this.status = status;
	}



	@Override
	public String toString() {
		return "L'Exemplaire a pour numero: " + idExemplaire + " , sa date d'achat a eu lieu le : " + formatter.format(dateAchat) + ", son ISBN est : " + isbn + " , le status du livre est: " + status ;
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
