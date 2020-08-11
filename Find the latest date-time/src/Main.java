import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = Integer.parseInt(scanner.nextLine());
        LocalDateTime[] ldts = new LocalDateTime[n];
        for (int i = 0; i < n; i++) {
            ldts[i] = LocalDateTime.parse(scanner.nextLine());
        }
        if (n <= 0) {
            System.out.println("No Data!");
            return;
        } else if (n == 1) {
            System.out.println(ldts[0]);
            return;
        }
        LocalDateTime max = ldts[0];
        for (LocalDateTime moment : ldts) {
            max = max.compareTo(moment) > 0 ? max : moment;
        }
        System.out.println(max);

    }
}
