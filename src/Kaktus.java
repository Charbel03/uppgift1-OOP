public class Kaktus extends Krukväxter {

    public String hej = "Hej";
    public String vätska = "Mineralvatten";

    Kaktus(double höjd) {
        super(höjd);
    }

    @Override
    public String Räkning() {
        return "Växten ska matas " + 2 + " cl/dag\n" +
                "Vätska: " + this.vätska;
    }
}
