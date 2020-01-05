import java.util.ArrayList;

public class Steuer extends Feld {

	private int betrag1 = 200;
	private int betrag2 = 100;
	
	private int steuertopf = 0;

	public Steuer() {
		super();
	}

	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		if (spieler.getPosition() == 4) {
			spieler.setGeld (spieler.getGeld() - betrag1);
			setSteuertopf (getSteuertopf() + betrag1);
			System.out.println(spieler.getName() + "muss 200 € Einkommenssteuer zahlen.");
		}
		if (spieler.getPosition() == 38) {
			spieler.setGeld (spieler.getGeld() - betrag2);
			setSteuertopf (getSteuertopf() + betrag2);
			System.out.println(spieler.getName() + "muss 100 € Zusatzsteuer zahlen.");
		}

	}

	public int getSteuertopf() {
		return steuertopf;
	}

	public void setSteuertopf(int steuertopf) {
		this.steuertopf = steuertopf;
	}
}
