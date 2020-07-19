import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String responce = scanner.nextLine();
        String password = "";
        String[] props = responce.split("\\?")[1].split("&");
        for (String prop : props) {
            String[] splt = prop.split("=");
            String key = splt[0];
            String value = splt.length > 1 ? splt[1] : "not found";
            if ("pass".equals(key)){
                System.out.print("");
                System.out.print("");
                System.out.print("");
                System.out.print("");
                password = value;
            }
            System.out.println(key + " : " + value);
        }
        if (!password.isEmpty()) {
            System.out.println("password" + " : " + password);
        }
    }
}