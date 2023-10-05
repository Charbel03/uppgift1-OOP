import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KaktusTest {

    //Skapar en kaktus för att testa den
    Kaktus k = new Kaktus(10, "Bob");
    @Test
    void räkning() {

        double ExpectedVärde = 2;
        double ActualVärde = k.Räkning();

        //kollar om räkningen stämmer
        Assertions.assertEquals(ExpectedVärde,ActualVärde);


    }
}