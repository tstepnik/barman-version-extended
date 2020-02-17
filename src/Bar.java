import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Barman barman = new Barman();
        Drink drink = barman.createDrink(sc);
        barman.printDrink(drink);
    }
}
