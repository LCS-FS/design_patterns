import java.util.ArrayList;
import java.util.List;

abstract class Bar{
    public Bar(){
        observers = new ArrayList<>();
    }
    private boolean happyHour = false;

    public boolean isHappyHour() {
        return happyHour;
    };
    public void startHappyHour() {
        notifyObservers();
        happyHour = true;
    };
    public void endHappyHour() {
        notifyObservers();
        happyHour = false;
    };

    private List<BarObserver> observers;

    public void addObserver(BarObserver observer){
        observers.add(observer);
    }
    public void removeObserver(BarObserver observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        for(BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}
