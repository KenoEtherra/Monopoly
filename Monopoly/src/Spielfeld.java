import javax.sound.midi.MidiFileFormat;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Spielfeld extends Main {

    private Feld[] felder;

    public Spielfeld() {
        // TODO Auto-generated constructor stub
        //40 Felder
        //0 Los
        //1,3,6,8,9,11,13,14,16,18,19,21,23,24,26,27,29,31,32,34,37,39 Straße
        //5,15,25,35 Bahnhof
        //12 Elec Werk
        //28 Water Werk
        //10 Gefägnis
        //20 Free Park
        //30 Polizei
        //4 Income Tax
        //38 Super Tax
        //2,17,33 Gemeinschaft
        //7,22,36 Ereignis
        Los los = new Los();
        //Strasse(int Serie, int Strasse, String Name, String Farbe)
        Strasse badstrasse = new Strasse(0, 0, "Badstrasse", "lila");
        Strasse turmstrasse = new Strasse(0, 1, "Turmstrasse", "lila");
        Strasse chausseestrasse = new Strasse(1, 0, "Chausseestrasse", "hellblau");
        Strasse elisenstrasse = new Strasse(1, 1, "Elisenstrasse", "hellblau");
        Strasse poststrasse = new Strasse(1, 2, "Poststrasse", "hellblau");
        Strasse seestrasse = new Strasse(2, 0, "Seestrasse", "pink");
        Strasse hafenstrasse = new Strasse(2, 1, "Hafenstrasse", "pink");
        Strasse neuestrasse = new Strasse(2, 2, "Neue Strasse", "pink");
        Strasse müchnerstrasse = new Strasse(3, 0, "Münchner Strasse", "orange");
        Strasse wienerstrasse = new Strasse(3, 1, "Wiener Strasse", "orange");
        Strasse berlinerstrasse = new Strasse(3, 2, "Berliner Strasse", "orange");
        Strasse theaterstrasse = new Strasse(4, 0, "Theaterstrasse", "rot");
        Strasse museumstrasse = new Strasse(4, 1, "Museumstrasse", "rot");
        Strasse opernplatz = new Strasse(4, 2, "Opernplatz", "rot");
        Strasse lessingstrasse = new Strasse(5, 0, "Lessingstrasse", "gelb");
        Strasse schillerstrasse = new Strasse(5, 1, "Schillerstrasse", "gelb");
        Strasse goethestrasse = new Strasse(5, 2, "Goethestrasse", "gelb");
        Strasse rathausplatz = new Strasse(6, 0, "Rathausplatz", "grün");
        Strasse hauptstrasse = new Strasse(6, 1, "Hauptstrasse", "grün");
        Strasse bahnhofstrasse = new Strasse(6, 2, "Bahnhofstrasse", "grün");
        Strasse parkstrasse = new Strasse(7, 0, "Parkstrasse", "blau");
        Strasse schlossallee = new Strasse(7, 1, "Schlossallee", "blau");

        Bahnhof südbahnhof = new Bahnhof("Südbahnhof", 5);
        Bahnhof westbahnhof = new Bahnhof("Westbahnhof", 15);
        Bahnhof nordbahnhof = new Bahnhof("Nordbahnhof", 25);
        Bahnhof hauptbahnhof = new Bahnhof("Hauptbahnhof", 35);

        Stadtwerke elekwerk = new Stadtwerke(0, "Elektrizitätswerk");
        Stadtwerke wasswerk = new Stadtwerke(1, "Wasserwerk");

        Gefaengnis gefängnis = new Gefaengnis();

        Polizist polizist = new Polizist();

        Steuer steuer = new Steuer();

        Gemeinschaftsfeld gemfeld = new Gemeinschaftsfeld();

        Ereignisfeld ergfeld = new Ereignisfeld();

        felder = new Feld[40];
        felder[0] = los;
        felder[1] = badstrasse;
        felder[2] = turmstrasse;
        felder[3] = gemfeld;
        felder[4] = steuer;
        felder[5] = südbahnhof;
        felder[6] = chausseestrasse;
        felder[7] = ergfeld;
        felder[8] = elisenstrasse;
        felder[9] = poststrasse;
        felder[10] = gefängnis;
        felder[11] = seestrasse;
        felder[12] = elekwerk;
        felder[13] = hafenstrasse;
        felder[14] = neuestrasse;
        felder[15] = westbahnhof;
        felder[16] = müchnerstrasse;
        felder[17] = gemfeld;
        felder[18] = wienerstrasse;
        felder[19] = berlinerstrasse;
        felder[20] = steuer;
        felder[21] = theaterstrasse;
        felder[22] = ergfeld;
        felder[23] = museumstrasse;
        felder[24] = opernplatz;
        felder[25] = nordbahnhof;
        felder[26] = lessingstrasse;
        felder[27] = schillerstrasse;
        felder[28] = wasswerk;
        felder[29] = goethestrasse;
        felder[30] = polizist;
        felder[31] = rathausplatz;
        felder[32] = hauptstrasse;
        felder[33] = gemfeld;
        felder[34] = bahnhofstrasse;
        felder[35] = hauptbahnhof;
        felder[36] = ergfeld;
        felder[37] = parkstrasse;
        felder[38] = steuer;
        felder[39] = schlossallee;

    }

    public void starteSpiel() {
        Spielfigur ersterSpieler = ersterZug();
        System.out.println("Der erste Spieler der Am zug ist: " + ersterSpieler.getName());
        int index = alleSpieler.indexOf(ersterSpieler);
        int anzahlSpieler = alleSpieler.size();
        Spielfigur temp1 = alleSpieler.get(0);
        Spielfigur temp2 = alleSpieler.get(index);
        alleSpieler.set(0, temp2);
        alleSpieler.set(index, temp1);
        // Spielvaiabeln
        Spielfigur spieler1 = alleSpieler.get(0);
        Spielfigur spieler2 = alleSpieler.get(1);
        Spielfigur spieler3 = alleSpieler.get(2);
        Spielfigur spieler4 = alleSpieler.get(3);
        while (true) {
            for (int i = 1; i <= anzahlSpieler; i++) {
                switch (i) {
                    case 1:
                        if (!spieler1.isBroken()) {
                            moveplayer(spieler1);
                        }
                        break;
                    case 2:
                        if (!spieler2.isBroken()) {
                            moveplayer(spieler2);
                        }
                        break;
                    case 3:
                        if (!spieler3.isBroken()) {
                            moveplayer(spieler3);
                        }
                        break;
                    case 4:
                        if (!spieler4.isBroken()) {
                            moveplayer(spieler4);
                        }
                        break;
                }
            }
            if (spieler1.isBroken()) {
                alleSpieler.remove(spieler1);
            }
            if (spieler2.isBroken()) {
                alleSpieler.remove(spieler2);
            }
            if (spieler3.isBroken()) {
                alleSpieler.remove(spieler3);
            }
            if (spieler4.isBroken()) {
                alleSpieler.remove(spieler4);
            }
            if (alleSpieler.size() == 1) {
                System.out.println(alleSpieler.get(0).getName() + " hat gewonnen!!! ");
                System.out.println("Das Spiel ist vorbei!");
                break;
            }
        }
    }

    public void moveplayer(Spielfigur spieler) {

        int gefaengniscounter = 0;
        System.out.println();
        System.out.println(spieler.getName() + " ist dran!");
        System.out.println("Geld: " + spieler.getGeld());
        // überprüfung auf aussetzen
        if (spieler.getAussetzen() != 0) {
            System.out.println("Du musst aussetzen!");
            spieler.setAussetzen(spieler.getAussetzen() - 1);
        } else {
            int wuerfelWert = spieler.wuerfeln();
            System.out.println("Du hast gewürfelt: " + wuerfelWert);
            int pasch = spieler.getPasch();
            if (pasch != 0) {
                System.out.println("Du hast den 1. Pasch!");
                gefaengniscounter = 1;
            }

            int position = spieler.getPosition() + wuerfelWert;
            if (position >= 39) {
                position = position - 39;
            }
            spieler.setPosition(position);

            felder[position].betrittFeld(spieler, getNichtspieler(spieler), felder);

            while (gefaengniscounter > 0) {
                spieler.setPasch(0);
                if (gefaengniscounter == 3) {
                    spieler.setPasch(0);
                    felder[30].betrittFeld(spieler, getNichtspieler(spieler), felder);
                    break;
                }
                wuerfelWert = spieler.wuerfeln();
                System.out.println("Du hast gewürfelt: " + wuerfelWert);
                pasch = spieler.getPasch();
                if (pasch != 0) {
                    gefaengniscounter++;
                    System.out.println("Du hast den den " + gefaengniscounter + ". Pasch");
                } else {
                    gefaengniscounter = 0;
                }
                position = spieler.getPosition() + wuerfelWert;
                if (position > 39) {
                    System.out.println("Du bist über los gezogen du erhälst 200!");
                    spieler.setGeld(spieler.getGeld() + 200);
                    position = position - 39;
                }

                spieler.setPosition(position);
                felder[position].betrittFeld(spieler, getNichtspieler(spieler), felder);
            }
            spieler.setPasch(0);

            if (spieler.getGeld() <= 0) {
                spieler.setBroken(true);
                System.out.println(spieler.getName() + "ist ausgeschieden!");
            }

            System.out.println("Der zug ist beendet!");
        }
    }

}

