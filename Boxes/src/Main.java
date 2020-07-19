import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] box1 = new int[3];
        int[] box2 = new int[3];
        for (int i = 0; i < 3; i++) {
            box1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            box2[i] = scanner.nextInt();
        }
        if (box1[0] * box1[1] * box1[2] > box2[0] * box2[1] * box2[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (box1[0] * box1[1] * box1[2] == box2[0] * box2[1] * box2[2]) {
            System.out.println("Box 1 = Box 2");
        } else {
            System.out.println("Box 1 < Box 2");
        }
    }
}