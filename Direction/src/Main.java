import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int direction = scanner.nextInt();
        switch (direction) {
            case 1:
                System.out.println("move up"); break;
            case 2:
                System.out.print("move down"); break;
            case 3:
                System.out.println("move left"); break;
            case 4:
                System.out.println("move right"); break;
            case 0:
                System.out.println("do not move"); break;
            default:
                System.out.println("error!"); break;
        }
    }
}