package kapitel6;

import java.io.*;

public class Aufgabe_v6 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);
        int wert;

        boolean weiter = true;

        while (weiter){
            System.out.println("Bitte geben Sie den Wert für die Berechnung ein: ");

            String eingabe = br.readLine();
            wert = Integer.parseInt(eingabe);
            System.out.println("Das Ergebnis ist: " + (wert*wert));
            System.out.println("Möchten Sie	fortfahren?");

            System.out.println("(0 für weiter und 1 für abbrechen)");
            eingabe = br.readLine();
            wert = Integer.parseInt(eingabe);

            if (wert == 1){
                weiter = false;
                System.out.println("Vielen Dank. Auf Wiedersehen.");
            }

        }
    }
}
