import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        LocalDateTime date1 = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime date2 = LocalDateTime.parse(scanner.nextLine());

        if (date1.isAfter(date2)) {
            LocalDateTime date = date1;
            date1 = date2;
            date2 = date;
        }

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        for (int i = 0; i < n; i++) {
            LocalDateTime date = LocalDateTime.parse(scanner.nextLine());
            if (!date.isBefore(date1) && date.isBefore(date2)) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}