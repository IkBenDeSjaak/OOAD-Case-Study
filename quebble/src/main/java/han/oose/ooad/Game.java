package han.oose.ooad;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Database database = new Database();
    private List<Speler> spelers = database.getSpelers();
    private List<Quiz> quizzen = database.getQuizzen();

    public void speelQuiz(String gebruikersnaam) {
        //TODO selecteer een quiz die de speler nog niet heeft gespeeld

        Speler speler = getSpeler(gebruikersnaam);
        speler.verminderCredits(20);
        speler.nieuweQuiz(quizzen.get(0));
    }

    public Speler getSpeler(String spelernaam) {
        for(Speler speler : spelers) {
            if(spelernaam.equals(speler.getGebruikersnaam())) {
                return speler;
            }
        }
        return null;
    }
}
