import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetNextNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(8);
        radio.next ();
        int expected = 9;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetNextNumberBAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.next ();
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetNumberAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnIfSetVolumeAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnIfSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(3);
        radio.prev ();
        int expected = 2;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setPrevIfZero() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.prev ();
        int expected = 9;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetPrevNumberAboveBorders() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.prev ();
        int expected = 9;
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
    public void shouldReturnIfCurrentNumberAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentNumber(10);
        int expected = 0;
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
    public void shouldNotAddVolumeAboveBorders() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.addVolume ();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume ();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceVolumeIfNotMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.reduceVolume ();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotReduceVolumeAboveBorders() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume ();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
