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
        radio.setMaxChannel();

        int expected = 9;
        int actual = radio.radioChannel;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNextChanel() {
        Radio radio = new Radio();
        int radioChanel = 10;
        radio.setNextChannel();

        int expected = 0;
        int actual = radio.radioChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousChannel() {
        Radio radio = new Radio();
        int radioChannel=-1;
        radio.setPreviousChannel();

        int expected = 9;
        int actual = radio.radioChannel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(101);
        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setReductionVolume() {
        Radio radio = new Radio();
        radio.setReductionVolume(-1);
        int expected = 100;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}