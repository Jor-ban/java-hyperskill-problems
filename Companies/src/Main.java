import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var list = new ArrayList<String>();
        while (scanner.hasNext()) {
            list.add(scanner.next());
        }
        System.out.println(list);
    }
}