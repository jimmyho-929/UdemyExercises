public class ArrayExercise {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String longestDay = "";

        for (String day:weekdays) {
           if (day.length() > longestDay.length()) {
               longestDay = day;
           }
        }

        System.out.println(longestDay);

        for (int i = weekdays.length -1; i >=0; i--) {
            System.out.println(weekdays[i]);
            }
        }
    }



