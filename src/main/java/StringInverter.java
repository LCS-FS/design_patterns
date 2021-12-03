public class StringInverter implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder stringbuilder = new StringBuilder(drink.getText());
        stringbuilder.reverse();
        drink.setText(stringbuilder.toString());
    }
}
