import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int year = scanner.nextInt();
        int[] days = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        System.out.println(LocalDate.ofYearDay(year, days[0]));
        System.out.println(LocalDate.ofYearDay(year, days[1]));
        System.out.println(LocalDate.ofYearDay(year, days[2]));
    }
}