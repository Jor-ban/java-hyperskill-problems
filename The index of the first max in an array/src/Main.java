import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[scanner.nextInt()];
        int maxValueIndex = 0;
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
            if (ints[i] > ints[maxValueIndex]) {
                maxValueIndex = i;
            }
        }
        System.out.println(maxValueIndex);
    }
}