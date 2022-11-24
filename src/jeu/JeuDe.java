package jeu;

import java.util.Random;

public class JeuDe extends JeuSimple {

	Random r = new Random();

	public JeuDe() {

	}

	@Override
	public String jouerUnTour() {

		String s = r.nextInt(7) + " ";

		return s;
	}

	@Override
	int arbitrer(String c1, String c2) {

		int nb1 = Integer.valueOf(c1);
		int nb2 = Integer.valueOf(c2);

		if (nb1 > nb2) {
			return 1;
			
		} else if (nb1 < nb2) {
			
			return -1;

		}
		return 0;
	}

}
