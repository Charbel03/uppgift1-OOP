public class köttÄtandeVäxter extends Krukväxter implements Interface {

    public String vätska = "Proteindryck";
    köttÄtandeVäxter(double höjd, String namn) {
        super(höjd, namn);
    }


    public double Räkning(){

        return ( 0.1 + (this.höjd /100) * 0.2);
    }


    @Override
    public String vätska() {
        return this.vätska;
    }
}
