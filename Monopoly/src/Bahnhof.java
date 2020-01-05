import java.util.ArrayList;
import java.util.Scanner;

public class Bahnhof extends Feld {

	/**
	 * Der Besitzer des Bahnhofs
	 */
	private Spielfigur besitzer;

	/**
	 * hypothek -> ...
	 * wirdBesessen -> 
	 */
	private boolean hypothek, wirdBesessen;

	private String name;

	private int miete, kaufpreis, feldNr, hypothekenWert;

	/**
	 * Legt die Startwerte fuer die Bahnhoefe fest.
	 * 
	 * @param name:String Der Name des Bahnhofs
	 * @param feldNr:int Auf welchem Feld der Bahnhof ist
	 */
	public Bahnhof(String name, int feldNr) {
		this.name = name;
		this.feldNr = feldNr; // Soll der Index im Felder Array sein. Braucht man das überhaupt, wenn es schon
								// an der Stelle im Array ist?
		hypothek = false;
		hypothekenWert = 100;
		kaufpreis = 200;
		besitzer = null;
		wirdBesessen = false;

	}

	/**
	 * IN BAHNHOF 1. Pruefen, ob der Bahnhof besessen wird oder nicht. 
	 * Wenn ja ->
	 * Pruefen, wer ist Besitzer -> Besitzer == aktiver spieler wenn ja -> keine
	 * Miete und in switch-case mit Aktionen wenn nein -> zaehlen wie viele Bahnhoefe
	 * der Besitzer hat und aktiven spieler bezahlen lassen 
	 * Wenn nein -> 
	 * Spieler fragen, ob er den Bahnhof kaufen will oder nicht. 
	 * Pruefen, ob genug Geld
	 * vorhanden ist Wenn ja -> Bahnhof wird gekauft. 
	 * Wenn nein -> Zug ist vorbei.
	 * 
	 * 
	 * @param spieler:Spielfigur
	 * @param nichtspieler:ArrayList<Spielfigur>
	 * @param felder:Feld[]
	 */
	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		System.out.println("Sie sind jetzt auf dem Feld [" + name + "].");
		Scanner sc = new Scanner(System.in);
		int scanINT = 0;
		String scanSTR = "";

		if (wirdBesessen) {
			if (besitzer == spieler) {
				// Kann nichts machen oder?
				System.out.println("Ihnen gehört " + name + "schon.");
			} else {
				// Miete
				for (int i = 5; i < 36; i += 10) {

				}
			}
		} else {
			System.out.println("Möchten Sie den " + name + " kaufen[ja] oder nicht kaufen[nein]?");
			scanSTR = sc.next();
			switch (scanSTR) {
			case "ja":
				if (spieler.getGeld() > kaufpreis) {
					spieler.setGeld(spieler.getGeld() - kaufpreis);
					besitzer = spieler;
					wirdBesessen = true;
					System.out.println("Sie haben den " + name + " erfolgreich gekauft!");
				} else {
					System.out.println("Sie haben nicht genug Geld, um den " + name + " zu kaufen.");
				}
				break;
			case "nein":
				System.out.println("Sie kaufen den " + name + " nicht.");
				break;
			}
		}
		
	}

	public Spielfigur getBesitzer() {
		return besitzer;
	}

	public void setBesitzer(Spielfigur besitzer) {
		this.besitzer = besitzer;
	}

	public boolean isHypothek() {
		return hypothek;
	}

	public void setHypothek(boolean hypothek) {
		this.hypothek = hypothek;
	}

	public boolean isWirdBesessen() {
		return wirdBesessen;
	}

	public void setWirdBesessen(boolean wirdBesessen) {
		this.wirdBesessen = wirdBesessen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMiete() {
		return miete;
	}

	public void setMiete(int miete) {
		this.miete = miete;
	}

	public int getKaufpreis() {
		return kaufpreis;
	}

	public void setKaufpreis(int kaufpreis) {
		this.kaufpreis = kaufpreis;
	}

	public int getFeldNr() {
		return feldNr;
	}

	public void setFeldNr(int feldNr) {
		this.feldNr = feldNr;
	}

	public int getHypothekenWert() {
		return hypothekenWert;
	}

	public void setHypothekenWert(int hypothekenWert) {
		this.hypothekenWert = hypothekenWert;
	}

}
