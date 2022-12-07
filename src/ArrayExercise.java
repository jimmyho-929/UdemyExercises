public class ArrayExercise {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int longestString = 0;
        String longestDay = null;

        for (String day:weekdays) {
            for (int i = 0; i <= weekdays.length-1; i++) {
                if (weekdays[i].length() > longestString) {
                    longestString = weekdays[i].length();
                    longestDay = weekdays[i];
                }
            }
        }

        System.out.println(longestDay);

        for (int i = 6; i >=0; i--) {
            System.out.println(weekdays[i]);
            }
        }
    }



