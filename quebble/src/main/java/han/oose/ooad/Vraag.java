package han.oose.ooad;

public abstract class Vraag {
    protected String vraag;
    private String teVerdienenLetter;

    public Vraag(String vraag, String teVerdienenLetter) {
        this.vraag = vraag;
        this.teVerdienenLetter = teVerdienenLetter;
    }

    public abstract void displayVraag();

    public abstract boolean isGegevenAntwoordCorrect(String gegevenAntwoord);

    public String getLetterVanVraag() {
        return teVerdienenLetter;
    }
}
