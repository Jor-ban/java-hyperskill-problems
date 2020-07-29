import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // write your code here
        boolean isPasswrdFound = false;
        Matcher matcher = Pattern.compile("password[:-]?\\s*\\w+", Pattern.CASE_INSENSITIVE)
                .matcher(text);
        while (matcher.find()) {
            isPasswrdFound = true;
            String password = matcher.group().split("[:\\s]+")[1];
            System.out.println(password);
        }
        if (!isPasswrdFound) {
            System.out.println("No passwords found.");
        }
    }
}