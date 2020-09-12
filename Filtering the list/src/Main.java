import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.asList(scanner.nextLine().split("\\s"));
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(i % 2 == 0 ? " " : list.get(i));
        }
    }
}