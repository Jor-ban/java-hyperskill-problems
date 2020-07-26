import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine().toLowerCase();
        String line = scanner.nextLine().toLowerCase();

        // write your code here
        Pattern pattern = Pattern.compile("(\\b\\w+" + part + "\\b|\\b" + part + "\\w+\\b|\\b" + part + "\\b)");
        Matcher matcher = pattern.matcher(line);

        System.out.println(matcher.find() ? "YES" : "NO");
    }
}