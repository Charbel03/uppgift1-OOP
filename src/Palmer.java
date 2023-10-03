public class Palmer extends Krukväxter{

    public String vätska = "Kranvatten";
    Palmer(double höjd){
        super(höjd);
    }

    public String Räkning(){

        return "Växten ska matas " + (this.höjd /100) * 0.5 + " Liter/dag\n" +
                "Vätska: " + this.vätska;
    }


}
