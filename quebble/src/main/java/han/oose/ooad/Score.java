package han.oose.ooad;

import java.time.Duration;

public class Score {
    private int score = 0;

    public void berekenScore(int aantalGoedeVragen, int lengteWoord, Duration quiztijd) {
        score = 1;
    }

    public int getScore() {
        return score;
    }
}
