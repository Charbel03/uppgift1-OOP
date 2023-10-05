public class Palmer extends Krukväxter implements Interface{
// Ärver från superklassen krukväxter och implementerar från interfacen

    private String vätska = "Kranvatten";
    Palmer(double höjd,String namn){ // konstruktör
        super(höjd,namn,Enheter.LITER);
    }

    public double Räkning(){

        return (this.höjd /100) * 0.5;
    }

    @Override
    public String vätska() {
        return this.vätska;
    }





}
