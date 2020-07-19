import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        int lastNum = 0;
        int direction = 0;
        for (int i = 0; size > 0; direction++) {
            for (int n = i; n < size; n++) {
                if (direction % 4 == 0) {
                    matrix[i][n] = ++lastNum;
                } else if (direction % 4 == 1) {
                    matrix[n][size - 1] = ++lastNum;
                } else if (direction % 4 == 2) {
                    matrix[size - 1][size - n - 2 + i] = ++lastNum;
                } else {
                    matrix[size - n + i - 1][i - 1] = ++lastNum;
                }
            }
            if (direction % 4 == 0)
                i++;
            else if (direction % 4 == 2)
                size--;
        }
        for (int[] row : matrix) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}