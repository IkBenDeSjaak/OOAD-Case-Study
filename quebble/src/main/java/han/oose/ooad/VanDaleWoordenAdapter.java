package han.oose.ooad;

public class VanDaleWoordenAdapter implements IWoordenAdapter{
    VanDaleLibrary vanDaleLibrary = new VanDaleLibrary();

    @Override
    public boolean isGeldigWoord(String woord) {
        return vanDaleLibrary.controleerWoord(woord);
    }
}
