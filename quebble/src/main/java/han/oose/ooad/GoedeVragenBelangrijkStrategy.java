package han.oose.ooad;

public class GoedeVragenBelangrijkStrategy implements IScoreStrategy {
    @Override
    public int berekenScore(int aantalGoedeVragen, int lengteWoord, int quiztijd) {
        int score = (aantalGoedeVragen * 2) + lengteWoord;

        return score;
    }
}
