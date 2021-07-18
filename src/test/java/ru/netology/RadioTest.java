package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetStation() {
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentNumStation());
    }

    @Test
    public void shouldNotSetStationWithNumButtonLowMin() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentNumStation());


    }

    @Test
    public void shouldNotSetStationWithNumButtonAboveMax() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentNumStation());

    }


    @Test
    public void ShouldSetStationWithPushNextButton() {
        radio.setCurrentStation(5);
        radio.setStationWithPushNextButton();
        assertEquals(6, radio.getCurrentNumStation());
    }

    @Test
    public void ShouldSetStationWithPushNextButtonAboveMax() {
        radio.setCurrentStation(9);
        radio.setStationWithPushNextButton();
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
        radio.setCurrentVolume(9);
        radio.shouldIncreaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        radio.setCurrentVolume(10);
        radio.shouldIncreaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeLowMinimum() {
        radio.setCurrentVolume(-11);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeAboveMaximum() {
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }
}



