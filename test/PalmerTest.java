import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalmerTest {

    Palmer p = new Palmer(300,"Bob");
    @Test
    void Räkning() {

        double ExpectedValue = 1.5;
        double ActualValue = p.Räkning();

        //kollar om räkningen stämmer
        Assertions.assertEquals(ExpectedValue,ActualValue);
    }
}