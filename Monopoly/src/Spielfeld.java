public class Spielfeld extends Main {

    private Feld[] felder;

    public Spielfeld() {
        // TODO Auto-generated constructor stub
        //40 Felder
        //0 Los
        //1,3,6,8,9,11,13,14,16,18,19,21,23,24,26,27,29,31,32,34,37,39 Stra�e
        //5,15,25,35 Bahnhof
        //12 Elec Werk
        //28 Water Werk
        //10 Gef�gnis
        //20 Free Park
        //30 Polizei
        //4 Income Tax
        //38 Super Tax
        //2,17,33 Gemeinschaft
        //7,22,36 Ereignis
    	Los los = new Los();
    	//Strasse(int Serie, int Strasse, String Name, String Farbe)
    	Strasse badstrasse      = new Strasse(0,0,"Badstrasse","lila");
    	Strasse turmstrasse     = new Strasse(0,1,"Turmstrasse","lila");
    	Strasse chausseestrasse = new Strasse(1,0,"Chausseestrasse","hellblau");
    	Strasse elisenstrasse   = new Strasse(1,1,"Elisenstrasse","hellblau");
    	Strasse poststrasse     = new Strasse(1,2,"Poststrasse","hellblau");
    	Strasse seestrasse      = new Strasse(2,0,"Seestrasse","pink");
    	Strasse hafenstrasse    = new Strasse(2,1,"Hafenstrasse","pink");
    	Strasse neuestrasse     = new Strasse(2,2,"Neue Strasse","pink");
    	Strasse m�chnerstrasse  = new Strasse(3,0,"M�nchner Strasse","orange");
    	Strasse wienerstrasse   = new Strasse(3,1,"Wiener Strasse","orange");
    	Strasse berlinerstrasse = new Strasse(3,2,"Berliner Strasse","orange");
    	Strasse theaterstrasse  = new Strasse(4,0,"Theaterstrasse","rot");
    	Strasse museumstrasse   = new Strasse(4,1,"Museumstrasse","rot");
    	Strasse opernplatz      = new Strasse(4,2,"Opernplatz","rot");
    	Strasse lessingstrasse  = new Strasse(5,0,"Lessingstrasse","gelb");
    	Strasse schillerstrasse = new Strasse(5,1,"Schillerstrasse","gelb");
    	Strasse goethestrasse   = new Strasse(5,2,"Goethestrasse","gelb");
    	Strasse rathausplatz    = new Strasse(6,0,"Rathausplatz","gr�n");
    	Strasse hauptstrasse    = new Strasse(6,1,"Hauptstrasse","gr�n");
    	Strasse bahnhofstrasse  = new Strasse(6,2,"Bahnhofstrasse","gr�n");
    	Strasse parkstrasse     = new Strasse(7,0,"Parkstrasse","blau");
    	Strasse schlossallee    = new Strasse(7,1,"Schlossallee","blau");
    	
    	Bahnhof s�dbahnhof      = new Bahnhof("S�dbahnhof",5);
    	Bahnhof westbahnhof     = new Bahnhof("Westbahnhof",15);
    	Bahnhof nordbahnhof     = new Bahnhof("Nordbahnhof",25);
    	Bahnhof hauptbahnhof    = new Bahnhof("Hauptbahnhof",35);
    	
    	Stadtwerke elekwerk     = new Stadtwerke(0,"Elektrizit�tswerk");
    	Stadtwerke wasswerk     = new Stadtwerke(1,"Wasserwerk");
    	
    	Gefaengnis gef�gnis     = new Gefaengnis();
    	
    	Polizist polizist       = new Polizist();
    	

    	Steuer einksteuer       = new Steuer(4);
    	Steuer zusasteuer       = new Steuer(38);

    	
    	Gemeinschaftsfeld gemfeld = new Gemeinschaftsfeld();
    	
    	Ereignisfeld ergfeld      = new Ereignisfeld();
    	
    	
    	felder[0]=los;
    	felder[1]=badstrasse;
    	felder[2]=gemfeld;
    	felder[3]=turmstrasse;
    	felder[4]=einksteuer;
    	felder[5]=s�dbahnhof;
    	felder[6]=chausseestrasse;
    	felder[7]=ergfeld;
    	felder[8]=elisenstrasse;
    	felder[9]=poststrasse;
    	felder[10]=gef�gnis;
    	felder[11]=seestrasse;
    	felder[12]=elekwerk;
    	felder[13]=hafenstrasse;
    	felder[14]=neuestrasse;
    	felder[15]=westbahnhof;
    	felder[16]=m�chnerstrasse;
    	felder[17]=gemfeld;
    	felder[18]=wienerstrasse;
    	felder[19]=berlinerstrasse;
    	felder[20]=freiparken;
    	felder[21]=theaterstrasse;
    	felder[22]=ergfeld;
    	felder[23]=museumstrasse;
    	felder[24]=opernplatz;
    	felder[25]=nordbahnhof;
    	felder[26]=lessingstrasse;
    	felder[27]=schillerstrasse;
    	felder[28]=wasswerk;
    	felder[29]=goethestrasse;
    	felder[30]=polizist;
    	felder[31]=rathausplatz;
    	felder[32]=hauptstrasse;
    	felder[33]=gemfeld;
    	felder[34]=bahnhofstrasse;
    	felder[35]=hauptbahnhof;
    	felder[36]=ergfeld;
    	felder[37]=parkstrasse;
    	felder[38]=zusasteuer;
    	felder[39]=schlossallee;
    	
    }

    public void starteSpiel() {

    }

}
