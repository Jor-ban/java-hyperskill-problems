import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[scanner.nextInt()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }

        int triples = 0;
        for (int i = 2; i < ints.length; i++) {
            if (ints[i] - ints[i - 1] == 1 && ints[i - 1] - ints[i - 2] == 1) {
                triples++;
            }
        }

        System.out.println(triples);
    }
}