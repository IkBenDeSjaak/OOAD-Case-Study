package han.oose.ooad;

import java.time.Duration;

public class NormalePuntentellingStrategy implements IScoreStrategy{
    @Override
    public int berekenScore(int aantalGoedeVragen, int lengteWoord, Duration quiztijd) {
        return 1;
    }
}
