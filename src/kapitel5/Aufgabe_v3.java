package kapitel5;

public class Aufgabe_v3 {
    public static void main(String[] args) {
        int bestellmenge = 2;

        int bestand = 9;

        boolean zahlung = true;


        if ((bestellmenge <= bestand)&&zahlung){
            System.out.println("Der Artikel wird ausgeliefert.");
        }

        else if (bestellmenge <= bestand) {
            System.out.println("Der Artikel ist verfügbar.");
            System.out.println("Die Lieferung Erfolgt sofort nach Zahlungseingang.");
        }
        else {
            System.out.println("Die gewünschte Menge ist nicht verfügbar.");
            System.out.println("Es sind nur noch " + bestand + " Artikel auf Lager");
        }
    }
}
