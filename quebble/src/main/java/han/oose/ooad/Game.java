package han.oose.ooad;

import java.util.List;

public class Game {
    private Database database = new Database();
    private List<Speler> spelers = database.getSpelers();
    private List<Quiz> quizzen = database.getQuizzen();

    public void speelQuiz(String gebruikersnaam) {
        Speler speler = getSpeler(gebruikersnaam);
        speler.verminderCredits(20);
        speler.nieuweQuiz(selecteerQuiz(speler));
    }

    public Speler getSpeler(String spelernaam) {
        for(Speler speler : spelers) {
            if(spelernaam.equals(speler.getGebruikersnaam())) {
                return speler;
            }
        }
        return null;
    }

    public Quiz selecteerQuiz(Speler speler) {
        List<Integer> gespeeldeQuizNummers = speler.getNummersGespeeldeQuizzen();

        for(Quiz quiz : quizzen) {
            if(!gespeeldeQuizNummers.contains(quiz.getNummer())) {
                return quiz;
            }
        }

        return quizzen.get(0);
    }

}
