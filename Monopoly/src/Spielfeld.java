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
    	Strasse badstrasse = new Strasse(0,0,"Badstrasse","lila");
    	Strasse turmstrasse = new Strasse(0,1,"Turmstrasse","lila");
    	Strasse chausseestrasse = new Strasse(1,0,"Chausseestrasse","hellblau");
    	Strasse elisenstrasse = new Strasse(1,1,"Elisenstrasse","hellblau");
    	Strasse poststrasse = new Strasse(1,2,"Poststrasse","hellblau");
    	Strasse seestrasse = new Strasse(2,0,"Seestrasse","pink");
    	Strasse hafenstrasse = new Strasse(2,1,"Hafenstrasse","pink");
    	Strasse neuestrasse = new Strasse(2,2,"Neue Strasse","pink");
    	Strasse müchenerstrasse = new Strasse(3,0,"Münchener Strasse","orange");
    	Strasse wienerstrasse = new Strasse(3,1,"Wiener Strasse","orange");
    	Strasse berlinerstrasse = new Strasse(3,2,"Berliner Strasse","orange");
    	Strasse theaterstrasse = new Strasse(4,0,"Theaterstrasse","rot");
    	Strasse museumstrasse = new Strasse(4,1,"Museumstrasse","rot");
    	Strasse opernplatz = new Strasse(4,2,"Opernplatz","rot");
    	Strasse lessingstrasse = new Strasse(5,0,"Lessingstrasse","gelb");
    	Strasse schillerstrasse = new Strasse(5,1,"Schillerstrasse","gelb");
    	Strasse goethestrasse = new Strasse(5,2,"Goethestrasse","gelb");
    	Strasse rathausplatz = new Strasse(6,0,"Rathausplatz","grün");
    	Strasse haupstrasse = new Strasse(6,1,"Haupstrasse","grün");
    	Strasse bahnhofstrasse = new Strasse(6,2,"Bahnhofstrasse","grün");
    	Strasse parkstrasse = new Strasse(7,0,"Parkstrasse","blau");
    	Strasse schlossallee = new Strasse(7,1,"Schlossallee","blau");
    	
    	Bahnhof südbahnhof = new Bahnhof("Südbahnhof",5);
    	Bahnhof westbahnhof = new Bahnhof("Westbahnhof",15);
    	Bahnhof nordbahnhof = new Bahnhof("Nordbahnhof",25);
    	Bahnhof ostbahnhof = new Bahnhof("Ostbahnhof",35);
    	
    	Stadtwerke elekwerk = new Stadtwerke(0,"Elektrizitätswerk");
    	Stadtwerke wasswerk = new Stadtwerke(1,"Wasserwerk");
    	
    	Gefaengnis gefägnis = new Gefaengnis();
    	
    	Polizist polizist = new Polizist();
    	
    	
    	
    	felder[0]=los;
    }

    public void starteSpiel() {

    }

}
