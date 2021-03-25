package han.oose.ooad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Woord {
    private String woord;

    public Woord(String woord) {
        this.woord = woord;
    }

    public boolean bestaatWoord() {
        //TODO LAAT CONTROLEREN DOOR LIBRARY
        return true;
    }

    public boolean isWoordMetGekregenLetters(List<String> gekregenletters) {
        String[] woordAsArray = woord.split("");
        List<String> woordLettersList = Arrays.asList(woordAsArray);

        boolean metGekregenLetters = true;

        for(String letterUitWoord : woordLettersList) {
            if(!gekregenletters.contains(letterUitWoord)) {
                metGekregenLetters = false;
            }
        }

        return metGekregenLetters;
    }

    public boolean isWoordCorrecteLengte(List<String> gekregenletters) {
        if(getLength() == gekregenletters.size()) {
            return true;
        } else {
            return false;
        }
    }

    public int getLength() {
        return woord.length();
    }
}