import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); 
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a + b + c;

        System.out.println(sum); 
    }
}