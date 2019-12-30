import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Spielfigur {

	private int position;

	private int geld;

	private int aussetzten;

	private int gefaengnisFreikarte;
	
	private int pasch;

	public Spielfigur() {
		this.setDefaultPlayer();
	}
	
	public int wuerfeln() {
		int wuerfel1 = (int)(Math.random() * 6) + 1;
		int wuerfel2 = (int)(Math.random() * 6) + 1;
		if (wuerfel1 == wuerfel2) {
			this.pasch++;
		}
		return wuerfel1 + wuerfel2;
	}
	
	private void setDefaultPlayer() {
		try (InputStream input = new FileInputStream("Monopoly/src/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            this.setGeld(Integer.parseInt(prop.getProperty("defaultPlayer.money")));
            this.setPosition(Integer.parseInt(prop.getProperty("defaultPlayer.position")));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}


	/**
	 * @return the pasch
	 */
	public int getPasch() {
		return pasch;
	}

	/**
	 * @param pasch the pasch to set
	 */
	public void setPasch(int pasch) {
		this.pasch = pasch;
	}

	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}

	/**
	 * @return the geld
	 */
	public int getGeld() {
		return geld;
	}

	/**
	 * @param geld the geld to set
	 */
	public void setGeld(int geld) {
		this.geld = geld;
	}

	/**
	 * @return the aussetzten
	 */
	public int getAussetzten() {
		return aussetzten;
	}

	/**
	 * @param aussetzten the aussetzten to set
	 */
	public void setAussetzten(int aussetzten) {
		this.aussetzten = aussetzten;
	}

	/**
	 * @return the gefaengnisFreikarte
	 */
	public int getGefaengnisFreikarte() {
		return gefaengnisFreikarte;
	}

	/**
	 * @param gefaengnisFreikarte the gefaengnisFreikarte to set
	 */
	public void setGefaengnisFreikarte(int gefaengnisFreikarte) {
		this.gefaengnisFreikarte = gefaengnisFreikarte;
	}
	
	
}
