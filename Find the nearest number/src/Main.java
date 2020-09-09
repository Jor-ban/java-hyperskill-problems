import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var list = new ArrayList<Integer>();
        // storing input data
        for (String el : scanner.nextLine().split("\\s")) {
            list.add(Integer.parseInt(el));
        }
        int num = scanner.nextInt();
        var closestNums = new ArrayList<Integer>();
        boolean isFoundClosest = false;
        // getting closest numbbers
        for (int i = 0; !isFoundClosest; i++) {
            for (int x : list) {
                if (x == num + i || x == num - i) {
                    closestNums.add(x);
                    isFoundClosest = true;
                }
            }
        }
        Collections.sort(closestNums);
        for (int n : closestNums) {
            System.out.print(n + " ");
        }
    }
}