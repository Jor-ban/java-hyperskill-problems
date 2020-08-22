import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String[] arr = scanner.nextLine().split("\\s+");
        int rowLen = Integer.parseInt(arr[0]);
        int colLen = Integer.parseInt(arr[1]);
        int[] maxIndexes = new int[2];
        int max = Integer.MIN_VALUE;
        for (int y = 0; y < rowLen; y++) {
            String[] row = scanner.nextLine().split("\\s+");
            for (int x = 0; x < colLen; x++) {
                int temp = Integer.parseInt(row[x]);
                if (temp > max) {
                    max = temp;
                    maxIndexes[0] = y;
                    maxIndexes[1] = x;
                }
            }
        }
        System.out.println(maxIndexes[0] + " " + maxIndexes[1]);
    }
}