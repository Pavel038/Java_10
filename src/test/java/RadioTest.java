import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shoutsetToMaxRadistation() {
        Radio rad = new Radio();
        int maxRadioStation = 9;
        rad.setToMaxRadistation();
        int expected = 9;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostation() {
        Radio rad = new Radio();
        rad.setCorrentRadiostation(2);
        int expected = 2;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNodSetRadiostationsAboveMax() {
        Radio rad = new Radio();
        rad.setCorrentRadiostation(10);
        int expected = 0;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNodSetRadiostationsAboveMin() {
        Radio rad = new Radio();
        rad.setCorrentRadiostation(-1);
        int expected = 0;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        Radio rad = new Radio();
        rad.setCorrentRadiostation(5);

        rad.nextStation();
        int expected = 6;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overInitialRadioStation() {
        Radio rad = new Radio();
        rad.setCorrentRadiostation(9);

        rad.nextStation();
        int expected = 0;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio rad = new Radio();
        rad.setCorrentRadiostation(4);

        rad.prevStation();
        int expected = 3;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void underInitialRadioStation() {
        Radio rad = new Radio();
        rad.setCorrentRadiostation(-1);

        rad.prevStation();
        int expected = 9;
        int actual = rad.getCorrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shoutsetToMaxVolume() {
        Radio rad = new Radio();
        int maxVolume = 10;
        rad.setToMaxVolume();
        int expected = 10;
        int actual = rad.getCorrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio rad = new Radio();
        rad.setCorrentVolume(2);
        int expected = 2;
        int actual = rad.getCorrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNodSetVolumeAboveMax() {
        Radio rad = new Radio();
        rad.setCorrentVolume(11);
        int expected = 0;
        int actual = rad.getCorrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNodSetVelumeAboveMin() {
        Radio rad = new Radio();
        rad.setCorrentVolume(-1);
        int expected = 0;
        int actual = rad.getCorrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolume() {
        Radio rad = new Radio();
        rad.setCorrentVolume(5);

        rad.plusVolume();
        int expected = 6;
        int actual = rad.getCorrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolume() {
        Radio rad = new Radio();
        rad.setCorrentVolume(9);

        rad.minusVolume();
        int expected = 8;
        int actual = rad.getCorrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
