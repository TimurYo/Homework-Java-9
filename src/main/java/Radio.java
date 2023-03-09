public class Radio {

    private int currentStation;
    private int currentLevelOfSound;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {

        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
        setCurrentLevelOfSound(currentStation);
    }

    public void prev() {
        int wantedStation;
        if (currentStation == 0) {
            wantedStation = 9;
        } else {
            wantedStation = currentStation - 1;
        }
        setCurrentStation(wantedStation);
    }

    public int getCurrentLevelOfSound() {
        return currentLevelOfSound;
    }

    public void setCurrentLevelOfSound(int newCurrentLevelOfSound) {
        if (newCurrentLevelOfSound < 0) {
            return;
        }
        if (newCurrentLevelOfSound > 10) {
            return;
        }
        currentLevelOfSound = newCurrentLevelOfSound;
    }

    public void plus() {
        int levelUp;
        if (currentLevelOfSound == 10) {
            return;
        } else {
            levelUp = currentLevelOfSound ++;
        }
        levelUp=currentLevelOfSound;
        setCurrentLevelOfSound(levelUp);
    }

    public void minus() {
        int levelDown;
        if (currentLevelOfSound == 0) {
            return;
        } else {
            levelDown = currentLevelOfSound - 1;
        }
        setCurrentLevelOfSound(levelDown);
    }
}