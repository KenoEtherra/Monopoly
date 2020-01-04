import java.util.ArrayList;

public class Bahnhof extends Feld {

    private Spielfigur besitzer;

    private boolean hypothek;

    private String name;

    private int miete, kaufpreis, feldNr, hypothekenWert;

    public Bahnhof(String name, int feldNr) {
    	this.name = name;
    	this.feldNr = feldNr; //Soll der Index im Felder Array sein. Braucht man das überhaupt?
    	hypothek = false;
    	hypothekenWert = 100;
    	kaufpreis = 200;
    	besitzer = null;
    	
    }

	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		/*Prüfung, wer der aktive Spieler ist
		Danach prüfen, wer ist Besitzer -> Besitzer == aktiver spieler 
		wenn ja -> keine Miete und in switch-case mit Aktionen
		wenn nein -> zählen wie viele Bahnhöfe der Besitzer hat und aktiven spieler bezahlen lassen*/
		
		
	}
	public void bezahlen(Spielfigur spieler, ArrayList<Spielfeld> nichtspieler, int betrag) {
		
	}
	
}
