import java.util.ArrayList;

public class Stadtwerke extends Feld {

	private Spielfigur besitzer;

	private boolean hypothek;

	private String name;

	private int type, hypothekenWert;

	public Stadtwerke(int werkNummer, String name) {
		this.name = name;
		hypothek = false;
		
	}

	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		// TODO Auto-generated method stub

	}
	
	public void bezahlen(Spielfigur spieler, ArrayList<Spielfeld> nichtspieler, int betrag) {
		
	}
}
