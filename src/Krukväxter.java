public class Krukväxter implements Interface{
    // implementerar från interfacen

    private String vätska = "Vatten";

    Enheter enhet;
    double höjd;
    String namn;

    Krukväxter(double höjd,String namn,Enheter enhet){ // konstruktör
        this.höjd = höjd;
        this.namn = namn;
        this.enhet = enhet;
    }

    public String GetNamn(){
        return this.namn;
    }

    @Override
    public String vätska() {
        return this.vätska;
    }

    @Override
    public double Räkning() {
        return 2;
    }


}
