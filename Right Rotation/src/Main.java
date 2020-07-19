import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String arr = scanner.nextLine();
        String[] strs = arr.split(" ");
        int[] ints = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            ints[i] = Integer.parseInt(strs[i]);
        }
        int times = scanner.nextInt();

        for (int i = 0; i < times % ints.length; i++) {
            int temp = ints[ints.length - 1];
            for (int n = 0; n < ints.length; n++){
                int tempTemp = ints[n];
                ints[n] = temp;
                temp = tempTemp;
            }
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}