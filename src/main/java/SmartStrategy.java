import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    private ArrayList<Wants> wantsList = new ArrayList<Wants>();
    private boolean happyHour;

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        Wants wants = new Wants(drink, recipe, bar);
        wantsList.add(wants);

        for (Wants want : wantsList) {
            if(want.getBar().isHappyHour()) want.getBar().order(want.drink, want.getRecipe());
        }

    }

    public boolean getHappyhour(){
        return happyHour;
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for (Wants want : wantsList) {
            if(want.getBar().isHappyHour()) want.getBar().order(want.drink, want.getRecipe());
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        happyHour = false;
    }
}
