package org.example;

public class Radio {
    public int radioChannel;
    public int currentVolume;

    public void setRadioChannel(int newRadioChannel) {
        radioChannel = newRadioChannel;
    }

    public void setMaxChannel() {
        radioChannel = 9;
    }

    public void setNextChannel() {
        if (radioChannel > 9) ;
        {
            radioChannel = radioChannel + 1;
            radioChannel = 0;
        }
    }

    public void setPreviousChannel() {
        radioChannel = 0;
        if (radioChannel <= 0) {
            radioChannel = radioChannel - 1;
            radioChannel = 9;
        }
    }

    public void setIncreaseVolume(int newSetIncreaseVolume) {
        currentVolume = newSetIncreaseVolume;
        if (currentVolume <= 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 100) {
            currentVolume = 0;
        }
    }

    public void setReductionVolume(int newSetReductionVolume) {
        currentVolume = newSetReductionVolume;
        if (currentVolume >= 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            currentVolume = 100;
        }
    }


}