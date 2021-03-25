package han.oose.ooad;

public class VanDaleWoordenAdapter implements IWoordenAdapter{
    VanDaleLibrary vanDaleLibrary;

    @Override
    public boolean isGeldigWoord(String woord) {
        return vanDaleLibrary.controleerWoord(woord);
    }
}
