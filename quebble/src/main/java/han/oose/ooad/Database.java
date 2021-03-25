package han.oose.ooad;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Quiz> quizzen = new ArrayList<>();
    private List<Speler> spelers = new ArrayList<>();

    public Database() {
        generateQuizzen();
        generateSpelers();
    }

    public void generateQuizzen() {
        List<Vraag> vragenQuiz1 = new ArrayList<>();

        //VRAAG 1
        MeerkeuzeVraag vraag1quiz1 = new MeerkeuzeVraag("Welk land heeft een rode vlag met witte wassenaar en ster?", "A");
        MeerkeuzeVraagAntwoord vraag1quiz1antwoord1 = new MeerkeuzeVraagAntwoord(true,"Turkije", "A");
        MeerkeuzeVraagAntwoord vraag1quiz1antwoord2 = new MeerkeuzeVraagAntwoord(false,"Roemenië", "B");
        MeerkeuzeVraagAntwoord vraag1quiz1antwoord3 = new MeerkeuzeVraagAntwoord(false,"Nederland", "C");
        MeerkeuzeVraagAntwoord vraag1quiz1antwoord4 = new MeerkeuzeVraagAntwoord(false,"Turkmenistan", "D");

        List<MeerkeuzeVraagAntwoord> vraag1quiz1antwoorden = new ArrayList<>();
        vraag1quiz1antwoorden.add(vraag1quiz1antwoord1);
        vraag1quiz1antwoorden.add(vraag1quiz1antwoord2);
        vraag1quiz1antwoorden.add(vraag1quiz1antwoord3);
        vraag1quiz1antwoorden.add(vraag1quiz1antwoord4);

        vraag1quiz1.setAntwoorden(vraag1quiz1antwoorden);
        vragenQuiz1.add(vraag1quiz1);

        //VRAAG 2
        MeerkeuzeVraag vraag2quiz1 = new MeerkeuzeVraag("Hoe heet het meest zuidelijke land van Afrika?", "T");
        MeerkeuzeVraagAntwoord vraag2quiz1antwoord1 = new MeerkeuzeVraagAntwoord(false,"Noord-Afrika", "A");
        MeerkeuzeVraagAntwoord vraag2quiz1antwoord2 = new MeerkeuzeVraagAntwoord(false,"Nigeria", "B");
        MeerkeuzeVraagAntwoord vraag2quiz1antwoord3 = new MeerkeuzeVraagAntwoord(false,"Nederland", "C");
        MeerkeuzeVraagAntwoord vraag2quiz1antwoord4 = new MeerkeuzeVraagAntwoord(true,"Zuid-Afrika", "D");

        List<MeerkeuzeVraagAntwoord> vraag2quiz1antwoorden = new ArrayList<>();
        vraag2quiz1antwoorden.add(vraag2quiz1antwoord1);
        vraag2quiz1antwoorden.add(vraag2quiz1antwoord2);
        vraag2quiz1antwoorden.add(vraag2quiz1antwoord3);
        vraag2quiz1antwoorden.add(vraag2quiz1antwoord4);

        vraag2quiz1.setAntwoorden(vraag2quiz1antwoorden);
        vragenQuiz1.add(vraag2quiz1);

        //VRAAG 3
        KortAntwoordVraag vraag3quiz1 = new KortAntwoordVraag("Van welk land is het Klavertje Vier het symbool?", "R");
        KortAntwoordVraagAntwoord vraag3quiz1antwoord1 = new KortAntwoordVraagAntwoord("Ierland");
        KortAntwoordVraagAntwoord vraag3quiz1antwoord2 = new KortAntwoordVraagAntwoord("Ireland");

        List<KortAntwoordVraagAntwoord> vraag3quiz1antwoorden = new ArrayList<>();
        vraag3quiz1antwoorden.add(vraag3quiz1antwoord1);
        vraag3quiz1antwoorden.add(vraag3quiz1antwoord2);

        vraag3quiz1.setAntwoorden(vraag3quiz1antwoorden);
        vragenQuiz1.add(vraag3quiz1);

        Quiz quiz1 = new Quiz(1, vragenQuiz1);

        quizzen.add(quiz1);
    }

    public void generateSpelers() {
        Speler speler1 = new Speler("patrick", "patpat");
        Speler speler2 = new Speler("Sjaak", "sjaak123");

        spelers.add(speler1);
        spelers.add(speler2);
    }

    public List<Speler> getSpelers() {
        return spelers;
    }

    public List<Quiz> getQuizzen() {
        return quizzen;
    }
}
