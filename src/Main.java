import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


enum växter{
    Palmer,
    köttÄtandeVäxter,
    Kaktus;
}

public class Main {


    public static void main(String[] args) {
        boolean found = false;

        List<Krukväxter> krukväxter = new ArrayList<>();

        krukväxter.add( new Kaktus(20,"Igge") );
        krukväxter.add( new Palmer(500,"Laura") );
        krukväxter.add( new köttÄtandeVäxter(70,"MeatLoaf") );
        krukväxter.add( new Palmer(100,"Olof") );



            while (!found) {
                String krukväxt = JOptionPane.showInputDialog(null, "Vilken växt ska få mat?");

                if (krukväxt == null){
                    break;
                }

                for (Krukväxter x: krukväxter){
                    if (x.GetNamn().equalsIgnoreCase(krukväxt)){
                        JOptionPane.showMessageDialog(null, "Växten ska matas: "+ x.Räkning());
                        found = true;
                        break;
                    }
                }
                if (!found){
                    JOptionPane.showMessageDialog(null,"Ingen växt hittades med namnet: " + krukväxt);
                }
            }
    }
}