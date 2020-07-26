import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringWithHTMLTags = scanner.nextLine();

        // write your code here
        System.out.println(stringWithHTMLTags.replaceAll("<[\\w\\s\"='-/]+>", ""));
    }
}