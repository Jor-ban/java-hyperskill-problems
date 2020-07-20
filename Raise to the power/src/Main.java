import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        // write your code here
        long pow = 1;
        for (int time = 0; time < m; time++) {
            pow *= n;
        }
        return pow;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}