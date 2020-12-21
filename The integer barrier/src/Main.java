import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        boolean isExtended1000 = false;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (sum < 1000) {
                sum += num;
            } else {
                isExtended1000 = true;
            }

            if (num == 0) {
                break;
            }
        }
        System.out.println(isExtended1000 ? sum - 1000 : sum);
    }
}