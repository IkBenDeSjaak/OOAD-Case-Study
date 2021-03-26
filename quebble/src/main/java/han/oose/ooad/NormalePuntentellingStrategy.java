package han.oose.ooad;

public class NormalePuntentellingStrategy implements IScoreStrategy{
    @Override
    public int berekenScore(int aantalGoedeVragen, int lengteWoord, int quiztijd) {

        int score = aantalGoedeVragen + lengteWoord + (Math.round(quiztijd / 8));

        return score;
    }
}
