import java.util.ArrayList;

public class Gefaengnis extends Feld {

	public Gefaengnis() {
		super();
	}
	/**
	 * Der Spieler ist nur zu Besuch, keine weitere Aktion n�tig
	 */
	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		System.out.println(spieler.getName() + " ist zu Besuch im Gef�ngnis.");

	}
}
