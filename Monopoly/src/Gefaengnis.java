import java.util.ArrayList;

public class Gefaengnis extends Feld {

	public Gefaengnis() {
		super();
	}

	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		System.out.println(spieler.getName() + " ist zu Besuch im Gefängnis.");

	}
}
