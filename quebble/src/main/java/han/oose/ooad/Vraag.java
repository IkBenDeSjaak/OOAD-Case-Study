package han.oose.ooad;

public abstract class Vraag {
    protected String vraag;
    private String teVerdienenLetter;
    protected Categorie categorie;

    public Vraag(String vraag, String teVerdienenLetter, Categorie categorie) {
        this.vraag = vraag;
        this.teVerdienenLetter = teVerdienenLetter;
        this.categorie = categorie;
    }

    public abstract void displayVraag();

    public abstract boolean isGegevenAntwoordCorrect(String gegevenAntwoord);

    public String getLetterVanVraag() {
        return teVerdienenLetter;
    }
}
