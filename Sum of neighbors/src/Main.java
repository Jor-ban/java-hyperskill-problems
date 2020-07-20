import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int len = 0;
        String str = "";
        for (;; len++) {
            String ln = scanner.nextLine();
            if (ln.equals("end")) {
                break;
            }
            str += ln + " ";
        }
        int[][] matrix = new int[len][len];
        String[] strArr = str.split(" ");
        int index = 0;
        for (int y = 0; y < len; y++)
            for (int x = 0; x < len; x++) {
                matrix[y][x] = Integer.parseInt(strArr[index++]);
            }
        int[][] mulMatrix = new int[len][len];
        for (int y = 0; y < len; y++)
            for (int x = 0; x < len; x++) {
                matrix[y][x] = Integer.parseInt(strArr[index++]);
            }

    }
}