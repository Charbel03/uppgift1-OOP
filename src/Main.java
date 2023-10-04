import javax.swing.*;
import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.List;


enum Enheter{
    LITER("Liter"),
    CENTILITER("Centiliter");

    final String enhet;
    Enheter(String enhet) {
        this.enhet = enhet;

    }
}

public class Main {


    public static void main(String[] args) {
        boolean found = false;

        List<Krukväxter> krukväxter = new ArrayList<>();

        krukväxter.add( new Kaktus(20,"Igge"));
        krukväxter.add( new Palmer(500,"Laura"));
        krukväxter.add( new köttÄtandeVäxter(70,"MeatLoaf"));
        krukväxter.add( new Palmer(100,"Olof"));


            while (!found) {
                String krukväxtNamn = JOptionPane.showInputDialog(null, "Vilken växt ska få mat?");

                if (krukväxtNamn == null){
                    break;
                }

                for (Krukväxter x: krukväxter){
                    if (x.GetNamn().equalsIgnoreCase(krukväxtNamn.trim())){
                        JOptionPane.showMessageDialog(null, "Växten ska matas: "+
                                x.Räkning()  + " " + x.enhet.enhet + "/Dag" +
                                        "\nVätska: "+ x.vätska() );
                        found = true;
                        break;
                    }
                }
                if (!found){
                    JOptionPane.showMessageDialog(null,"Ingen växt hittades med namnet: " +
                            krukväxtNamn + "\nFörsök igen!");
                }
            }
    }
}