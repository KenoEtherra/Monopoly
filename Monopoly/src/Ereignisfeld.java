import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class Ereignisfeld extends Feld {
	
    public Ereignisfeld() {
    }

	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		switch((int)(Math.random()*15+1)) {
		case 1:
			getEreignisfeld("ereignisfeld1");
			//Rücke vor zur Seestraße. Wenn du über Los kommst, ziehe 400\u20AC ein.
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
			getEreignisfeld("ereignisfeld4");
			spieler.setGefaengnisFreikarte(spieler.getGefaengnisFreikarte()+1);
			break;
		case 5:
			getEreignisfeld("ereignisfeld5");
			spieler.setPosition(0);
			spieler.setGeld(spieler.getGeld()+400);
			break;
		case 6:
			getEreignisfeld("ereignisfeld6");
			spieler.setGeld(spieler.getGeld()+100);
			break;
		case 7:
			getEreignisfeld("ereignisfeld7");
			spieler.setPosition(39);
			// feld ausführen
			break;
		case 8:
			getEreignisfeld("ereignisfeld8");
			spieler.setPosition(24);
			//Rücke vor bis zum Opernplatz. Wenn du über Los kommst, ziehe 400\u20AC ein.
			break;
		case 9:
			getEreignisfeld("ereignisfeld9");
			spieler.setPosition(spieler.getPosition()-3);
			// feld ausführen
			break;
		case 10:
			getEreignisfeld("ereignisfeld10");
			int hotelcounter = 0;
			int strassencounter = 0;	
			for(int i = 0; i < felder.length; i++) {
				if(felder[i] instanceof Strasse) {
					Strasse straße = (Strasse) felder[i];
					if(straße.getBesitzer() == spieler) {
						if(straße.isHotel() == true) {
							hotelcounter++;
						}else {
							strassencounter += straße.getHaus();
						}
					}
				}
			}
			int summe = 50*strassencounter + 200*hotelcounter;
			spieler.setGeld(spieler.getGeld()-summe);
			break;
		case 11:
			getEreignisfeld("ereignisfeld11");
			int hotelcounter1 = 0;
			int strassencounter1 = 0;
			for(int i = 0; i < felder.length; i++) {
				if(felder[i] instanceof Strasse) {
					Strasse straße = (Strasse) felder[i];
					if(straße.getBesitzer() == spieler) {
						if(straße.isHotel() == true) {
							hotelcounter1++;
						}else {
							strassencounter1 += straße.getHaus();
						}
					}
				}
			}
			int summe1 = 80*strassencounter1 + 230*hotelcounter1;
			spieler.setGeld(spieler.getGeld()-summe1);
			break;
		case 12:
			getEreignisfeld("ereignisfeld12");
			spieler.setGeld(spieler.getGeld()-40);
			break;
		case 13:
			getEreignisfeld("ereignisfeld13");
			spieler.setGeld(spieler.getGeld()-30);
			break;
		case 14:
			getEreignisfeld("ereignisfeld14");
			spieler.setPosition(10);
			spieler.setAussetzten(3);
			break;
		case 15:
			getEreignisfeld("ereignisfeld15");
			spieler.setGeld(spieler.getGeld()-50);
			break;
		}
	}
	
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
