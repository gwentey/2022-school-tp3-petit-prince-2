package petitPrince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;

public class PetitPrince0 implements Sujet {
	
	ConsoleJavaBoy c = new ConsoleJavaBoy(this);
	public static int COUNT = 0;
	
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getArgent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void run() {

		c.parler("Salut je suis " + this.getNom());
		c.seDirigerVers(0);
		PetitPrince0.COUNT++;
		
	}

}
