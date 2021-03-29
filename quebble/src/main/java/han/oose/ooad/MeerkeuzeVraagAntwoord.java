package han.oose.ooad;

public class MeerkeuzeVraagAntwoord extends Antwoord {
    private String option;
    private boolean isCorrect;

    public MeerkeuzeVraagAntwoord(boolean isCorrect, String antwoord, String option) {
        super(antwoord);
        this.isCorrect = isCorrect;
        this.option = option;
    }

    public void displayAntwoord() {
        System.out.println(option + ": " + antwoord);
    }

    public boolean isGegevenAntwoordCorrect(String gegevenAntwoord) {
        if(option.equals(gegevenAntwoord) && isCorrect) {
            return true;
        } else {
            return false;
        }
    }
}
