public class StringCaseChanger implements StringTransformer{
    private char c;
    @Override
    public void execute(StringDrink drink) {
        StringBuilder stringbuilder = new StringBuilder();
        String txt = drink.getText();
        for(int i= 0; i < txt.length(); i++){
            c = txt.charAt(i);
            if(Character.isLowerCase(c)) c = Character.toUpperCase(c);
            else c = Character.toLowerCase(c);
            stringbuilder.append(c);
        }
        drink.setText(stringbuilder.toString());
    }
}
