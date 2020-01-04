import java.util.ArrayList;

public class Strasse extends Feld {

	private boolean hypothek, wirdBesessen, hotel;

	private Spielfigur besitzer;

	private String name, farbe;

	private int haus, miete, kaufpreis, hypothekenwert;

	public Strasse(int serie, int strasse, String name, String farbe) {
		this.name = name;
		this.farbe = farbe;
		haus = 0;
		besitzer = null;
		wirdBesessen = false;
		hypothek = false;

		switch (farbe) {
		case "lila":
			kaufpreis = 60;
			hypothekenwert = 30;
			break;
		case "hellblau":
			if (name.equals("PostStrasse")) {
				kaufpreis = 120;
				hypothekenwert = 60;
			} else {
				kaufpreis = 100;
				hypothekenwert = 50;
			}
			break;
		case "pink":
			if (name.equals("Neue Strasse")) {
				kaufpreis = 160;
				hypothekenwert = 80;
			} else {
				kaufpreis = 140;
				hypothekenwert = 70;
			}
			break;
		case "orange":
			if (name.equals("Berliner Strasse")) {
				kaufpreis = 200;
				hypothekenwert = 100;
			} else {
				kaufpreis = 180;
				hypothekenwert = 90;
			}
			break;
		case "rot":
			if (name.equals("Opernplatz")) {
				kaufpreis = 240;
				hypothekenwert = 120;
			} else {
				kaufpreis = 220;
				hypothekenwert = 110;
			}
			break;
		case "gelb":
			if (name.equals("GoetheStrasse")) {
				kaufpreis = 280;
				hypothekenwert = 140;
			} else {
				kaufpreis = 260;
				hypothekenwert = 130;
			}
			break;
		case "grün":
			if (name.equals("BahnhofStrasse")) {
				kaufpreis = 320;
				hypothekenwert = 160;
			} else {
				kaufpreis = 300;
				hypothekenwert = 150;
			}
			break;
		case "blau":
			if (name.equals("Schlossallee")) {
				kaufpreis = 400;
				hypothekenwert = 200;
			} else {
				kaufpreis = 350;
				hypothekenwert = 175;
			}
			break;
		}
	}

	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {

	}

	public int getHaus() {
		return haus;
	}

	public void setHaus(int haus) {
		this.haus = haus;
	}

	public boolean isHotel() {
		return hotel;
	}

	public void setHotel(boolean hotel) {
		this.hotel = hotel;
	}

	public Spielfigur getBesitzer() {
		return besitzer;
	}

	public void setBesitzer(Spielfigur besitzer) {
		this.besitzer = besitzer;
	}

	public int getMiete() {
		return miete;
	}

	public void setMiete(int miete) {
		this.miete = miete;
	}

	public boolean isHypothek() {
		return hypothek;
	}

	public void setHypothek(boolean hypothek) {
		this.hypothek = hypothek;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isWirdBesessen() {
		return wirdBesessen;
	}

	public void setWirdBesessen(boolean wirdBesessen) {
		this.wirdBesessen = wirdBesessen;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public int getKaufpreis() {
		return kaufpreis;
	}

	public void setKaufpreis(int kaufpreis) {
		this.kaufpreis = kaufpreis;
	}

	public int getHypothekenwert() {
		return hypothekenwert;
	}

	public void setHypothekenwert(int hypothekenwert) {
		this.hypothekenwert = hypothekenwert;
	}
}
