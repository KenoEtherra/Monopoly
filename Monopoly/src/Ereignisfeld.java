import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class Ereignisfeld extends Feld {
	
    public Ereignisfeld() {
    }

	/**
	 * Switch-Case mit 14 M�glichkeiten. Beinhaltet die 14 Ereigniskarten die der Spieler erhalten kann
	 */
	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		switch((int)(Math.random()*14+1)) {
		case 1:
			getEreignisfeld("ereignisfeld1");
			if(spieler.getPosition() > 12) {
				spieler.setGeld(spieler.getGeld()+400);
			}
			felder[11].betrittFeld(spieler, nichtspieler, felder);
			spieler.setPosition(11);
			break;
		case 2:
			getEreignisfeld("ereignisfeld2");
			spieler.setGeld(spieler.getGeld()+200);
			break;
		case 3:
			getEreignisfeld("ereignisfeld3");
			spieler.setGeld(spieler.getGeld()+300);
			break;
		case 4:
			getEreignisfeld("ereignisfeld5");
			spieler.setPosition(0);
			spieler.setGeld(spieler.getGeld()+400);
			break;
		case 5:
			getEreignisfeld("ereignisfeld6");
			spieler.setGeld(spieler.getGeld()+100);
			break;
		case 6:
			getEreignisfeld("ereignisfeld7");
			spieler.setPosition(39);
			felder[39].betrittFeld(spieler, nichtspieler, felder);
			break;
		case 7:
			getEreignisfeld("ereignisfeld8");
			if(spieler.getPosition() > 24) {
				spieler.setGeld(spieler.getGeld()+400);
			}
			felder[24].betrittFeld(spieler, nichtspieler, felder);
			spieler.setPosition(24);
			break;
		case 8:
			getEreignisfeld("ereignisfeld9");
			spieler.setPosition(spieler.getPosition()-3);
			felder[spieler.getPosition()-3].betrittFeld(spieler, nichtspieler, felder);
			break;
		case 9:
			getEreignisfeld("ereignisfeld10");
			int hotelcounter = 0;
			int hauscounter = 0;	
			for(int i = 0; i < felder.length; i++) {
				if(felder[i] instanceof Strasse) {
					Strasse stra�e = (Strasse) felder[i];
					if(stra�e.getBesitzer() == spieler) {
						if(stra�e.isHotel() == true) {
							hotelcounter++;
						}else {
							hauscounter += stra�e.getHaus();
						}
					}
				}
			}
			int summe = 50*hauscounter + 200*hotelcounter;
			spieler.setGeld(spieler.getGeld()-summe);
			break;
		case 10:
			getEreignisfeld("ereignisfeld11");
			int hotelcounter1 = 0;
			int hauscounter1 = 0;
			for(int i = 0; i < felder.length; i++) {
				if(felder[i] instanceof Strasse) {
					Strasse stra�e = (Strasse) felder[i];
					if(stra�e.getBesitzer() == spieler) {
						if(stra�e.isHotel() == true) {
							hotelcounter1++;
						}else {
							hauscounter1 += stra�e.getHaus();
						}
					}
				}
			}
			int summe1 = 80*hauscounter1 + 230*hotelcounter1;
			spieler.setGeld(spieler.getGeld()-summe1);
			break;
		case 11:
			getEreignisfeld("ereignisfeld12");
			spieler.setGeld(spieler.getGeld()-40);
			break;
		case 12:
			getEreignisfeld("ereignisfeld13");
			spieler.setGeld(spieler.getGeld()-30);
			break;
		case 13:
			getEreignisfeld("ereignisfeld14");
			spieler.setPosition(10);
			spieler.setAussetzen(3);
			break;
		case 14:
			getEreignisfeld("ereignisfeld15");
			spieler.setGeld(spieler.getGeld()-50);
			break;
		}
	}
	/**
	 * Liest die einzelnen Ereigniskarten aus der config-Datei um sie dann auszugeben.
	 */
	private static void getEreignisfeld(String a) {
		 try (InputStream input = new FileInputStream("Monopoly/src/config.properties")) {
	            Properties prop = new Properties();
	            prop.load(input);
	            System.out.println(prop.getProperty(a));
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }
}
