package han.oose.ooad;

import java.time.Duration;

public class GoedeVragenBelangrijkStrategy implements IScoreStrategy{
    @Override
    public int berekenScore(int aantalGoedeVragen, int lengteWoord, Duration quiztijd) {
        return 10;
    }
}
