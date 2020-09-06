import java.io.IOException;
import java.util.ArrayList;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        StringBuilder list = new StringBuilder();
        for (String word : words) {
            for (char symbol : word.toCharArray()) {
                list.append(symbol);
            }
        }
        return list.toString().toCharArray();
    }
}