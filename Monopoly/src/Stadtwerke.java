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
		System.out.println("Sie sind jetzt auf dem Feld [" + name + "].");
		Scanner sc = new Scanner(System.in);
		String scanSTR = "";

		if (wirdBesessen) {
			if (besitzer == spieler) {
				// Kann nichts machen oder?
				System.out.println("Ihnen gehört das" + name + " schon.");
			} else {
				int miete = 0;
				int wuerfelWert = spieler.wuerfeln();
				System.out.println("Es wird der Mietwert gewürfelt: " + wuerfelWert);
				int gesamterBesitz = 0;
				Stadtwerke stadtwerk1 = (Stadtwerke) felder[12];
				Stadtwerke stadtwerk2 = (Stadtwerke) felder[12];
				if (stadtwerk1.getBesitzer() == besitzer) {
					gesamterBesitz++;
				} else if (stadtwerk2.getBesitzer() == besitzer) {
					gesamterBesitz++;
				}
				switch (gesamterBesitz) {
				case 1:
					miete = wuerfelWert * 4;
					System.out.println("Sie zahlen " + miete + "€ Miete.");
					spieler.setGeld(spieler.getGeld() - miete);
					break;
				case 2:
					miete = wuerfelWert * 10;
					System.out.println("Sie zahlen " + miete + "€ Miete.");
					spieler.setGeld(spieler.getGeld() - miete);
					break;
				default:
					break;
				}
				
			}
		} else {
			System.out.println("Möchten Sie das " + name + " kaufen[ja] oder nicht kaufen[nein]?");
			scanSTR = sc.next();
			switch (scanSTR) {
			case "ja":
				if (spieler.getGeld() > kaufpreis) {
					besitzer = spieler;
					wirdBesessen = true;
					spieler.setGeld(spieler.getGeld() - kaufpreis);
					System.out.println("Sie haben das " + name + " erfolgreich gekauft!");
				} else {
					System.out.println("Sie haben nicht genug Geld, um das " + name + " zu kaufen.");
				}
				break;
			case "nein":
				System.out.println("Sie kaufen das " + name + " nicht.");
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getHypothekenWert() {
		return hypothekenWert;
	}

	public void setHypothekenWert(int hypothekenWert) {
		this.hypothekenWert = hypothekenWert;
	}

	public int getKaufpreis() {
		return kaufpreis;
	}

	public void setKaufpreis(int kaufpreis) {
		this.kaufpreis = kaufpreis;
	}

	public int getWerkNummer() {
		return werkNummer;
	}

	public void setWerkNummer(int werkNummer) {
		this.werkNummer = werkNummer;
	}

}
