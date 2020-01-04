import java.util.ArrayList;

public class Los extends Feld {

	private int betrag = 400; // 4000 oder 400?

	public Los() {
		super();
	}

	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder, int betrag) {
		System.out.println (spieler.getName() + " hat das Fel'Los' betreten und erhält 400 €");
		Spielfigur.getGeld(Geld + betrag);
	}
}
