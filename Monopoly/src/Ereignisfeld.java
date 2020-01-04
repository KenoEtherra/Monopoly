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
			break;
		case 6:
			getEreignisfeld("ereignisfeld6");
			spieler.setGeld(spieler.getGeld()+100);
			break;
		case 7:
			getEreignisfeld("ereignisfeld7");
			spieler.setPosition(39);
			break;
		case 8:
			getEreignisfeld("ereignisfeld8");
			spieler.setPosition(24);
			//Rücke vor bis zum Opernplatz. Wenn du über Los kommst, ziehe 400\u20AC ein.
			break;
		case 9:
			getEreignisfeld("ereignisfeld9");
			spieler.setPosition(spieler.getPosition()-3);
			break;
		case 10:
			getEreignisfeld("ereignisfeld10");
			//Lasse alle deine Häuser renovieren. Zahle an die Bank für jedes Haus 50\u20AC und für jedes Hotel 200\u20AC.
			break;
		case 11:
			getEreignisfeld("ereignisfeld11");
			//Du wirst zu Strassenausbesserungsarbeiten herangezogen. Zahle für deine Häuser und Hotels. 80\u20AC je Haus und 230\u20AC je Hotel an die Bank.
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
			//Gehe ins Gefängnis. Begib dich direkt dorthin. Gehe nicht über Los und ziehe nicht 400\u20AC ein.

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
