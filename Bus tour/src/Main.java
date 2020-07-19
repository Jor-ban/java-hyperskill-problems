import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int amount = scanner.nextInt();
        boolean isCrashed = false;
        for (int i = 1; i <= amount; i++) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + i);
                isCrashed = true;
                break;
            }
        }
        if(!isCrashed)
            System.out.println("Will not crash");
    }
}