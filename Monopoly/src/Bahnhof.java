import java.util.ArrayList;
import java.util.Scanner;

public class Bahnhof extends Feld {

	private Spielfigur besitzer;

	private boolean hypothek, wirdBesessen;

	private String name;

	private int miete, kaufpreis, feldNr, hypothekenWert;

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
	 * 
	 * @param spieler
	 * @param nichtspieler
	 * @param felder
	 */
	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		Scanner sc = new Scanner(System.in);
		int scan = 0;
		// Prüfung, wer der aktive Spieler ist
		Spielfigur aktiverSpieler = spieler; // zum Beispiel

		if (wirdBesessen) {
			if (besitzer == aktiverSpieler) {
				
			} else {
				
			}

			/*
			 * Prüfen, wer ist Besitzer -> Besitzer == aktiver spieler wenn ja -> keine
			 * Miete und in switch-case mit Aktionen wenn nein -> zählen wie viele Bahnhöfe
			 * der Besitzer hat und aktiven spieler bezahlen lassen
			 */
		} else {
			System.out.println("Möchten Sie den " + name + " kaufen[1] oder nicht kaufen[2]?");
			scan = sc.nextInt();
			switch (scan) {
			case 1:
				if (aktiverSpieler.getGeld() > kaufpreis) {
					besitzer = aktiverSpieler;
					wirdBesessen = true;
					aktiverSpieler.setGeld(aktiverSpieler.getGeld() - kaufpreis);
					System.out.println("Sie haben den " + name + " erfolgreich gekauft!");
				} else {
					System.out.println("Sie haben nicht genug Geld, um den " + name + " zu kaufen.");
				}
				break;
			case 2:
				System.out.println("Sie kaufen den " + name + " nicht.");
				break;
			}
		}

	}

}
