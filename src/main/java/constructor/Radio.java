package constructor;

public class Radio {
    private int currentNumStation;
    private int currentVolume;
    private int maxNumStation = 9;
    private int minNumStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int amountStation = 10;

    public Radio() {
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation > maxNumStation || currentStation < minNumStation) {
            this.currentNumStation = currentNumStation;
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

    public void setCurrentStationWithLimiter(int currentStation) {
        if (currentStation > amountStation || currentStation < minNumStation) {
            this.currentNumStation = currentNumStation;
            return;
        }
        this.currentNumStation = currentStation;
    }

    public void setStationWithPushNextButtonWithLimiter() {
        if (currentNumStation == amountStation) {
            currentNumStation = minNumStation;
            return;
        }
        currentNumStation++;

    }

    public void setStationWithPushPrewButtonWithLimiter() {
        if (currentNumStation == minNumStation) {
            currentNumStation = amountStation;
            return;
        }
        --currentNumStation;
    }
}






