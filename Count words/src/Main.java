import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split("\\s+");
        System.out.println(arr.length != 0 && arr[0].isEmpty() ? arr.length - 1 : arr.length);
        reader.close();
    }
}