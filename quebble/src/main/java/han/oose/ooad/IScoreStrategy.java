package han.oose.ooad;

import java.time.Duration;

public interface IScoreStrategy {

    public int berekenScore(int aantalGoedeVragen, int lengteWoord, Duration quiztijd);
}
