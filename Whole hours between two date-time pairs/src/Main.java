import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        LocalDateTime ldt1 = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime ldt2 = LocalDateTime.parse(scanner.nextLine());
        long hours = ChronoUnit.HOURS.between(ldt1, ldt2);
        System.out.println(hours);
    }
}