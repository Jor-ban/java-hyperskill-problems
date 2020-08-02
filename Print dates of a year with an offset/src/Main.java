import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        LocalDate date = LocalDate.parse(scanner.nextLine());
        int days = scanner.nextInt();
        int initYear = date.getYear();
        while (date.getYear() == initYear) {
            System.out.println(date);
            date = date.plusDays(days);
        }
    }
}