package org.example;

public class Radio {
    public int radioChannel;
    public int currentVolume;

    public void setRadioChannel(int newRadioChannel) {
        radioChannel = newRadioChannel;
    }

    public void setMaxChannel(int newSetMaxChannel) {
        radioChannel = newSetMaxChannel;
        radioChannel = 9;
    }

    public void setNextChannel(int newSetNextChannel) {
        radioChannel = newSetNextChannel;
        if (radioChannel < 9) {
            radioChannel = radioChannel + 1;
        } else {
            radioChannel = 0;
        }
    }


    public void setPreviousChannel(int newSetPreviousChannel) {
        radioChannel = newSetPreviousChannel;
        if (radioChannel > 0) {
            radioChannel = radioChannel - 1;
        } else {
            radioChannel = 9;
        }
    }

    public void setIncreaseVolume(int newSetIncreaseVolume) {
        currentVolume = newSetIncreaseVolume;
        if (currentVolume < 100) ;
        {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume > 100) {
            currentVolume = 0;
        }
    }

    public void setReductionVolume(int newSetReductionVolume) {
        currentVolume = newSetReductionVolume;
        if (currentVolume > 0) ;
        {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            currentVolume = 100;
        }
    }


}