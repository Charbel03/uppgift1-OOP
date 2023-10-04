import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmerTest {

    Palmer p = new Palmer(300.1,"Bob");
    @Test
    void Räkning() {

        double ExpectedValue = 1.5;
        double ActualValue = p.Räkning();

        Assertions.assertEquals(ExpectedValue,ActualValue);
    }
}