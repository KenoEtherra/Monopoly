public class Spielfeld {

	private Feld[] felder;

	public static void main(String[] args) {
		Spielfigur spieler1 = new Spielfigur();
		System.out.println(spieler1.wuerfeln());
		System.out.println(spieler1.getPasch());
	}
}
