import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {
Kaktus k = new Kaktus(33, "Bob");
    @Test
    void räkning() {

        double ExpectedVärde = 2;
        double ActualVärde = k.Räkning();

        Assertions.assertEquals(ExpectedVärde,ActualVärde);


    }
}