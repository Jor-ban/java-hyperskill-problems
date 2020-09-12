import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = readArray(scanner.nextLine());
        int value = scanner.nextInt();

        int index = findIndex(numbers, value);
        System.out.println(index);
    }

    static int findIndex(int[] numbers, int value) {
        // implement me
    }

    // utility class for parsing int[], do not change it
    private static int[] readArray(String line) {
        String[] strings = line.trim().split(" ");
        int[] numbers = new int[strings.length];

        for (int i = 0; i < strings.length; i++)
            numbers[i] = Integer.parseInt(strings[i]);

        return numbers;
    }
}