import javax.swing.*;
import java.awt.*;
import java.util.Scanner;


enum växter{
    Palmer, köttÄtandeVäxter, Kaktus;
}

public class Main {

    public static void main(String[] args) {
        Krukväxter krukväxten = null;
/*
        Krukväxter Igge = new Kaktus(20);
        Krukväxter Laura = new Palmer(300);
        Krukväxter Meatloaf = new köttÄtandeVäxter(50);
        Krukväxter Olof = new Palmer(100);


        System.out.println(Laura.Räkning());
        System.out.println("\n");
        System.out.println(Meatloaf.Räkning());
        System.out.println("\n");
        System.out.println(Igge.Räkning());


 */
        double höjd = 0;
        String krukväxt = "";

        while (true) {
            while (true) {
                krukväxt = JOptionPane.showInputDialog(null, "Vilken växt ska få mat?");
                if (krukväxt.equalsIgnoreCase("palmer") ||
                        (krukväxt.equalsIgnoreCase("köttätande") ||
                                (krukväxt.equalsIgnoreCase("kaktus")))) {
                    krukväxt = krukväxt.toLowerCase();
                    break;
                }
            }
            höjd = Integer.parseInt(JOptionPane.showInputDialog(null,"Skriv in växtens höjd (i cm): "));
            if (höjd >= 1){
                break;
            }

        }


        System.out.println(krukväxt);

        switch (krukväxt){
            case "palmer":
                krukväxten = new Palmer(höjd);
                JOptionPane.showMessageDialog(null,krukväxten.Räkning());
                break;
            case "kaktus":
                krukväxten = new Kaktus(höjd);
                break;
            case "köttätande":
                krukväxten = new köttÄtandeVäxter(höjd);
                break;
        }


       // System.out.println(krukväxten.Räkning());
        //krukväxten = new kaktus(höjd);

        JOptionPane.showMessageDialog(null,krukväxten.Räkning());


    }
}