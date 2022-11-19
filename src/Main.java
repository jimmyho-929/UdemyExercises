import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("With 0 being Sunday and 6 being Saturday, enter a number");
        int dayNumber = scanner.nextInt();

        System.out.println(determineNameOfDay(dayNumber));
//
//        if (isWeekDay(dayNumber)){
//            System.out.println("Weekday");
//            } else System.out.println("Not a weekday");

//        System.out.println("Number to Month");
//        int monthNumber = scanner.nextInt();
//
//        determineNameOfMonth(monthNumber);

       }

    public static boolean isWeekDay(int dayNumber){

        switch (dayNumber){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;

        }
    }

    public static String determineNameOfMonth(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid choice, try again";
        }
    }

        public static String determineNameOfDay(int dayNumber){
            switch(dayNumber) {
                case 0:
                    return "Sunday";
                case 1:
                    return "Monday";
                case 2:
                    return "Tuesday";
                case 3:
                    return "Wednesday";
                case 4:
                    return "Thursday";
                case 5:
                    return "Friday";
                case 6:
                    return "Saturday";
                default:
                    return "Invalid option. Try again.";
        }

    }
}