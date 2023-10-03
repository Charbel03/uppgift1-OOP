public class Krukväxter implements Interface{
    double höjd;
    String vätska = "Vatten";

    Krukväxter(double höjd){
        this.höjd = höjd;
    }


    public String Räkning() {
        return 2 + "";
    }

    @Override
    public String vätska() {
        return null;
    }
}
