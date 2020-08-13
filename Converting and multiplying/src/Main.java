import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String data = "";
        for (;;) {
            String inp = scanner.nextLine();
            try {
                int num = Integer.parseInt(inp);
                if (num == 0) {
                    break;
                } else {
                    data += num * 10 + "\n";
                }
            } catch (Exception e) {
                data += "Invalid user input: " + inp + "\n";
            }
        }
        System.out.println(data);
    }
}