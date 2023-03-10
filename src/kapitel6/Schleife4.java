package kapitel6;

public class Schleife4 {
    public static void main(String[] args) {
        int i = 0;
        boolean weiter = true;

        while (weiter) {
            i++;
            System.out.println(i);

            if (i < 10){
                weiter = true;
            }
            else {
                weiter = false;
            }
        }

    }
}
