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

class Sandwich extends Meal {
    @Override
    public void prepareIngredients() {
        System.out.println("Ingredients: bacon, white bread, egg, cheese, mayonnaise, tomato");
    }

    @Override
    public void cook() {
        System.out.println("Paste ingredients between bread slices. Toast sandwich");
    }

    @Override
    public void cleanUp() {
        System.out.println("Lick fingers and go to sleep");
    }
}

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String order = scanner.nextLine();
        scanner.close();
        Meal meal = null;
        if ("Sandwich".equals(order)) {
            meal = new Sandwich();
            meal.doMeal();
        } else if ("Steak".equals(order)) {
            meal = new Steak();
            meal.doMeal();
        } else {
            System.out.println("Error");
        }
    }
}