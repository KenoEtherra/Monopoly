import java.util.ArrayList;

public class Los extends Feld {

	private int betrag = 400; 

	public Los() {
		super();
	}
	/**
	 * Spieler erhält 400 €
	 * Geld beim Spieler hinzufügen
	 */
	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		System.out.println (spieler.getName() + " hat das Feld 'Los' betreten und erhält 400 €");
		spieler.setGeld(spieler.getGeld() + betrag);
	}
}
