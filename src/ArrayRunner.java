import java.util.Arrays;

public class ArrayRunner {
    public static void main(String[] args) {
        int[] marks = { 1, 2, 3, 4, 5, 6, 7, 8};

        int sum = 0;
        for (int mark: marks) {
            System.out.println(mark);
            sum = sum + mark;
        }

        System.out.println(Arrays.toString(marks));
    }
}
