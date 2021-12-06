import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    private List<Wants> wantsList;
    private boolean happyHour;

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        Wants wants = new Wants(drink, recipe, bar);
        wantsList.add(wants);
        if(happyHour) bar.order(drink, recipe);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        happyHour = true;
        for (Wants wants: wantsList){
            wants.getBar().order(wants.drink, wants.getRecipe());
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        happyHour = false;
    }
}
