package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void setRadioChanel() {
        Radio radio = new Radio();
        radio.setRadioChannel(7);

        int expected = 7;
        int actual = radio.getRadioChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setRadioChanel2() {
        Radio radio = new Radio();
        radio.setRadioChannel(11);

        int expected = 0;
        int actual = radio.getRadioChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setRadioChanel3() {
        Radio radio = new Radio();
        radio.setRadioChannel(-1);

        int expected = 0;
        int actual = radio.getRadioChannel();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNextChanel() {
        Radio radio = new Radio();
        radio.setRadioChannel(9);
        radio.nextChannel();

        int expected = 0;
        int actual = radio.getRadioChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextChanel2() {
        Radio radio = new Radio();
        radio.setRadioChannel(6);
        radio.nextChannel();

        int expected = 7;
        int actual = radio.getRadioChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousChannel() {
        Radio radio = new Radio();
        radio.setRadioChannel(0);
        radio.previousChannel();

        int expected = 9;
        int actual = radio.getRadioChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousChannel2() {
        Radio radio = new Radio();
        radio.setRadioChannel(7);
        radio.previousChannel();

        int expected = 6;
        int actual = radio.getRadioChannel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);

        int expected = 55;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-4);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setCurrentVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(111);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);
        radio.nextVolume();

        int expected = 56;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.nextVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.previousVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPreviousVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.previousVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


