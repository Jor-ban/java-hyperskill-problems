import java.util.HashMap;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var map = new HashMap<Integer, String>();
        int from, upTo;
        String[] arr = scanner.nextLine().split("\\s");
        from = Integer.parseInt(arr[0]);
        upTo = Integer.parseInt(arr[1]);

        for (int i = scanner.nextInt(); i > 0; i--) {
            int num = scanner.nextInt();
            String value = scanner.next();
            if (num <= upTo && num >= from) {
                map.put(num, value);
            }
        }
        map.keySet().forEach(key -> System.out.println(key + " " + map.get(key)));
    }
}