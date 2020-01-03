import java.util.ArrayList;

public class Steuer extends Feld {

	private int betrag;

	public Steuer(int artNummer) {
	}

	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder, int betrag) {
		if (get.Position == 4) {
			spieler.getGeld =- 200;
		}
		if (get.Positiom == 38) {
			spieler.getGeld =- 100;
		}

	}
}
