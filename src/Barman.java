import java.util.*;

public class Barman {

    public Drink createDrink(Scanner sc) {
        boolean error = true;
        while (error) {
            try {
                System.out.println("Podaj ilość skłądników:");
                int numberOfIngredients = sc.nextInt();
                sc.nextLine();
                List<Ingredient> ingredientList = new ArrayList<>();
                for (int i = 0; i < numberOfIngredients; i++) {
                    System.out.println("Podaj nazwę składnika:");
                    String ingredient = sc.nextLine();
                    System.out.println("Podaj ilość składnika: ");
                    double ammount = sc.nextDouble();
                    sc.nextLine();
                    ingredientList.add(new Ingredient(ingredient, ammount));
                }

                return new Drink(ingredientList);
            } catch (InputMismatchException e) {
                System.out.println("Wpisano niepoprawną odpowiedź, postępuj zgodnie z instukcją pytań.");
                sc.nextLine();
            }
        }
        return null;
    }

    public void printDrink(Drink drink) {
        System.out.println("Drink składa się z " + drink.getIngredientList().size() + " składników:");
        drink.getIngredientList().forEach(x -> System.out.println(" -" + x.getName() + " (" + x.getAmount() + ")"));
    }
}
