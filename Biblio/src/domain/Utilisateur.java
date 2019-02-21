package domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Utilisateur {
	
    private int idUtilisateur ;
	
	private String pwd ;
	
	private String pseudonyme ;
	 
	private List<EmpruntEnCours> emprunt ;
	
	public EmpruntEnCours ep = new EmpruntEnCours();
	
	public int n2 = 10 ;
	
	public Utilisateur() {
	}

	
	public Utilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
		this.pwd = "Salut" + n2;
		n2++;
	}


	public Utilisateur(Integer idUtilisateur, String pwd, String pseudonyme) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
		this.pseudonyme = pseudonyme;
	}
	
	 
	public Utilisateur(Integer idUtilisateur, String pwd) {
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
	}


	public void addEmpruntEnCours(EmpruntEnCours ep) {
		
		if (emprunt == null) {
			
			emprunt = new ArrayList<>();
			
		}
		this.ep = ep;
		emprunt.add(ep);
		
	}
	
	public List<EmpruntEnCours> getEmpruntEnCours() {
		
		
		return emprunt;
		
	}
	
	public void removeEmprunt(EmpruntEnCours ep) {
		
		emprunt.remove(ep);
		EmpruntArchive ar = new EmpruntArchive(ep);	
		System.out.println(ar);
	}
	public int getNbEmpruntsEnCours() {
		
		return emprunt.size();
	}
	
	public abstract boolean isConditionsPretAcceptees() ;

	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPseudonyme() {
		return pseudonyme;
	}

	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}


	@Override
	public String toString() {
		if (emprunt != null) {
			return  "Utilisateur qui a pour identifiant: " + idUtilisateur + " et sa date d'emprunt est le: "
					+ ep.getDateEmprunt();
					
		}
		 
		return "Utilisateur qui a pour identifiant: " + idUtilisateur + " son mot de passe est: " + pwd ;
	}
	
	
	
}
