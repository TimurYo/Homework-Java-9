public class Radio {
    private int maxStation= 9;
    private int minStation=0;
    private int currentStation;
    private int maxLevelOfSound=100;
    private int minLevelOfSound= 0;
    private int currentLevelOfSound;

    public Radio() {
        maxStation=9;
    }
    public Radio(int quantityOfStations) {
        maxStation=minStation + quantityOfStations;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }
    public int getMinStation(){
        return minStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
        setCurrentLevelOfSound(currentStation);
    }

    public void prev() {
        int wantedStation;
        if (currentStation == minStation) {
            wantedStation = maxStation;
        } else {
            wantedStation = currentStation - 1;
        }
        setCurrentStation(wantedStation);
    }

    public int getCurrentLevelOfSound() {
        return currentLevelOfSound;
    }

    public int getMaxLevelOfSound(){
        return maxLevelOfSound;
    }
    public int getMinLevelOfSound(){
        return minLevelOfSound;
    }

    public void setCurrentLevelOfSound(int newCurrentLevelOfSound) {
        if (newCurrentLevelOfSound < minLevelOfSound) {
            return;
        }
        if (newCurrentLevelOfSound > maxLevelOfSound) {
            return;
        }
        currentLevelOfSound = newCurrentLevelOfSound;
    }

    public void plus() {
        int levelUp;
        if (currentLevelOfSound == maxLevelOfSound) {
            return;
        } else {
            levelUp = currentLevelOfSound++;
        }
        levelUp = currentLevelOfSound;
        setCurrentLevelOfSound(levelUp);
    }

    public void minus() {
        int levelDown;
        if (currentLevelOfSound == minLevelOfSound) {
            return;
        } else {
            levelDown = currentLevelOfSound - 1;
        }
        setCurrentLevelOfSound(levelDown);
    }
}