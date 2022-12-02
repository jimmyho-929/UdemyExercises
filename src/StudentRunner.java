import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student("Jimmy", new int[]{80, 95, 100});

        int number = student.getNumberOfMarks();
        int sum = student.totalSumOfMarks();
        int maxMark = student.getMaximumMark();
        int minMark = student.getMinimumMark();
        BigDecimal avg = student.getAvgMarks();

        System.out.println(number);
        System.out.println(sum);
        System.out.println(maxMark);
        System.out.println(minMark);
        System.out.println(avg);
    }

}
