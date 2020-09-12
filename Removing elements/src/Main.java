import java.util.*;

class SetUtils {

    public static Set getSetFromString(String str) {
        var set = new TreeSet<Integer>();
        for(String num : str.split("\\s")) {
            set.add(Integer.parseInt(num));
        }
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(num -> num > 10);
    }
}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}