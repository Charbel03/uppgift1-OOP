public class köttÄtandeVäxter extends Krukväxter implements Interface {
// Ärver från superklassen krukväxter och implementerar från interfacen

    private String vätska = "Proteindryck";
    köttÄtandeVäxter(double höjd, String namn) { // konstruktör
        super(höjd, namn,Enheter.LITER);
    }


    public double Räkning(){

        return ( 0.1 + (this.höjd /100) * 0.2);
    }


    @Override
    public String vätska() {
        return this.vätska;
    }
}
