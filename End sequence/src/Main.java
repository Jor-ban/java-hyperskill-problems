import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String regex = "[A-Za-z]{2}yz";

        // no need to change code below 
        for (String word : line.split(" ")) {
            if (word.matches(regex)) {
                System.out.println(word);
            }
        }
    }
}