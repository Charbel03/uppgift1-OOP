import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class köttÄtandeVäxterTest {

    köttÄtandeVäxter k = new köttÄtandeVäxter(50,"Bob");
    @Test
    void räkning2() {

        double ExpectedValue = 0.2;
        double ActualValue = k.Räkning();

        Assertions.assertEquals(ExpectedValue,ActualValue);
    }
}