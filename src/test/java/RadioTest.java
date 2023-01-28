import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio(9, 0, 3, 100, 0, 7);

    @Test
    public void shoutsetToMaxRadistation() {
        int maxRadioStation = 9;
        rad.setToMaxRadistation();
        int expected = 9;
        int actual = rad.getToMaxRadistation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostation() {
        rad.setCorrentRadiostation(3);
        int expected = 3;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNodSetRadiostationsAboveMax() {
        rad.setCorrentRadiostation(11);
        int expected = 0;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNodSetRadiostationsAboveMin() {
        rad.setCorrentRadiostation(-1);
        int expected = 0;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        rad.setCorrentRadiostation(5);

        rad.nextStation();
        int expected = 6;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overInitialRadioStation() {
        rad.setCorrentRadiostation(9);

        rad.nextStation();
        int expected = 0;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        rad.setCorrentRadiostation(4);

        rad.prevStation();
        int expected = 3;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void underInitialRadioStation() {
        rad.setCorrentRadiostation(-1);

        rad.prevStation();
        int expected = 9;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shoutsetToMaxVolume() {
        int maxVolume = 100;
        rad.setToMaxVolume();
        int expected = 100;
        int actual = rad.getCorrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        rad.setCorrentVolume(2);
        int expected = 2;
        int actual = rad.getCorrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNodSetVolumeAboveMax() {
        rad.setCorrentVolume(101);
        int expected = 0;
        int actual = rad.getCorrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNodSetVelumeAboveMin() {
        rad.setCorrentVolume(-1);
        int expected = 0;
        int actual = rad.getCorrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolume() {
        rad.setCorrentVolume(5);

        rad.plusVolume();
        int expected = 6;
        int actual = rad.getCorrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolume() {
        rad.setCorrentVolume(9);

        rad.minusVolume();
        int expected = 8;
        int actual = rad.getCorrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
