package han.oose.ooad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UitvoeringQuiz {
    private Quiz quiz;
    private Tijd beginTijd;
    private Tijd eindTijd;
    private Woord woord;
    private IScoreStrategy puntenStrategy = new NormalePuntentellingStrategy();
    private List<GegevenAntwoord> gegevenAntwoorden = new ArrayList<>();
    private List<String> gekregenLetters = new ArrayList<>();

    public UitvoeringQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public void speelQuiz() {
        beginTijd = new Tijd();

        for (int i = 0; i < 3; i++) {
            quiz.displayVraag(i);
            Scanner scanner = new Scanner(System.in);
            String antwoord = scanner.nextLine();
            GegevenAntwoord gegevenAntwoord = new GegevenAntwoord(antwoord, quiz.getVraag(i));
            gegevenAntwoorden.add(gegevenAntwoord);
        }

        getLettersGoedeAntwoorden();
        displayGekregenLetters();
        displayVormWoordMessage();

        Scanner scanner = new Scanner(System.in);
        woord = new Woord(scanner.nextLine());

        eindTijd = new Tijd();
        int speeltijd = eindTijd.getDurationInSeconds(beginTijd);

        int woordLengte = 0;
        if (woord.checkWoord(gekregenLetters)) {
            woordLengte = woord.getLength();
        }

        int aantalGoedeVragen = controleerAantalGoedeVragen();

        int totaleScore = puntenStrategy.berekenScore(aantalGoedeVragen, woordLengte, speeltijd);
        displayBehaaldeScore(totaleScore);
    }

    private int controleerAantalGoedeVragen() {
        int aantalGoed = 0;
        for (GegevenAntwoord antwoord : gegevenAntwoorden) {
            if (antwoord.isAntwoordCorrect()) {
                aantalGoed++;
            }
        }
        return aantalGoed;
    }

    private void getLettersGoedeAntwoorden() {
        for (GegevenAntwoord antwoord : gegevenAntwoorden) {
            if (antwoord.isAntwoordCorrect()) {
                String letter = antwoord.getLetter();
                gekregenLetters.add(letter);
            }
        }
    }

    public int getQuizNummer() {
        return quiz.getNummer();
    }

    private void displayGekregenLetters() {
        System.out.println("Gekregen letters: " + gekregenLetters);
    }

    private void displayVormWoordMessage() {
        System.out.println("Vorm een woord met de verkregen letters.");
    }

    private void displayBehaaldeScore(int score) {
        System.out.print("Je hebt de volgende score behaald: " + score);
    }

}
