import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void moreThanMaxNumbers() {
        Radio radio = new Radio(20);

        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    public void withTheBordersNumbers() {
        Radio radio = new Radio(6);

        radio.setCurrentStationNumber(6);

        Assertions.assertEquals(6, radio.getCurrentStationNumber());

    }

    @Test
    public void belowLimitValueNumber() {
        Radio radio = new Radio(-1);

        radio.setCurrentStationNumber(-1);


        Assertions.assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    public void limitValuNumber() {
        Radio radio = new Radio(0);

        radio.setCurrentStationNumber(0);

        Assertions.assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    public void limitValutNumber() {
        Radio radio = new Radio(9);

        radio.setCurrentStationNumber(9);

        Assertions.assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    public void switchingBoundaryNumber() {
        Radio radio = new Radio(4);
        radio.setCurrentStationNumber(4);

        radio.next();


        Assertions.assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    public void switchingMoreBoundaryNumber() {
        Radio radio = new Radio(9);
        radio.setCurrentStationNumber(9);

        radio.next();



        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void switchingMBoundaryNumber() {
        Radio radio = new Radio(8);
        radio.setCurrentStationNumber(8);

        radio.next();


        Assertions.assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    public void switchingMoPrevBoundaryNumber() {
        Radio radio = new Radio(0);
        radio.setCurrentStationNumber(0);

        radio.prev();


        Assertions.assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    public void switchingMPrevBoundaryNumber() {
        Radio radio = new Radio(2);
        radio.setCurrentStationNumber(2);

        radio.prev();


        Assertions.assertEquals(3, radio.getCurrentStationNumber());
    }

    @Test
    public void switchingPlusBoundaryVolume() {
        Radio radio = new Radio(2);
        radio.setCurrentVolume(2);

        radio.plus();


        Assertions.assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void switchingMinBoundaryVolume() {
        Radio radio = new Radio(6);
        radio.setCurrentVolume(6);

        radio.minus();

        Assertions.assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void switchingMinGrBoundaryVolume() {
        Radio radio = new Radio(0);
        radio.setCurrentVolume(0);

        radio.minus();


        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void switchingPlusGRBoundaryVolume() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(100);

        radio.plus();


        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void belowLimitVolume() {
        Radio radio = new Radio(-1);

        radio.setCurrentVolume(-1);


        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void belowLimitMaxVolume() {
        Radio radio = new Radio(110);

        radio.setCurrentVolume(110);


        Assertions.assertEquals(0, radio.getCurrentVolume());
    }



}