import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        String testPasswrd = scanner.nextLine();
        String regex0 = "\\S*[A-Z]+\\S*";
        String regex1 = "\\S*[a-z]+\\S*";
        String regex2 = "\\S*[0-9]+\\S*";
        boolean match = testPasswrd.matches(regex0) &&
                testPasswrd.matches(regex1) &&
                testPasswrd.matches(regex2) &&
                testPasswrd.length() >= 12;
        System.out.println(match ? "YES" : "NO");
    }
}