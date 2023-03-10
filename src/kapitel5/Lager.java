package kapitel5;

public class Lager {
    public static void main(String[] args) {
        int bestand = 10;

        if (bestand > 0) {
            System.out.print("Der Artikel wird ausgeliefert.");
        }

        if (bestand == 0){
            System.out.print("Der angeforderte Artikel ist leider nicht verfügbar.");
        }
    }
}
