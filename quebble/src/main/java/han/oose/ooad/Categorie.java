package han.oose.ooad;

public class Categorie {
    private String naam;

    public Categorie(String naam) {
        this.naam = naam;
    }

    public void printCategorie() {
        System.out.println("Categorie: " + naam);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }
}
