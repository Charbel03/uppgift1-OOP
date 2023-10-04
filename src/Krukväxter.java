public class Krukväxter implements Interface{
    double höjd;
    String namn;
    Krukväxter(double höjd,String namn){
        this.höjd = höjd;
        this.namn = namn;
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
