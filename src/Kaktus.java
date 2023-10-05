public class Kaktus extends Krukväxter implements Interface {
// Ärver från superklassen krukväxter och implementerar från interfacen
    private String vätska = "Mineralvatten";
    private  int mängd = 2;

    Kaktus(double höjd, String namn) {
        super(höjd,namn,Enheter.CENTILITER);
    }

    @Override
    public double Räkning() {
        return  this.mängd;
    }

    @Override
    public String vätska() {
        return this.vätska;
    }




}
