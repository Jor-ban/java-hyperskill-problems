import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        num -= num % 10;
        System.out.println(num % 100 / 10);
    }
}