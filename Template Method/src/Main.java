import java.util.Scanner;

abstract class Meal {

    /**
     * It provides template method of meal routine.
     */
    public void doMeal() {  
        prepareIngredients();
        cook();
        eat();
        cleanUp();
    }

    public abstract void prepareIngredients();
    public abstract void cook();

    public void eat() {
        System.out.println("That's good");
    }

    public abstract void cleanUp();
}

class Steak extends Meal {

    @Override
    public void prepareIngredients() {
        System.out.println("Ingredients: beef steak, lemon, olive oil, salt, sugar");
    }

    @Override
    public void cook() {
        System.out.println("Fry the steak in the pan");
    }

    @Override
    public void cleanUp() {
        System.out.println("Push dishes in the sink and go coding");
    }
}

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String author = scanner.nextLine();
        scanner.close();
        Meal meal = new Steak();
        System.out.println(author + " wants to eat");
        System.out.println(author + " decides to cook meal");
        meal.doMeal();
    }
}