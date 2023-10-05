import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


enum Enheter{
    LITER("Liter"),
    CENTILITER("Centiliter");

    final String liter;
    Enheter(String liter) {
        this.liter = liter;

    }
}

public class Main {

    public static void main(String[] args) {
        boolean found = false;


        List<Krukväxter> krukväxter = new ArrayList<>();
        // skapar växterna genom en ArrayList
        krukväxter.add( new Kaktus(20,"Igge"));
        krukväxter.add( new Palmer(500,"Laura"));
        krukväxter.add( new köttÄtandeVäxter(70,"MeatLoaf"));
        krukväxter.add( new Palmer(100,"Olof"));


            while (!found) {
                String krukväxtNamn = JOptionPane.showInputDialog(null, "Vilken växt ska få mat?");

                //om användaren trycker på cancel
                if (krukväxtNamn == null){
                    break;
                }

                //här så kollas om det användaren skrev in är faktiskt en växt
                for (Krukväxter krukväxt1: krukväxter){
                    if (krukväxt1.GetNamn().equalsIgnoreCase(krukväxtNamn.trim())){
                        JOptionPane.showMessageDialog(null, "Växten ska matas: "+
                                krukväxt1.Räkning()  + " " + krukväxt1.enhet.liter + "/Dag" +
                                        "\nVätska: "+ krukväxt1.vätska() );
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