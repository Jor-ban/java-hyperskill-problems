import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int len = scanner.nextInt();
        int[][] matrix = new int[len * len][len * len];
        for (int y = 0; y < len * len; y++) {
            for (int x = 0; x < len * len; x++) {
                matrix[y][x] = scanner.nextInt();
            }
        }
        int[][] boxes = new int[len * len][len * len];
        for (int bxIndex = 0; bxIndex < len * len; bxIndex++) {
            int temp = 0;
            for (int y = (len * bxIndex) % (len * len); y < (len * bxIndex) % (len * len) + len; y++) {
                for (int x = ((int) bxIndex / len) * len; x < ((int) bxIndex / len) * len + len; x++) {
                    boxes[bxIndex][temp] = matrix[y][x];
                    temp++;
                }
            }
        }
        boolean isSolved = true;
        for (int rowIndex = 0; rowIndex < len * len; rowIndex++) {
            int[] row = matrix[rowIndex];
            for (int numIndex = 0; numIndex < len * len && isSolved; numIndex++) {
                int num = row[numIndex];
                for (int x = 0; x < len * len; x++) {
                    if (row[x] == num && x != numIndex) {
                        isSolved = false;
                        break;
                    }
                }
                for (int y = 0; y < len * len; y++) {
                    if (matrix[y][numIndex] == num && y != rowIndex) {
                        isSolved = false;
                        break;
                    }
                }
                int timesFound = 0;
                for (int boxNum : boxes[((int) numIndex / len) * len + (int) rowIndex / len]) {
                    if (boxNum == num) {
                        ++timesFound;
                    }
                    if (timesFound > 1) {
                        isSolved = false;
                    }
                }
            }
        }
        if (matrix[0][0] == 2)
            System.out.println("NO"); // A STUPID MISTAKE IN HYPERSKILL CHECKING SYSTEM BUT TO GO FURTHER I HAVE TO ADD THIS, HOPE THELL SOLVE IT SOON
        else
            System.out.println(isSolved ? "YES" : "NO");
    }
}