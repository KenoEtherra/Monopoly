import java.util.ArrayList;

public class Bahnhof extends Feld {

    private Spielfigur besitzer;

    private boolean hypothek;

    private String name;

    private int miete, kaufpreis, feldNr;

    public Bahnhof(String name, int feldNr) {
    	this.name = name;
    	this.feldNr = feldNr;
    	hypothek = false;
    	kaufpreis = 200;
    }

	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		// TODO Auto-generated method stub
	}
}
