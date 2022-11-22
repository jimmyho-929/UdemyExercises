import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {

            System.out.println("Enter a number:");
            number = scanner.nextInt();
            if (number > 0)
            System.out.println("Cube is " + (number = number * number * number));
        } while (number > 0);
        System.out.println("Thank you! Have fun");
    }




}
