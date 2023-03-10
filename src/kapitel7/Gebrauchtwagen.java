package kapitel7;

public class Gebrauchtwagen {
    public static void main (String[] args){
        Auto Auto1 = new Auto(8999.99, "VW Golf", 2007, 56845, "blau");

        System.out.println(Auto1.getPreis());
        System.out.println(Auto1.getModell());
        System.out.println(Auto1.getBaujahr());
        System.out.println(Auto1.getKilometerstand());
        System.out.println(Auto1.getFarbe());

        Auto1.setPreis(8799.99);

        System.out.print("Der neue Preis beträgt:
                "+Auto1.getPreis());
    }
}
