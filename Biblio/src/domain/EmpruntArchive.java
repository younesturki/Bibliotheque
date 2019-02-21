package domain;

public class EmpruntArchive {
	
	public EmpruntEnCours ep ;

	public EmpruntArchive(EmpruntEnCours ep) {
		this.ep = ep;
	}

	@Override
	public String toString() {
		return "EmpruntArchive [ep=" + ep + "]";
	}
	
	

}
