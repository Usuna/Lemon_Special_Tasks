package samples.factory;

public class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new ProductDigitalWatch();
    }
}
