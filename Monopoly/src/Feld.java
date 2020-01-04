import java.util.ArrayList;

public abstract class Feld {

	public abstract void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder);
	
	public abstract void bezahlen(Spielfigur spieler, ArrayList<Spielfeld> nichtspieler, int betrag);
}

