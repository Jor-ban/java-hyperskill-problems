import java.util.Scanner;

public class Main {

    public static long fib(long n){
        // write your code here
        int prev = 0;
        int next = 1;
        return fibonacciiSequence(prev, next, n);
    }
    public static long fibonacciiSequence(int prev, int next, long upto) {
        if (upto == 0) {
            return prev;
        }
        int sum = prev - next;
        prev = next;
        next = sum;
        return fibonacciiSequence(prev, next, --upto);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}