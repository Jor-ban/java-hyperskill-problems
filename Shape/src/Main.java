import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int i = scanner.nextInt();
        if (i > 0 && i < 5) {
            System.out.print("You have chosen a ".concat(
                    i == 1 ? "square" :
                    i == 2 ? "circle" :
                    i == 3 ? "triangle" :
                    "rhombus"));
            System.out.println();
        } else {
            System.out.println("There is no such shape!");
        }
    }
}