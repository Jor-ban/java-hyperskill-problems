import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.length() % 2 == 0 && (i == s.length() / 2 || i == s.length() / 2 - 1)) {
                continue;
            } else if (i == Math.round(s.length() / 2)) {
                continue;
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}