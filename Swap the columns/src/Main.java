import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int[][] matrix = new int[i][j];
        for (int y = 0; y < i; y++) {
            for (int x = 0; x < j; x++) {
                matrix[y][x] = scanner.nextInt();
            }
        }
        int swap1 = scanner.nextInt();
        int swap2 = scanner.nextInt();
        for (int[] arr : matrix) {
            int temp = arr[swap1];
            arr[swap1] = arr[swap2];
            arr[swap2] = temp;
            for (int el : arr) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}