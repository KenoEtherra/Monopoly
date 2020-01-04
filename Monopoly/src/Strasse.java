import java.util.ArrayList;

public class Strasse extends Feld {

	private int haus;

	private boolean hotel; //Ein Kommentar zum Testen

	private int miete;

	private boolean hypothek;

	private Spielfigur besitzer;

	private String name;

	public Strasse(int serie, int strasse) {
	}

	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		// TODO Auto-generated method stub
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
}
