package jeu;

public abstract class JeuSimple {
	
	private String nom;

	abstract String jouerUnTour();
	
	abstract int arbitrer(String c1, String c2);
	
	public String getNom() {
		return this.nom;
	}
	

	

	
}
