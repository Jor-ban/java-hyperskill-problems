import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        LocalTime lt1 = LocalTime.parse(scanner.nextLine());
        LocalTime lt2 = LocalTime.parse(scanner.nextLine());
        long secDiff = 3600 * (lt1.getHour() - lt2.getHour());
        secDiff += 60 * (lt1.getMinute() - lt2.getMinute());
        secDiff += lt1.getSecond() - lt2.getSecond();
        System.out.println(secDiff > 0 ? secDiff : -secDiff);
    }
}