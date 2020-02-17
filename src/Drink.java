import java.util.ArrayList;
import java.util.List;

public class Drink {
    List<Ingredient> ingredientList = new ArrayList<>();

    public Drink(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }
}
