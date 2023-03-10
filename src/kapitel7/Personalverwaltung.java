package kapitel7;

import java.io.*;
public class Personalverwaltung {
    public static void main(String[] args) throws IOException {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Franz", "Müller", 3475);
        System.out.println(mitarbeiter1.getVorname());
        System.out.println(mitarbeiter1.getNachname());
        System.out.println(mitarbeiter1.getGehalt());

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        System.out.print("Bitte geben Sie das neue Gehalt ein: ");
        String eingabe = br.readLine();
        int gehaltNeu = Integer.parseInt(eingabe);
        mitarbeiter1.setGehalt(gehaltNeu);
        System.out.print("Das neue Gehalt beträgt: " + mitarbeiter1.getGehalt());
    }
}
