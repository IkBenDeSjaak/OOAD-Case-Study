package han.oose.ooad;

public class KortAntwoordVraagAntwoord extends Antwoord {

    public KortAntwoordVraagAntwoord(String antwoord) {
        super(antwoord);
    }

    public boolean isGegevenAntwoordCorrect(String gegevenAntwoord) {
        if(gegevenAntwoord.equals(antwoord)) {
            return true;
        } else {
            return false;
        }
    }
}
