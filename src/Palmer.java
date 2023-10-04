public class Palmer extends Krukväxter implements Interface{

    public String vätska = "Kranvatten";
    Palmer(double höjd,String namn){
        super(höjd,namn);
    }

    public double Räkning(){

        return (this.höjd /100) * 0.5;
    }

    @Override
    public String vätska() {
        return this.vätska;
    }




}
