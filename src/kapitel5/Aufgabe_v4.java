package kapitel5;

import java.io.*;
public class Aufgabe_v4 {
        public static void main (String[] args) throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);

            BufferedReader br = new BufferedReader(isr);


            System.out.println("Was ist das Ergebnis aus 3 x 4?");

            String eingabe = br.readLine();
            int ergebnis = Integer.parseInt(eingabe);

            if (ergebnis == (3*4)){
                System.out.print("Das Ergebnis ist richtig.");
            }
            else {
                System.out.print("Sie haben die Aufgabe nicht richtig gelöst.");
            }
        }
}
