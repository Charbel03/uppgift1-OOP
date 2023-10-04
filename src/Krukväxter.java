public class Krukväxter implements Interface{
    Enheter enhet;
    double höjd;
    String namn;
    Krukväxter(double höjd,String namn,Enheter enhet){
        this.höjd = höjd;
        this.namn = namn;
        this.enhet = enhet;

    }

    public String GetNamn(){
        return this.namn;
    }

    @Override
    public String vätska() {
        return "Vatten";
    }

    @Override
    public double Räkning() {
        return 1;
    }


}
