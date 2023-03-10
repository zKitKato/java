package kapitel5;

public class Lager2 {
    public static void main(String[] args) {
        int bestand = 10;

        boolean werktag = false;

        if ((bestand > 0) && werktag){
            System.out.print("Der Artikel wird sofort ausgelie- fert.");
        }

        if ((bestand > 0) && !werktag){
            System.out.print("Der Artikel wird am nächsten Werk- tag ausgeliefert.");
        }

        if (bestand == 0){
            System.out.print("Der angeforderte Artikel ist leider nicht verfügbar");
        }
    }
}
