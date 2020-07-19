import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        double percent = scanner.nextDouble();
        double upto = scanner.nextDouble();
        int time = 0;
        while (money < upto) {
            money += money * percent / 100;
            time++;
        }
        System.out.println(time);
    }
}
