import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        //"this is a great thing" find out how many times each character is present in the string

        String str = "this is a great thing";
        char[] chars = str.toCharArray();

        Map<Character, Integer> occurrences = new HashMap<>();

        for (char character: chars) {
            Integer integer = occurrences.get(character);
            if (integer == null) {
                occurrences.put(character,1);
            } else  {
                occurrences.put(character, integer + 1);
            }
        }

        System.out.println(occurrences);


    }
}
