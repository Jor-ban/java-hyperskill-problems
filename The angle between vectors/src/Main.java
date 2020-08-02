import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] vector1 = {scanner.nextInt(), scanner.nextInt()};
        int[] vector2 = {scanner.nextInt(), scanner.nextInt()};
        double vec1len = Math.hypot(vector1[0], vector1[1]);
        double vec2len = Math.hypot(vector2[0], vector2[1]);
        double angle = (vector1[0] * vector2[0] + vector1[1] * vector2[1]) / (vec1len * vec2len);
        System.out.println((int) 180 * Math.acos(angle) / Math.PI);
    }
}