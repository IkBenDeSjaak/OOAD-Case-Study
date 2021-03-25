package han.oose.ooad;

import java.util.List;

public class Quiz {
    private int nummer;
    private List<Vraag> vragen;

    public Quiz(int nummer, List<Vraag> vragen) {
        this.nummer = nummer;
        this.vragen = vragen;
    }

    public Vraag getVraag(int vraagnummer) {
        return vragen.get(vraagnummer);
    }

    public void displayVraag(int vraagnummer) {
        vragen.get(vraagnummer).displayVraag();
    }
}
