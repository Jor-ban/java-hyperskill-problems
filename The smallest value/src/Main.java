import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        BigInteger num = new BigInteger(scanner.nextLine());
        int largest = 1;
        BigInteger fact = factorial(largest);
        while (num.compareTo(fact) > 0) {
            fact = factorial(++largest);
        }
        System.out.println(largest);
    }
}