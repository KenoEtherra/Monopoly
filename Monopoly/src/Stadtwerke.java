import java.util.ArrayList;
import java.util.Scanner;

public class Stadtwerke extends Feld {

	private Spielfigur besitzer;

	private boolean hypothek, wirdBesessen;

	private String name;

	private int type, hypothekenWert, kaufpreis, werkNummer;

	public Stadtwerke(int werkNummer, String name) {
		this.name = name;
		this.werkNummer = werkNummer;
		hypothek = false;
		hypothekenWert = 75;
		kaufpreis = 150;
		wirdBesessen = false;
		besitzer = null;

	}

	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		Scanner sc = new Scanner(System.in);
		int scan = 0;
		Spielfigur aktiverSpieler = spieler;

		if (wirdBesessen) {
			if (besitzer == aktiverSpieler) {

			} else {
				// Miete
			}
		} else {
			System.out.println("Möchten Sie das " + name + " kaufen[1] oder nicht kaufen[2]?");
			scan = sc.nextInt();
			switch (scan) {
			case 1:
				if (aktiverSpieler.getGeld() > kaufpreis) {
					besitzer = aktiverSpieler;
					wirdBesessen = true;
					aktiverSpieler.setGeld(aktiverSpieler.getGeld() - kaufpreis);
					System.out.println("Sie haben das " + name + " erfolgreich gekauft!");
				} else {
					System.out.println("Sie haben nicht genug Geld, um das " + name + " zu kaufen.");
				}
				break;
			case 2:
				System.out.println("Sie kaufen das " + name + " nicht.");
				break;
			}
		}
	}

}
