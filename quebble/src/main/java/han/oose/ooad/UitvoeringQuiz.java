package han.oose.ooad;

import java.time.Duration;
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

        for(int i = 0; i < 3; i++) {
            quiz.displayVraag(i);
            Scanner scanner = new Scanner(System.in);
            String antwoord = scanner.nextLine();
            GegevenAntwoord gegevenAntwoord = new GegevenAntwoord(antwoord, quiz.getVraag(i));
            gegevenAntwoorden.add(gegevenAntwoord);
        }

        getCorrectLetters();
        displayGekregenLetters();
        displayVormWoordMessage();

        Scanner scanner = new Scanner(System.in);
        woord = new Woord(scanner.nextLine());
        woord.isWoordMetGekregenLetters(gekregenLetters);
        woord.isWoordCorrecteLengte(gekregenLetters);
        woord.isGeldigWoord();

        int woordLengte = woord.getLength();

        int aantalGoedeVragen = controleerAantalGoedeVragen();

        eindTijd = new Tijd();
        Duration speeltijd = eindTijd.getDuration(beginTijd);

        int totaleScore = puntenStrategy.berekenScore(aantalGoedeVragen, woordLengte, speeltijd);

        System.out.println(totaleScore);
    }

    private int controleerAantalGoedeVragen() {
        int aantalGoed = 0;
        for(GegevenAntwoord antwoord : gegevenAntwoorden) {
            if(antwoord.isAntwoordCorrect()) {
                aantalGoed++;
            }
        }
        return aantalGoed;
    }

    private void getCorrectLetters() {
        for(GegevenAntwoord antwoord : gegevenAntwoorden) {
            if(antwoord.isAntwoordCorrect()) {
                String letter = antwoord.getLetter();
                gekregenLetters.add(letter);
            }
        }
    }

    private void displayGekregenLetters() {
        System.out.println("Gekregen letters: " + gekregenLetters);
    }

    private void displayVormWoordMessage() {
        System.out.println("Vorm een woord met de verkregen letters.");
    }

}
