import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        BigInteger a = new BigInteger(scanner.next());
        BigInteger b = new BigInteger(scanner.next());
        BigInteger c = new BigInteger(scanner.next());
        BigInteger d = new BigInteger(scanner.next());
        System.out.println(a.negate().multiply(b).add(c).subtract(d));
    }
}