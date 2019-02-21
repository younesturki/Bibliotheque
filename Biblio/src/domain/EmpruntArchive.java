package domain;

import java.util.Date;

public class EmpruntArchive {
	
	public EmpruntEnCours ep = new EmpruntEnCours();

	public EmpruntArchive(EmpruntEnCours ep) {
		this.ep = ep;
	}

	@Override
	public String toString() {
		return "l'emprunt est archivé : " + ep.toString() + " et la date de retour est: " + new Date();
	}
	
	

}
