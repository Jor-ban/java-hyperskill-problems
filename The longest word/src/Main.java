import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");
        int longestLength = -1;
        int index = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestLength) {
                longestLength = words[i].length();
                index = i;
            }
        }
        System.out.println(words[index]);
    }
}