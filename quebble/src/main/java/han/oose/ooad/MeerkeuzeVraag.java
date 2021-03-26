package han.oose.ooad;

import java.util.List;

public class MeerkeuzeVraag extends Vraag {
    private List<MeerkeuzeVraagAntwoord> antwoorden;

    public MeerkeuzeVraag(String vraag, String teVerdienenLetter, Categorie categorie) {
        super(vraag, teVerdienenLetter, categorie);
    }

    @Override
    public void displayVraag() {
        categorie.printCategorie();
        System.out.println(vraag);
        for(MeerkeuzeVraagAntwoord antwoord : antwoorden) {
            antwoord.displayAntwoord();
        }
    }

    @Override
    public boolean isGegevenAntwoordCorrect(String gegevenAntwoord) {
        boolean isCorrect = false;
        for(MeerkeuzeVraagAntwoord antwoord : antwoorden) {
            if(antwoord.isGegevenAntwoordCorrect(gegevenAntwoord)) {
                isCorrect = true;
            }
        }
        return isCorrect;
    }

    public void setAntwoorden(List<MeerkeuzeVraagAntwoord> antwoorden) {
        this.antwoorden = antwoorden;
    }
}
