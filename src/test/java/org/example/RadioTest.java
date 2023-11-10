package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void radioChanel() {
        Radio radio = new Radio();
        radio.setRadioChannel(9);

        int expected = 9;
        int actual = radio.radioChannel;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setMaxChanel() {
        Radio radio = new Radio();
        radio.setMaxChannel(9);

        int expected = 9;
        int actual = radio.radioChannel;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNextChannel() {
        Radio radio = new Radio();
        radio.setNextChannel(9);

        int expected = 0;
        int actual = radio.radioChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextChannel2() {
        Radio radio = new Radio();
        radio.setNextChannel(5);

        int expected = 6;
        int actual = radio.radioChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousChannel() {
        Radio radio = new Radio();
        radio.setPreviousChannel(0);

        int expected = 9;
        int actual = radio.radioChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousChannel2() {
        Radio radio = new Radio();
        radio.setPreviousChannel(5);

        int expected = 4;
        int actual = radio.radioChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(40);
        int expected = 41;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(100);
        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setReductionVolume() {
        Radio radio = new Radio();
        radio.setReductionVolume(0);
        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setReductionVolume2() {
        Radio radio = new Radio();
        radio.setReductionVolume(22);
        int expected = 21;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}