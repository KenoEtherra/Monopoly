import java.util.ArrayList;

public class Polizist extends Feld {

	public Polizist() {
		super();
	}
	/**
	 * Spieler geht ins Gef�ngnis
	 * Position setzen
	 * Ausssetzen Timer setzen
	 */
	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		System.out.println(spieler.getName() + " ist der Polizei aufgefallen und muss ins Gef�ngnis!");
		spieler.setPosition(10);
		spieler.setAussetzen(3);
	}
}
