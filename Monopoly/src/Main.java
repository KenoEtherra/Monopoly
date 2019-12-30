import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Spielfigur> alleSpieler = new ArrayList<Spielfigur>();

    public static void main(String[] args) {
        System.out.println("Willkommen bei Monopoly!");
        initializiereSpieler();
        Spielfeld spielfeld = new Spielfeld();
        spielfeld.starteSpiel();
    }

    /**
     * Hilfsfuntkion um die grad nicht am zug befindenen Spieler herauszufinden
     */
    public static ArrayList<Spielfigur> getNichtspieler(Spielfigur Spieler) {
        ArrayList<Spielfigur> nichtSpieler = alleSpieler;
        nichtSpieler.remove(Spieler);
        return nichtSpieler;
    }

    /**
     * Abfrage wie viele Spieler teilnehmen
     * Erstellt alle benötigten Spieler in einer Arraylist
     */
    private static void initializiereSpieler() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Spieler sollen mitspielen?");
        int anzahl;
        while (true) {
            anzahl = scanner.nextInt();
            if (anzahl > 0 && anzahl < 5) {
                break;
            } else {
                System.out.println("Es können nur 1 bis 4 Spieler teilnehmen!");
            }
        }
        for (int i = 1; i <= anzahl; i++) {
            Spielfigur spieler = new Spielfigur("Spieler " + i);
            alleSpieler.add(spieler);
        }
    }
    /**
     * Findet heraus wer den ersten zug machen darf
     */
    public static Spielfigur ersterZug() {
        Spielfigur first = null;
        int highestValue = 0;
        for (Spielfigur player:alleSpieler) {
            int cube = (int) (Math.random() * 6) + 1;
            if (cube >= highestValue) {
                highestValue = cube;
                first = player;
            }
        }
        return first;
    }
}