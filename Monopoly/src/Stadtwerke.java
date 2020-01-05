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
		
		if (wirdBesessen) {
			if (besitzer == spieler) {
				// Kann nichts machen oder?
			} else {
				// Miete
				// Brauche den Würfelwert dafür.
			}
		} else {
			System.out.println("Möchten Sie das " + name + " kaufen[1] oder nicht kaufen[2]?");
			scan = sc.nextInt();
			switch (scan) {
			case 1:
				if (spieler.getGeld() > kaufpreis) {
					besitzer = spieler;
					wirdBesessen = true;
					spieler.setGeld(spieler.getGeld() - kaufpreis);
					System.out.println("Sie haben das " + name + " erfolgreich gekauft!");
				} else {
					System.out.println("Sie haben nicht genug Geld, um das " + name + " zu kaufen.");
				}
				break;
			case 2:
				System.out.println("Sie kaufen das " + name + " nicht und Ihr Zug ist vorbei.");
				break;
			}
		}
		sc.close();
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
