public class köttÄtandeVäxter extends Krukväxter {

    public String vätska = "Proteindryck";
    köttÄtandeVäxter(double höjd) {
        super(höjd);
    }


    public String Räkning(){

        return "Växten ska matas " + ( 0.1 + (this.höjd /100) * 0.2) + " liter/dag\n" +
                "Vätska: " + this.vätska;
    }

}
