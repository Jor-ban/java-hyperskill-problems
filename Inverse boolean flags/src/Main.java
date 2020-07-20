import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void inverseFlags(boolean[] flags) {
        for (int i = 0; i < flags.length; i++){
            flags[i] = !flags[i];
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        boolean[] flags = new boolean[str.length];
        for (int i = 0; i < str.length; i++){
            flags[i] = str[i].equals("true");
        }
        inverseFlags(flags);
        final String representation = Arrays.toString(flags)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
        System.out.println(representation);
    }
}