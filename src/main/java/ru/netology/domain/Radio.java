package ru.netology.domain;

public class Radio {
    private int currentNumStation;
    private int currentVolume;
    private int maxNumStation = 9;
    private int minNumStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;


    public void setCurrentStation(int currentStation) {
        if (currentStation > maxNumStation || currentStation < minNumStation) {
            this.currentNumStation = minNumStation;
            return;
        }
        this.currentNumStation = currentStation;
    }

    public int getCurrentNumStation() {
        return currentNumStation;


    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStationWithPushNextButton() {
        if (currentNumStation == maxNumStation) {
            currentNumStation = minNumStation;
            return;
        }
        currentNumStation++;

    }


    public void setStationWithPushPrewButton() {
        if (currentNumStation == minNumStation) {
            currentNumStation = maxNumStation;
            return;
        }
        --currentNumStation;
    }


    public void shouldIncreaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        ++currentVolume;
    }


    public void shouldDecreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        --currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > maxVolume || currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }

        this.currentVolume = currentVolume;
    }
}





