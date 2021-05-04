package han.oose.ooad;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UitvoeringQuiz {
    private Quiz quiz;
    private LocalDateTime beginTijd;
    private LocalDateTime eindTijd;
    private Woord woord;
    private int score;
    private IScoreStrategy puntenStrategy = new NormalePuntentellingStrategy();
    private List<GegevenAntwoord> gegevenAntwoorden = new ArrayList<>();
    private List<GegevenAntwoord> goedeAntwoorden = new ArrayList<>();
    private List<String> gekregenLetters = new ArrayList<>();

    public UitvoeringQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public void speelQuiz() {
        beginTijd = getHuidigeTijd();

        for (int i = 0; i < 8; i++) {
            quiz.displayVraag(i);
            Scanner scanner = new Scanner(System.in);
            String antwoord = scanner.nextLine();
            GegevenAntwoord gegevenAntwoord = new GegevenAntwoord(antwoord, quiz.getVraag(i));
            gegevenAntwoorden.add(gegevenAntwoord);
        }

        controleerGoedeAntwoorden();
        getLettersGoedeAntwoorden();
        displayGekregenLetters();
        displayVormWoordMessage();

        Scanner scanner = new Scanner(System.in);
        woord = new Woord(scanner.nextLine());

        eindTijd = getHuidigeTijd();
        int speeltijd = getGespeeldeTijdInSecondes();

        int woordLengte = 0;
        if (woord.checkWoord(gekregenLetters)) {
            woordLengte = woord.getLength();
        }

        int aantalGoedeVragen = getAantalGoedeVragen();

        score = puntenStrategy.berekenScore(aantalGoedeVragen, woordLengte, speeltijd);

        displayBehaaldeScore(score);
    }

    private void controleerGoedeAntwoorden() {
        for (GegevenAntwoord antwoord : gegevenAntwoorden) {
            if (antwoord.isAntwoordCorrect()) {
                goedeAntwoorden.add(antwoord);
            }
        }
    }

    private int getAantalGoedeVragen() {
        return goedeAntwoorden.size();
    }

    private void getLettersGoedeAntwoorden() {
        for (GegevenAntwoord antwoord : goedeAntwoorden) {
            String letter = antwoord.getLetter();
            gekregenLetters.add(letter);
        }
    }

    private int getGespeeldeTijdInSecondes() {
        Duration speeltijd = Duration.between(beginTijd, eindTijd);

        int speeltijdInSecondes = (int) speeltijd.getSeconds();

        return speeltijdInSecondes;
    }

    private LocalDateTime getHuidigeTijd() {
        return LocalDateTime.now();
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
