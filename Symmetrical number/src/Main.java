import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        boolean isSymmetric = true;
        String s = input.nextLine();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isSymmetric = false;
            }
        }
        System.out.println(isSymmetric ? 1 : 37);
    }
}
