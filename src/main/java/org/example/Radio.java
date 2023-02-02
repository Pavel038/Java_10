package org.example;

public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int correntRadiostation = minRadioStation;
    private int numberOfRadioStations = 10;
    private int maxVolume = 10;
    private int minVolume = 0;
    public int currentVolume;


    public Radio() {
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }


    public int getCorrentRadiostation() {
        return correntRadiostation;
    }
    public int getToMaxRadistation() {
        return maxRadioStation;
    }
        public void setToMaxRadistation() {
        this.maxRadioStation = maxRadioStation;
    }

    public int getToMinRadistation() {
        return minRadioStation;
    }

    public void setToMinRadistation() {
        this.minRadioStation = minRadioStation;
        
    }
    
    public int getnumberOfRadioStations() {
        return numberOfRadioStations;

    }
    
     public void setnumberOfRadioStations() {
        if (numberOfRadioStations > maxRadioStation) {
            this.numberOfRadioStations = maxRadioStation;
        }
    }

    public void setCorrentRadiostation(int newCorrentRadiostation) {
        if (newCorrentRadiostation < minRadioStation) {
            return;
        }
        if (newCorrentRadiostation > maxRadioStation) {
            return;
        }
        this.correntRadiostation = newCorrentRadiostation;
    }

    public void nextStation() {
        if (correntRadiostation >= maxRadioStation) {
            setCorrentRadiostation(minRadioStation);
        } else {
            this.correntRadiostation = correntRadiostation + 1;
        }
    }

    public void prevStation() {
        if (correntRadiostation <= minRadioStation) {
            setCorrentRadiostation(maxRadioStation);
        } else {
            this.correntRadiostation = correntRadiostation - 1;
        }
    }

    public int getCorrentVolume() {
        return currentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }


    public void setCorrentVolume(int newCorrentVolume) {
        if (newCorrentVolume < minVolume) {
            return;
        }
        if (newCorrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = newCorrentVolume;
    }

    public void plusVolume() {

        setCorrentVolume(currentVolume + 1);

    }

    public void minusVolume() {
        setCorrentVolume(currentVolume - 1);
    }
}






