package han.oose.ooad;

public class GroeneBoekjeWoordenAdapter implements IWoordenAdapter{
    GroeneBoekjeLibrary groeneBoekjeLibrary = new GroeneBoekjeLibrary();

    @Override
    public boolean isGeldigWoord(String woord) {
        return groeneBoekjeLibrary.zitInWoordenlijst(woord);
    }
}
