package kapitel4;

public class Datentyp2 {
    public static void main(String[] args) {
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;

        d = 3.7432;
        f = (float)d;
        l = (long)f;
        i = (int)l;
        s = (short)i;
        b = (byte)s;

        System.out.print("Der Wert der Variablen b ist " + b + ".");
    }
}
