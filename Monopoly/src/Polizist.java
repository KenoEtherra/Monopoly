import java.util.ArrayList;

public class Polizist extends Feld {

	public Polizist() {
		super();
	}
	/**
	 * Spieler geht ins Gefängnis
	 * Position setzen
	 * Ausssetzen Timer setzen
	 */
	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		System.out.println(spieler.getName() + " ist der Polizei aufgefallen und muss ins Gefängnis!");
		spieler.setPosition(10);
		spieler.setAussetzen(3);
	}
}
