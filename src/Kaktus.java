public class Kaktus extends Krukväxter implements Interface {


    Kaktus(double höjd, String namn) {
        super(höjd,namn,Enheter.CENTILITER);

    }

    @Override
    public double Räkning() {
        return  2;
    }

    @Override
    public String vätska() {
        return "Mineralvatten";
    }




}
