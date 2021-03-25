package han.oose.ooad;

public class GegevenAntwoord {
    private String antwoord;
    private Vraag vraag;

    public GegevenAntwoord(String antwoord, Vraag vraag) {
        this.antwoord = antwoord;
        this.vraag = vraag;
    }

    public String getAntwoord() {
        return antwoord;
    }

    public boolean isAntwoordCorrect() {
        return vraag.isGegevenAntwoordCorrect(antwoord);
    }

    public String getLetter() {
        return vraag.getLetterVanVraag();
    }
}