package kapitel6;

public class Schleife3 {
    public static void main(String[] args) {

        int i = 0;
        boolean weiter;

        do {
            i++;
            System.out.println(i);

            if (i < 10){
                weiter = true;
            }
            else {
                weiter = false;
            }
        }
        while (weiter);
    }
}
