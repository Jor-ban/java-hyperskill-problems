import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codeWithComments = scanner.nextLine();

        // write your code here
//        int b = 0;/* expression */ b = b /* **/* b /* b * b = b squared */; // 0 * 0 = 0
        String change = "(/\\*[^*]*[^/]*\\*/)|(//.*)";
        System.out.println(codeWithComments.replaceAll(change, ""));
    }
}