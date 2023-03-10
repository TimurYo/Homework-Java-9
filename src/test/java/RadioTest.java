import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "150,0",
            "10,0",
            "9,9",
            "8,8",
            "5,5",
            "1,1",
            "0,0",
            "-1,0",
            "-20,0"
    })
    public void seeCurrentStation(int stationAtThisMoment, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(stationAtThisMoment);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "9,9",
    })
    public void testOfStationConstructor(int x,int expected){
        Radio radio=new Radio(x);
        int actual= radio.getMaxStation();
        Assertions.assertEquals(expected,actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "3,4",
            "9,0"
    })
    public void nextStation(int stationAtThisMoment, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(stationAtThisMoment);

        radio.next();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,9",
            "6,5",
            "9,8",
    })
    public void prevStation(int stationAtThisMoment, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(stationAtThisMoment);

        radio.prev();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "150,0",
            "12,12",
            "11,11",
            "10,10",
            "9,9",
            "6,6",
            "1,1",
            "0,0",
            "-1,0",
            "-150,0"
    })
    public void seeCurrentLevelOfSound(int levelOfSoundAtThisMoment, int expected) {
        Radio radio = new Radio();
        radio.setCurrentLevelOfSound(levelOfSoundAtThisMoment);

        int actual = radio.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "11,12",
            "10,11",
            "9,10",
            "5,6",
            "1,2",
            "0,1",
    })
    public void levelUpOfSound(int levelOfSoundAtThisMoment, int expected) {
        Radio radio = new Radio();
        radio.setCurrentLevelOfSound(levelOfSoundAtThisMoment);

        radio.plus();

        int actual = radio.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "10,9",
            "8,7",
            "5,4",
            "1,0",
            "0,0"
    })
    public void levelDownOfSound(int levelOfSoundAtThisMoment, int expected) {
        Radio radio = new Radio();
        radio.setCurrentLevelOfSound(levelOfSoundAtThisMoment);

        radio.minus();

        int actual = radio.getCurrentLevelOfSound();

        Assertions.assertEquals(expected, actual);
    }
}
