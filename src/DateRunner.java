
import java.time.LocalDateTime;

public class DateRunner {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.plusHours(10000));
    }
}
