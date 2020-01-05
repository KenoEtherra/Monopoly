import java.util.ArrayList;

public class Steuer extends Feld {

	private int betrag1 = 200;
	private int betrag2 = 100;

	public Steuer() {
		super();
	}

	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		if (spieler.getPosition() == 4) {
			spieler.setGeld (spieler.getGeld() - betrag1);
			System.out.println(spieler.getName() + "muss 200 € Einkommenssteuer zahlen.");
		}
		if (spieler.getPosition() == 38) {
			spieler.setGeld (spieler.getGeld() - betrag2);
			System.out.println(spieler.getName() + "muss 100 € Zusatzsteuer zahlen.");
		}

	}
}
