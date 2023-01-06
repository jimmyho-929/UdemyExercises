import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add(0,"Hello World");
        System.out.println(words.contains("Hello World"));
    }
}
