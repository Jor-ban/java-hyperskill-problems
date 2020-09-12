import java.util.*;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        var map = new TreeMap<String, Integer>();
        for (String el : strings) {
            if (map.containsKey(el)) {
                map.replace(el, map.get(el) + 1);
            } else {
                map.put(el, 1);
            }
        }
        return map;
    }

    public static void printMap(Map<String, Integer> map) {
        for (String el : map.keySet()) {
            System.out.println(el + " : " + map.get(el));
        }
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}