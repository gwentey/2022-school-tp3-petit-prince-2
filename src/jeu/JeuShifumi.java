package jeu;

import java.util.Random;

public class JeuShifumi extends JeuSimple {

	Random r = new Random();

	@Override
	public String jouerUnTour() {
		int nbAleatoire = r.nextInt(4);

		Shifumi[] tabS = Shifumi.values();

		return tabS[nbAleatoire] + " ";

	}

	@Override
	int arbitrer(String c1, String c2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
