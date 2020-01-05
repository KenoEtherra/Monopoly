import java.util.ArrayList;

public class Steuer extends Feld {

	private int betrag1 = 200;
	private int betrag2 = 100;
	
	private int steuertopf = 0;

	public Steuer() {
		super();
	}
	/**
	 * Prüfen auf welcher Position sich der Spieler befindet
	 * 2 Steuerarten, die beim SPieler abgezogen und in den Steuertopf eingezahlt werden
	 * Steuer 1: Einkommenssteuer von 200 €
	 * Steuer 2: Zusatzsteuer von 100 €
	 * Feld Freiparken, bei dem die bisher gezahlten Steuern entnommen werden
	 */
	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		if (spieler.getPosition() == 4) {
			spieler.setGeld (spieler.getGeld() - betrag1);
			setSteuertopf (getSteuertopf() + betrag1);
			System.out.println(spieler.getName() + " ist auf dem Einkommenssteuerfeld und muss 200 € Einkommenssteuer zahlen.");
		}
		if (spieler.getPosition() == 38) {
			spieler.setGeld (spieler.getGeld() - betrag2);
			setSteuertopf (getSteuertopf() + betrag2);
			System.out.println(spieler.getName() + " ist auf dem Zusatzsteuerfeld und muss 100 € Zusatzsteuer zahlen.");
		}
		if (spieler.getPosition() == 20) {
			spieler.setGeld(spieler.getGeld() + steuertopf);
			System.out.println(spieler.getName()+" ist auf dem Freiparken-Feld");
			System.out.println("Er erhält den Inhalt des Steuertopfes in Höhe von " + steuertopf + " €.");
			setSteuertopf(0);
		}

	}

	public int getSteuertopf() {
		return steuertopf;
	}

	public void setSteuertopf(int steuertopf) {
		this.steuertopf = steuertopf;
	}
}
