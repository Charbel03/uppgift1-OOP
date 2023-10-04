public class Krukväxter implements Interface{
    double höjd;
    String namn;
    String vätska = "Vatten";

    Krukväxter(double höjd,String namn){
        this.höjd = höjd;
        this.namn = namn;
    }


    public double Räkning() {
        return 2;
    }

    @Override
    public String vätska() {
        return null;
    }

    public String GetNamn(){
        return this.namn;
    }
}
