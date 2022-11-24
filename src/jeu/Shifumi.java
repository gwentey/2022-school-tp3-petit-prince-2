package jeu;

public enum Shifumi {

	
	PIERRE("Pierre"),
	FEU("Feu"),
	CISEAUX("Ciseaux");
	
	private String nom;
	
	private Shifumi(String nom) {
		
	}
	
	public String getNom() {
		return this.nom;
	}

}
