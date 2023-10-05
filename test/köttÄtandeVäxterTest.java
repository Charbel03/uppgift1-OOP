import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class köttÄtandeVäxterTest {

    köttÄtandeVäxter k = new köttÄtandeVäxter(50,"Bob");
    @Test
    void räkning() {

        double ExpectedValue = 0.2;
        double ActualValue = k.Räkning();

        //kollar om räkningen stämmer
        Assertions.assertEquals(ExpectedValue,ActualValue);
    }
}