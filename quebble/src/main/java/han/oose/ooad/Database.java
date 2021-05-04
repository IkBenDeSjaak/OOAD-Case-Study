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
        Categorie geography = new Categorie("Geografie");
        Categorie sport = new Categorie("Sport");

        List<Vraag> vragenQuiz1 = new ArrayList<>();

        //VRAAG 1
        MeerkeuzeVraag vraag1quiz1 = new MeerkeuzeVraag("Welk land heeft een rode vlag met witte wassenaar en ster?", "A", geography);
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
        MeerkeuzeVraag vraag2quiz1 = new MeerkeuzeVraag("Hoe heet het meest zuidelijke land van Afrika?", "T", geography);
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
        KortAntwoordVraag vraag3quiz1 = new KortAntwoordVraag("Van welk land is het Klavertje Vier het symbool?", "R", geography);
        KortAntwoordVraagAntwoord vraag3quiz1antwoord1 = new KortAntwoordVraagAntwoord("Ierland");
        KortAntwoordVraagAntwoord vraag3quiz1antwoord2 = new KortAntwoordVraagAntwoord("Ireland");

        List<KortAntwoordVraagAntwoord> vraag3quiz1antwoorden = new ArrayList<>();
        vraag3quiz1antwoorden.add(vraag3quiz1antwoord1);
        vraag3quiz1antwoorden.add(vraag3quiz1antwoord2);

        vraag3quiz1.setAntwoorden(vraag3quiz1antwoorden);
        vragenQuiz1.add(vraag3quiz1);

        //VRAAG 4
        KortAntwoordVraag vraag4quiz1 = new KortAntwoordVraag("Uit welke stad komt de voetbalclub Ajax?", "P", sport);
        KortAntwoordVraagAntwoord vraag4quiz1antwoord1 = new KortAntwoordVraagAntwoord("Amsterdam");

        List<KortAntwoordVraagAntwoord> vraag4quiz1antwoorden = new ArrayList<>();
        vraag4quiz1antwoorden.add(vraag4quiz1antwoord1);

        vraag4quiz1.setAntwoorden(vraag4quiz1antwoorden);
        vragenQuiz1.add(vraag4quiz1);

        //VRAAG 5
        KortAntwoordVraag vraag5quiz1 = new KortAntwoordVraag("Met hoeveel ballen wordt biljart gespeeld?", "F", sport);
        KortAntwoordVraagAntwoord vraag5quiz1antwoord1 = new KortAntwoordVraagAntwoord("3");
        KortAntwoordVraagAntwoord vraag5quiz1antwoord2 = new KortAntwoordVraagAntwoord("drie");

        List<KortAntwoordVraagAntwoord> vraag5quiz1antwoorden = new ArrayList<>();
        vraag5quiz1antwoorden.add(vraag5quiz1antwoord1);
        vraag5quiz1antwoorden.add(vraag5quiz1antwoord2);

        vraag5quiz1.setAntwoorden(vraag5quiz1antwoorden);
        vragenQuiz1.add(vraag5quiz1);

        //VRAAG 6
        KortAntwoordVraag vraag6quiz1 = new KortAntwoordVraag("In welke stad staat de Sagrada Familia?", "S", geography);
        KortAntwoordVraagAntwoord vraag6quiz1antwoord1 = new KortAntwoordVraagAntwoord("Barcelona");

        List<KortAntwoordVraagAntwoord> vraag6quiz1antwoorden = new ArrayList<>();
        vraag6quiz1antwoorden.add(vraag6quiz1antwoord1);

        vraag6quiz1.setAntwoorden(vraag6quiz1antwoorden);
        vragenQuiz1.add(vraag6quiz1);

        //VRAAG 7
        KortAntwoordVraag vraag7quiz1 = new KortAntwoordVraag("Welk land ligt tussen Frankrijk en Spanje?", "E", geography);
        KortAntwoordVraagAntwoord vraag7quiz1antwoord1 = new KortAntwoordVraagAntwoord("Andorra");

        List<KortAntwoordVraagAntwoord> vraag7quiz1antwoorden = new ArrayList<>();
        vraag7quiz1antwoorden.add(vraag7quiz1antwoord1);

        vraag7quiz1.setAntwoorden(vraag7quiz1antwoorden);
        vragenQuiz1.add(vraag7quiz1);

        //VRAAG 8
        MeerkeuzeVraag vraag8quiz1 = new MeerkeuzeVraag("Hoe lang duurt een voetbalwedstrijd?", "O", sport);
        MeerkeuzeVraagAntwoord vraag8quiz1antwoord1 = new MeerkeuzeVraagAntwoord(false,"60 minuten", "A");
        MeerkeuzeVraagAntwoord vraag8quiz1antwoord2 = new MeerkeuzeVraagAntwoord(false,"45 minuten", "B");
        MeerkeuzeVraagAntwoord vraag8quiz1antwoord3 = new MeerkeuzeVraagAntwoord(true,"90 minuten", "C");
        MeerkeuzeVraagAntwoord vraag8quiz1antwoord4 = new MeerkeuzeVraagAntwoord(false,"120 minuten", "D");

        List<MeerkeuzeVraagAntwoord> vraag8quiz1antwoorden = new ArrayList<>();
        vraag8quiz1antwoorden.add(vraag8quiz1antwoord1);
        vraag8quiz1antwoorden.add(vraag8quiz1antwoord2);
        vraag8quiz1antwoorden.add(vraag8quiz1antwoord3);
        vraag8quiz1antwoorden.add(vraag8quiz1antwoord4);

        vraag8quiz1.setAntwoorden(vraag8quiz1antwoorden);
        vragenQuiz1.add(vraag8quiz1);

        Quiz quiz1 = new Quiz(1, vragenQuiz1);

        quizzen.add(quiz1);
    }

    public void generateSpelers() {
        Speler speler1 = new Speler("patrick", "patpat", 1000);
        Speler speler2 = new Speler("Sjaak", "sjaak123", 1000);

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
