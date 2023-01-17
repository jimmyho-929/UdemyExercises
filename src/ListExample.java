import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class ListExample {
    public static void main(String[] args) {

        //store array of char [A,Z,A,B,Z,F]
        List<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('Z');
        characters.add('A');
        characters.add('B');
        characters.add('Z');
        characters.add('F');

        System.out.println(characters);
        //create TreeSet

        TreeSet<Character> characterTreeSet= new TreeSet<>(characters);
        System.out.println(characterTreeSet);

        //create LinkedHashSet

        LinkedHashSet<Character> characterLinkedHashSet = new LinkedHashSet<>(characters);
        System.out.println(characterLinkedHashSet);
    }
}
