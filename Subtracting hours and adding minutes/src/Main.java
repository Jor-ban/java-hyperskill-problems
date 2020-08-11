import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        LocalDateTime ldt = LocalDateTime.parse(scanner.nextLine());
        ldt = ldt.minusHours(scanner.nextInt()).plusMinutes(scanner.nextInt());
        System.out.println(ldt);
    }
}