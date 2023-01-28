package org.example;

public class Radio {
    public int correntRadiostation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    public int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;


    public int getCorrentRadiostation() {
        return correntRadiostation;
    }

    public void setToMaxRadistation() {
        correntRadiostation = maxRadioStation;
    }


    public void setCorrentRadiostation(int newCorrentRadiostation) {
        if (newCorrentRadiostation < minRadioStation) {
            return;
        }
        if (newCorrentRadiostation > maxRadioStation) {
            return;
        }
        correntRadiostation = newCorrentRadiostation;
    }

    public void nextStation() {
        if (correntRadiostation >= maxRadioStation) {
            setCorrentRadiostation(minRadioStation);
        } else {
            correntRadiostation = correntRadiostation + 1;
        }
    }

    public void prevStation() {
        if (correntRadiostation <= minRadioStation) {
            setCorrentRadiostation(maxRadioStation);
        } else {
            correntRadiostation = correntRadiostation - 1;
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
        currentVolume = newCorrentVolume;
    }

    public void plusVolume() {

        setCorrentVolume(currentVolume + 1);

    }

    public void minusVolume() {
        setCorrentVolume(currentVolume - 1);
    }
}






