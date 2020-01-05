import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class Gemeinschaftsfeld extends Feld {
	
	public Gemeinschaftsfeld() {
		
	}
	 
	public void betrittFeld(Spielfigur spieler, ArrayList<Spielfigur> nichtspieler, Feld[] felder) {
		switch((int)(Math.random()*16+1)) {
		case 1:
			getGemeinschaftsfeld("gemeinschaftsfeld1");
			for(int i = 0; i < nichtspieler.size(); i++) {
				nichtspieler.get(i).setGeld(nichtspieler.get(i).getGeld());
			}
			spieler.setGeld(spieler.getGeld()+200*(nichtspieler.size()-1));
			break;
		case 2:
			getGemeinschaftsfeld("gemeinschaftsfeld2");
			spieler.setGeld(spieler.getGeld()+10);
			break;
		case 3:
			getGemeinschaftsfeld("gemeinschaftsfeld3");
			spieler.setGeld(spieler.getGeld()+200);
			break;
		case 4:
			getGemeinschaftsfeld("gemeinschaftsfeld4");
			spieler.setGeld(spieler.getGeld()+40);
			break;
		case 5:
			getGemeinschaftsfeld("gemeinschaftsfeld5");
			spieler.setGeld(spieler.getGeld()+20);
			break;
		case 6:
			getGemeinschaftsfeld("gemeinschaftsfeld6");
			spieler.setPosition(0);
			spieler.setGeld(spieler.getGeld()+400);
			break;
		case 7:
			getGemeinschaftsfeld("gemeinschaftsfeld7");
			spieler.setGefaengnisFreikarte(spieler.getGefaengnisFreikarte()+1);
			break;
		case 8:
			getGemeinschaftsfeld("gemeinschaftsfeld8");
			spieler.setGeld(spieler.getGeld()+400);
			break;
		case 9:
			getGemeinschaftsfeld("gemeinschaftsfeld9");
			spieler.setGeld(spieler.getGeld()+200);
			break;
		case 10:
			getGemeinschaftsfeld("gemeinschaftsfeld10");
			spieler.setGeld(spieler.getGeld()+50);
			break;
		case 11:
			getGemeinschaftsfeld("gemeinschaftsfeld11");
			//Gehe zur�ck zu Badstra�e.
			break;
		case 12:
			getGemeinschaftsfeld("gemeinschaftsfeld12");
			spieler.setGeld(spieler.getGeld()-200);
			break;
		case 13:
			getGemeinschaftsfeld("gemeinschaftsfeld13");
			spieler.setPosition(10);
			spieler.setAussetzen(3);
			break;
		case 14:
			getGemeinschaftsfeld("gemeinschaftsfeld14");
			spieler.setGeld(spieler.getGeld()-500);
			break;
		case 15:
			getGemeinschaftsfeld("gemeinschaftsfeld15");
			spieler.setGeld(spieler.getGeld()-10);
			break;
		case 16:
			getGemeinschaftsfeld("gemeinschaftsfeld16");
			spieler.setGeld(spieler.getGeld()-200);
			break;
		}
	}
	
	private static void getGemeinschaftsfeld(String a) {
		 try (InputStream input = new FileInputStream("Monopoly/src/config.properties")) {
	            Properties prop = new Properties();
	            prop.load(input);
	            System.out.println(prop.getProperty(a));
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }

}
