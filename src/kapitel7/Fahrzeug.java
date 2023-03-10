package kapitel7;

public class Fahrzeug {
    private double preis;
    private String modell;
    private int baujahr;
    private int kilometerstand;

    /**Konstruktor benötigt folgende Werte: Preis, Modell, Baujahr
     und Kilometerstand.*/
    public Fahrzeug (double wert1, String wert2, int wert3, int wert4) {
        this.preis = wert1;
        this.modell = wert2;
        this.baujahr = wert3;
        this.kilometerstand = wert4;
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
    /**Ändert den Preis*/
    public void setPreis (double wert){
        this.preis = wert;
    }
}
