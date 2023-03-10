package kapitel5;

public class Lager4 {
    public static void main (String[] args){

        int bestand = 5;

        if (bestand == 0){
            System.out.print("Der angeforderte Artikel ist leider nicht verfügbar.");
        }

        else if (bestand < 10){
            System.out.println("Nur noch wenige Artikel verfügbar.");
            System.out.print("Bitte nachbestellen!");
        }

        else {
            System.out.print("Der Artikel wird geliefert.");
        }
    }
}
