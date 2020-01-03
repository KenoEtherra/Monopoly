import java.util.ArrayList;

public class Bahnhof extends Feld {

    private Spielfigur besitzer;

    private boolean hypothek;

    private String name;

    private int miete;

    public Bahnhof(String name) {
    	this.name = name;
    	hypothek = false;
    }

	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		// TODO Auto-generated method stub
	}
}
