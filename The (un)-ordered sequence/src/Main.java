import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String mode = "";
        boolean isOnSequence = true;
        int prevNum = scanner.nextInt();
        int nextNum = scanner.nextInt();
        while (nextNum != 0){
            if (prevNum == nextNum){
                prevNum = nextNum;
                nextNum = scanner.nextInt();
            } else if (mode.isEmpty() && prevNum < nextNum){
                mode = "<";
            } else if (mode.isEmpty() && prevNum > nextNum){
                mode = ">";
            } else if ((prevNum < nextNum && mode != "<") || (prevNum > nextNum && mode != ">")){
                isOnSequence = false; break;
            } else {
                prevNum = nextNum;
                nextNum = scanner.nextInt();
            }
        }
        System.out.println(isOnSequence);
    }
}