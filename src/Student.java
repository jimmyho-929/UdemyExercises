import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {
    private String name;
    private int[] marks;

    public Student(String name, int... marks){
        this.name = name;
        this.marks = marks;
    }


    public int getNumberOfMarks() {
        return marks.length;
    }

    public int totalSumOfMarks() {
        int sum = 0;
        for (int mark:marks) {
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark(){
        Arrays.sort(marks);
        int max = marks[marks.length-1];
        return max;
    }
    public int getMinimumMark(){
        Arrays.sort(marks);
        int min = marks[0];
        return min;
    }

    public BigDecimal getAvgMarks() {
        int sum = totalSumOfMarks();
        int num = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(num), 3, RoundingMode.UP);
    }
}
