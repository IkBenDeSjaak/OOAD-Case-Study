package han.oose.ooad;

public class GroeneBoekjeWoordenAdapter implements IWoordenAdapter{
    GroeneBoekjeLibrary groeneBoekjeLibrary;
    @Override
    public boolean isGeldigWoord(String woord) {
        return groeneBoekjeLibrary.zitInWoordenlijst(woord);
    }
}
