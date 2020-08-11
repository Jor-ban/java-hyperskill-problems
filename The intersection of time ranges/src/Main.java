import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String[] inp1 = scanner.nextLine().split(" ");
        String[] inp2 = scanner.nextLine().split(" ");
        LocalTime[] interval1 = {LocalTime.parse(inp1[0]), LocalTime.parse(inp1[1])};
        LocalTime[] interval2 = {LocalTime.parse(inp2[0]), LocalTime.parse(inp2[1])};
        System.out.println(!(interval1[0].compareTo(interval2[0]) > 0 && interval1[0].compareTo(interval2[1]) > 0)
                && !(interval1[1].compareTo(interval2[0]) < 0 && interval1[1].compareTo(interval2[1]) < 0));
    }
}