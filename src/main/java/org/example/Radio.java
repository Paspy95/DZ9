package org.example;

public class Radio {
    private int radioChannel;
    private int currentVolume;
    private int maxChannel;

    public Radio() {
        maxChannel = 9;
    }

    public Radio(int numberStation) {
        this.maxChannel = numberStation - 1;
    }


    public int getRadioChannel() {
        return radioChannel;
    }

    public void setRadioChannel(int radioChannel) {
        if (radioChannel < 0) {
            return;
        }
        if (radioChannel > maxChannel) {
            return;
        }
        this.radioChannel = radioChannel;
    }

    public void nextChannel() {
        if (radioChannel != maxChannel) {
            radioChannel++;
        } else {
            radioChannel = 0;
        }
    }

    public void previousChannel() {
        if (radioChannel != 0) {
            radioChannel--;
        } else {
            radioChannel = maxChannel;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void previousVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}
