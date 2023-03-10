package kapitel6;

import java.io.*;
public class Schleife2 {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int guthaben = 200;

        boolean guthabenReichtAus = true;

        while (guthabenReichtAus){

            System.out.print("Bitte geben Sie den Kaufbetrag ein: ");
            String eingabe = br.readLine();

            int betrag = Integer.parseInt(eingabe);

            if (guthaben-betrag > 0){
                System.out.println("Der Betrag wurde von Ihrem Guthaben abgezogen");
                guthaben -= betrag;
                System.out.println("Ihr neues " + "Guthaben beträgt " + guthaben + " Euro.");
            }
            else {
                System.out.println("Leider ist kein ausreichendes Guthaben vorhanden");
                guthabenReichtAus = false;
            }
        }
    }
}
