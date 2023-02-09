import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetNextNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(4);
        radio.next ();
        int expected = 5;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(4);
        radio.prev ();
        int expected = 3;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldGetCurrentNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(5);
        int expected = 5;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldAddVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.addVolume ();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.reduceVolume ();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
