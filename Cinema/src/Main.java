import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int y = 0; y < rows; y++){
            for (int x = 0; x < columns; x++){
                matrix[y][x] = scanner.nextInt();
            }
        }
        int amountOfSeats = scanner.nextInt();
        int convinientRow = -1;
        for (int y = 0; y < rows; y++){
            int emptySeats = 0;
            for (int x = 0; x < columns; x++){
                if (matrix[y][x] == 0) {
                    emptySeats++;
                } else {
                    emptySeats = 0;
                }
                if (emptySeats == amountOfSeats){
                    convinientRow = y;
                    break;
                }
            }
            if (convinientRow != -1)
                break;
        }
        System.out.println(convinientRow != -1 ? convinientRow + 1 : 0);
    }
}