import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        LocalDate date1 = LocalDate.of(year, month, 1);
        LocalDate date2 = date1.plusDays(date1.lengthOfMonth() - 1);
        System.out.println(date1 + " " + date2);
    }
}