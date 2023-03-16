package org.example;

public class Radio {
    private int currentNumber;
    private int currentVolume;
    private int maxNumber;


    public Radio () {
        this.maxNumber = 9;
    }

    public Radio(int stationsCount) {
        this.maxNumber = stationsCount - 1;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < 0) {
            return;
        }
        if (currentNumber > maxNumber) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
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

    public void next() {
        if (currentNumber != maxNumber) {
            currentNumber++;
        } else {
            currentNumber = 0;
        }
    }

    public void prev() {
        if (currentNumber != 0) {
            currentNumber--;
        } else {
            currentNumber = maxNumber;
        }
    }

    public void addVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
           return;
        }
    }

    public void reduceVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            return;
        }
    }
}