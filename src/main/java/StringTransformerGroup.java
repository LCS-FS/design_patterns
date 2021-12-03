import javax.xml.transform.Transformer;
import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> list;
    public StringTransformerGroup(List<StringTransformer> list){
        this.list = list;
    }
    @Override
    public void execute(StringDrink drink) {
        StringRecipe recipe = new StringRecipe(list);
        recipe.mix(drink);
    }

    public void setList(List<StringTransformer> list){
        this.list = list;
    }
    public List<StringTransformer> getList(){
        return list;
    }
    public void add(StringTransformer st){
        list.add(st);
    }
    public void remove(StringTransformer st){
        list.remove(st);
    }
}
