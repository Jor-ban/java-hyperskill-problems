import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            max = (num % 4 == 0 && max < num) ? num : max;
        }
        System.out.println(max);
    }
}