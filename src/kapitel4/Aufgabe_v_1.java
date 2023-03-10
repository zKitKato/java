package kapitel4;

public class Aufgabe_v_1 {
    public static void main (String[] args){

        int zahl1, ergebnis2;
        double zahl2, ergebnis1;

        zahl1 = 3;
        zahl2 = 3.5;

        ergebnis1 = zahl1 + zahl2;

        System.out.println("Ergebnis 1: " + ergebnis1);

        ergebnis2 = zahl1 + (int)zahl2;

        System.out.println("Ergebnis 2: " + ergebnis2);
    }
}
