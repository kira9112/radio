package constructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentNumStation;
    private int currentVolume;
    private int minNumStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int amountStation = 10;

   //public Radio() {
    //}

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation >= amountStation || currentStation < minNumStation) {
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
        if (currentNumStation == amountStation - 1) {
            currentNumStation = minNumStation;
            return;
        }
        currentNumStation++;

    }


    public void setStationWithPushPrewButton() {
        if (currentNumStation == minNumStation) {
            currentNumStation = amountStation - 1;
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






