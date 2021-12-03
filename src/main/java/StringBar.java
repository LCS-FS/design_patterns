public class StringBar extends Bar{
    private boolean happyHour;

    @Override
    boolean isHappyHour() {
        return happyHour;
    }

    @Override
    public void startHappyHour() {
        happyHour = true;
    }

    @Override
    public void endHappyHour() {
        happyHour = false;
    }
}
