import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        StringBuilder arr = new StringBuilder(reader.readLine());
        reader.close();
        System.out.println(arr.reverse());
    }
}