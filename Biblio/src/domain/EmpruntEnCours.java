package domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpruntEnCours {
	
	  private Date dateEmprunt;
	  private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	  public Exemplaire exp = new Exemplaire() ;
	   
	public EmpruntEnCours() {
	}

	   
	public EmpruntEnCours(String datestr) throws ParseException {
	
		this.dateEmprunt = formatter.parse(datestr);
		
		
	}
	
	public EmpruntEnCours(String datestr,int idExemplaire) throws ParseException {

		this.dateEmprunt  = formatter.parse(datestr);
		exp.setIdExemplaire(idExemplaire);
		exp.setStatus(EnumStatusExemplaire.PRETE);
	}


	public Date setDateLoan()  {
	    return null;
	   }


	@Override
	public String toString() {
		return "La date d'emprunt est le: " + formatter.format(dateEmprunt);
	}


	public Date getDateEmprunt() {
		return dateEmprunt;
	}


	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	
	

}
