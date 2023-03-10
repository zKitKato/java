package kapitel7;
/**
 * Diese Klasse stellt Personen dar. Sie enthält den vornamen, Nachnamen und das Gehalt.
 * Aufgabe_v7
 */

public class Mitarbeiter {
    private String vorname;
    private String nachname;
    private double gehalt;
    /**
     * Konstruktor benötigt folgende Werte:
     * vorname,
     * Nachname,
     * Gehalt.
     */
    public Mitarbeiter (String vorname, String nachname, double gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.gehalt = gehalt;
    }

    /** Gibt den Vornamen zurück*/
    public String getVorname() { return vorname; }
    /** Gibt den Nachnamen zurück*/
    public String getNachname() { return nachname; }
    /** Gibt das Gehalt zurück*/
    public double getGehalt() { return gehalt; }
    /** Ändert das Gehalt*/
    public void setGehalt(double gehalt) { this.gehalt = gehalt; }
}
