package han.oose.ooad;

import java.util.ArrayList;
import java.util.List;

public class Speler {
    private int credits = 1000;
    private String gebruikersnaam;
    private String wachtwoord;
    private List<UitvoeringQuiz> gespeeldeQuizzen = new ArrayList<>();

    public Speler(String gebruikersnaam, String wachtwoord) {
        this.gebruikersnaam = gebruikersnaam;
        this.wachtwoord = wachtwoord;
    }

    public void nieuweQuiz(Quiz quiz) {
        UitvoeringQuiz nieuweQuiz = new UitvoeringQuiz(quiz);
        gespeeldeQuizzen.add(nieuweQuiz);
        nieuweQuiz.speelQuiz();
    }

    public List<Integer> getNummersGespeeldeQuizzen() {
        List<Integer> gespeeldeQuizNummers = new ArrayList<>();

        for(UitvoeringQuiz uitvoeringQuiz : gespeeldeQuizzen) {
            gespeeldeQuizNummers.add(uitvoeringQuiz.getQuizNummer());
        }

        return gespeeldeQuizNummers;
    }

    public void verminderCredits(int amount) {
        credits -= amount;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public List<UitvoeringQuiz> getGespeeldeQuizzen() {
        return gespeeldeQuizzen;
    }

    public void setGespeeldeQuizzen(List<UitvoeringQuiz> gespeeldeQuizzen) {
        this.gespeeldeQuizzen = gespeeldeQuizzen;
    }
}
