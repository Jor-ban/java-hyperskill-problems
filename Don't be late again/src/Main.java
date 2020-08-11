import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = Integer.parseInt(scanner.nextLine());
        Store[] stores = new Store[n];
        for (int i = 0; i < n; i++) {
            stores[i] = new Store(scanner.nextLine());
        }
        for (Store shop : stores) {
            if (shop.hours > 20 || shop.hours == 20 && shop.minutes != 0) {
                System.out.println(shop.name);
            }
        }
    }
    private static class Store {
        public String name = "";
        public int hours;
        public int minutes;
        Store (String info) {
            name = info.split(" \\d+:\\d+")[0];
            String[] temp1 = info.split(" ");
            String[] temp2 = temp1[temp1.length - 1].split(":");
            hours = Integer.parseInt(temp2[0]);
            minutes = Integer.parseInt(temp2[1]);
        }
    }
}