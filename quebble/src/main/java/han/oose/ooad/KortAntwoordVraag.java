package han.oose.ooad;

import java.util.List;

public class KortAntwoordVraag extends Vraag {
    private List<KortAntwoordVraagAntwoord> antwoorden;

    public KortAntwoordVraag(String vraag, String teVerdienenLetter, Categorie categorie) {
        super(vraag, teVerdienenLetter, categorie);
    }

    public void setAntwoorden(List<KortAntwoordVraagAntwoord> antwoorden) {
        this.antwoorden = antwoorden;
    }

    @Override
    public void displayVraag() {
        categorie.printCategorie();
        System.out.println(vraag);
    }

    @Override
    public boolean isGegevenAntwoordCorrect(String gegevenAntwoord) {
        boolean isCorrect = false;
        for(KortAntwoordVraagAntwoord antwoord : antwoorden) {
            if(antwoord.isGegevenAntwoordCorrect(gegevenAntwoord)) {
                isCorrect = true;
            }
        }
        return isCorrect;
    }
}
