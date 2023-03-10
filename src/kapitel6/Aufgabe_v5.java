package kapitel6;

import java.io.*;
public class Aufgabe_v5 {
    public static void main (String[] args)throws IOException{


        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        int a[] = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.print("Bitte geben Sie den " + (i+1) + ". Wert ein: ");

            String eingabe = br.readLine();

            int wert = Integer.parseInt(eingabe);
            a[i] = wert;
        }

        System.out.println("Das Doppelte der eingegebenen Werte beträgt:");

        for (int element : a){
            System.out.println(element*2);
        }
    }
}
