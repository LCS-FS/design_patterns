public class StringBar extends Bar{
    private boolean happyHour;

    @Override
    public boolean isHappyHour() {
        return happyHour;
    }

    @Override
    public void startHappyHour() {
        notifyObservers();
        happyHour = true;
    }

    @Override
    public void endHappyHour() {
        notifyObservers();
        happyHour = false;
    }
}
