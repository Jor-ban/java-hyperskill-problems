import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        LocalTime lt = LocalTime.parse(scanner.nextLine());
        System.out.println(LocalTime.of(lt.getHour(), lt.getMinute()));
    }
}