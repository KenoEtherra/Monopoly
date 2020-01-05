import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Strasse extends Feld {

    private boolean hypothek, wirdBesessen, hotel;

    private Spielfigur besitzer;

    private String name, farbe;

    private int haus, hausPreis, miete, kaufpreis, hypothekenwert, serie, strasse;

    public Strasse(int serie, int strasse, String name, String farbe) {
        this.serie = serie;
        this.strasse = strasse;
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
                hausPreis = 50;
                miete = 2;
                break;
            case "hellblau":
                hausPreis = 50;
                if (name.equals("Poststrasse")) {
                    kaufpreis = 120;
                    hypothekenwert = 60;
                    miete = 8;
                } else {
                    kaufpreis = 100;
                    hypothekenwert = 50;
                    miete = 6;
                }
                break;
            case "pink":
                hausPreis = 100;
                if (name.equals("Neue Strasse")) {
                    kaufpreis = 160;
                    hypothekenwert = 80;
                    miete = 12;
                } else {
                    kaufpreis = 140;
                    hypothekenwert = 70;
                    miete = 10;
                }
                break;
            case "orange":
                hausPreis = 100;
                if (name.equals("Berliner Strasse")) {
                    kaufpreis = 200;
                    hypothekenwert = 100;
                    miete = 16;
                } else {
                    kaufpreis = 180;
                    hypothekenwert = 90;
                    miete = 14;
                }
                break;
            case "rot":
                hausPreis = 150;
                if (name.equals("Opernplatz")) {
                    kaufpreis = 240;
                    hypothekenwert = 120;
                    miete = 20;
                } else {
                    kaufpreis = 220;
                    hypothekenwert = 110;
                    miete = 18;
                }
                break;
            case "gelb":
                hausPreis = 150;
                if (name.equals("Goethestrasse")) {
                    kaufpreis = 280;
                    hypothekenwert = 140;
                    miete = 24;
                } else {
                    kaufpreis = 260;
                    hypothekenwert = 130;
                    miete = 22;
                }
                break;
            case "grün":
                hausPreis = 200;
                if (name.equals("Bahnhofstrasse")) {
                    kaufpreis = 320;
                    hypothekenwert = 160;
                    miete = 28;
                } else {
                    kaufpreis = 300;
                    hypothekenwert = 150;
                    miete = 26;
                }
                break;
            case "blau":
                hausPreis = 200;
                if (name.equals("Schlossallee")) {
                    kaufpreis = 400;
                    hypothekenwert = 200;
                    miete = 50;
                } else {
                    kaufpreis = 350;
                    hypothekenwert = 175;
                    miete = 50;
                }
                break;
        }
    }

    public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
        System.out.println("Sie sind jetzt auf dem Feld[" + name + "].");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int scanINT = 0;
        String scanSTR = "";

        if (wirdBesessen) {
            if (spieler == besitzer) {
                System.out.println("Ihnen gehört " + name + " bereits.");
                System.out.println("Möchten Sie ein Haus bauen[ja] oder nicht[nein]? Preis = " + hausPreis + "€.");
                scanSTR = sc.next();
                switch (scanSTR) {
                    case "ja":
                        if (haus == 4) {
                            System.out.println(
                                    "Sie haben bereits 4 Häuser. Wollen sie ein Hotel bauen? [ja/nein]");
                            scanSTR = sc.nextLine();
                            switch (scanSTR) {
                                case "ja":
                                    if (spieler.getGeld() < hausPreis) {

                                    } else {
                                        haus = 0;
                                        hotel = true;
                                        miete = 250;
                                    }

                                    break;
                                case "nein":
                                    System.out.println("Sie bauen jetzt kein Hotel.");
                                    break;
                                default:
                                    System.out.println("Das ist kein gültiger Befehl!");
                                    break;
                            }
                        } else {

                        }
                        break;
                    case "nein":
                        break;
                    default:
                        System.out.println("Das ist kein gültiger Befehl!");
                        break;
                }
            } else {
            	int auszahlendeMiete = this.getMiete();
            	int feldcounter = 0;
                for (int i = 0; i < felder.length; i++) {
                    if (felder[i] instanceof Strasse) {
                        Strasse straße = (Strasse) felder[i];
                        if (straße.getBesitzer() == spieler && straße.getSerie() == this.getSerie()) {
							feldcounter++;
                        }
                    }
                }
                if (feldcounter > 1) {
					if (this.getSerie() == 0 && this.getSerie() == 7) {
						auszahlendeMiete = auszahlendeMiete * 2;
					} else {
						if (feldcounter == 3) {
							auszahlendeMiete = auszahlendeMiete * 2;
						}
					}
				}
                if (this.getHaus() > 0) {
                	auszahlendeMiete = auszahlendeMiete * this.getHaus();
				}
				if (this.isHotel()) {
					auszahlendeMiete = auszahlendeMiete * 5;
				}
				System.out.println("Sie zahlen " + auszahlendeMiete + "€ Miete.");
            }
        } else {
            int i = 0;
            while (i == 0) {
                System.out.println("Möchten Sie [" + name + "] kaufen? Preis = " + kaufpreis + " €. [ja/nein]");
                scanSTR = sc.nextLine();
                switch (scanSTR) {
                    case "ja":
                        if (spieler.getGeld() < kaufpreis) {
                            System.out.println("Sie haben nicht genug Geld, um diese Strasse zu kaufen!");
                            i = 1; //Schleife ist vorbei
                            break;
                        } else {
                            spieler.setGeld(spieler.getGeld() - kaufpreis);
                            wirdBesessen = true;
                            besitzer = spieler;
                            System.out.println("Sie haben [" + name + "] gekauft!");
                            i = 1; //Schleife ist vorbei
                        }
                        break;
                    case "nein":

                        break;
                    default:
                        System.out.println("Das ist kein gültiger Befehl. Nochmal!");
                        break;
                }
            }
        }

    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getStrasse() {
        return strasse;
    }

    public void setStrasse(int strasse) {
        this.strasse = strasse;
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

    public int getHausPreis() {
        return hausPreis;
    }

    public void setHausPreis(int hausPreis) {
        this.hausPreis = hausPreis;
    }

}