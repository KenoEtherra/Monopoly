import java.util.ArrayList;

public class Freiparken extends Feld {

	public Freiparken() {
		super();
	}

	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		System.out.println("Du stehst auf dem Frei Parken Feld.");
		System.out.println("Des Wegen erhälst du den Inhalt des Steuertopfes.");
	}

}
