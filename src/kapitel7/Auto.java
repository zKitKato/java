package kapitel7;
/**Diese Klasse stellt einen Gebrauchtwagen dar. Sie enthält
 * den Preis,
 * das Modell,
 * das Baujahr,
 * den Kilometerstand
 * und die Farbe.
 */
public class Auto {
    private double preis;
    private String modell;
    private int baujahr;
    private int kilometerstand;
    private String farbe;

    /**Konstruktor benötigt folgende Werte:
     * Preis,
     * Modell,
     * Baujahr,
     * Kilometerstand
     * und Farbe.
     */
    public Auto (double preis, String modell, int baujahr, int kilometerstand, String farbe){

        this.preis = preis;

        this.modell = modell;

        this.baujahr = baujahr;

        this.kilometerstand = kilometerstand;

        this.farbe = farbe;
    }

    /**Gibt den Preis zurück*/
    public double getPreis (){
        return preis;
    }
    /**Gibt das Modell zurück*/
    public String getModell (){
        return modell;
    }
    /**Gibt das Baujahr zurück*/
    public int getBaujahr (){
        return baujahr;
    }
    /**Gibt den Kilometerstand zurück*/
    public int getKilometerstand (){
        return kilometerstand;
    }
    /**Gibt die Farbe zurück*/
    public String getFarbe (){
        return farbe;
    }
    /**Ändert den Preis*/
    public void setPreis (double wert){
        this.preis = wert;
    }
}
