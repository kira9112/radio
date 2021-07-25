package constructor;

import org.junit.jupiter.api.Test;
import constructor.Radio;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentNumStation());
    }

    @Test
    public void shouldSetStationWithLimiter() {
        Radio radio = new Radio(5);
        radio.setCurrentStationWithLimiter(4);
        assertEquals(4, radio.getCurrentNumStation());
    }

    @Test
    public void shouldSetStationAboveLimiter() {
        Radio radio = new Radio(5);
        radio.setCurrentStationWithLimiter(6);
        assertEquals(0, radio.getCurrentNumStation());
    }


    @Test
    public void shouldNotSetStationWithNumButtonLowMin() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentNumStation());


    }
    @Test
    public void shouldNotSetStationWithNumButtonLowMinWithLimiter() {
        Radio radio = new Radio(5);
        radio.setCurrentStationWithLimiter(-1);
        assertEquals(0, radio.getCurrentNumStation());


    }

    @Test
    public void shouldNotSetStationWithNumButtonAboveMax() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentNumStation());

    }
    @Test
    public void shouldNotSetStationWithNumButtonAboveMaxWithLimiter() {
        Radio radio = new Radio(5);
        radio.setCurrentStationWithLimiter(10);
        assertEquals(0, radio.getCurrentNumStation());

    }


    @Test
    public void ShouldSetStationWithPushNextButton() {
        radio.setCurrentStation(5);
        radio.setStationWithPushNextButton();
        assertEquals(6, radio.getCurrentNumStation());
    }

    @Test
    public void ShouldSetStationWithPushNextButtonWithLimiter() {
        Radio radio = new Radio(5);
        radio.setCurrentStationWithLimiter(4);
        radio.setStationWithPushNextButtonWithLimiter();
        assertEquals(5, radio.getCurrentNumStation());
    }

    @Test
    public void ShouldSetStationWithPushNextButtonAboveMax() {
        radio.setCurrentStation(9);
        radio.setStationWithPushNextButton();
        assertEquals(0, radio.getCurrentNumStation());
    }
    @Test
    public void ShouldSetStationWithPushNextButtonAboveMaxWithLimiter() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(5);
        radio.setStationWithPushNextButtonWithLimiter();
        assertEquals(0, radio.getCurrentNumStation());
    }


    @Test
    public void shouldSetStationWithPushPrewButton() {
        radio.setCurrentStation(5);
        radio.setStationWithPushPrewButton();
        assertEquals(4, radio.getCurrentNumStation());
    }

    @Test
    public void shouldSetStationWithPushPrewButtonLowMin() {
        radio.setCurrentStation(0);
        radio.setStationWithPushPrewButton();
        assertEquals(9, radio.getCurrentNumStation());
    }
    @Test
    public void shouldSetStationWithPushPrewButtonLowMinWithLimiter() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(0);
        radio.setStationWithPushPrewButtonWithLimiter();
        assertEquals(5, radio.getCurrentNumStation());
    }

    @Test
    public void shouldSetStationWithPushPrewButtonWithLimiter() {
        Radio radio = new Radio(5);
        radio.setCurrentStation(5);
        radio.setStationWithPushPrewButtonWithLimiter();
        assertEquals(4, radio.getCurrentNumStation());
    }

    @Test
    public void shouldNotDecreaseVolume0() {
        radio.shouldDecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(1);
        radio.shouldDecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(99);
        radio.shouldIncreaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }


    @Test
    public void shouldNotIncreaseVolume() {
        radio.setCurrentVolume(100);
        radio.shouldIncreaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeLowMinimum() {
        radio.setCurrentVolume(-11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeAboveMaximum() {
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldUseDefaultConstructor() {
        Radio radio = new Radio();

    }

    @Test
    public void shouldUseConstructor() {
        Radio radio = new Radio(5);

    }
}



