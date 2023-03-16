import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParamsRadioTest {
    @Test
    public void test() {

        Radio radio = new Radio(20);

        radio.setCurrentNumber(15);

        int expected = 15;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
}