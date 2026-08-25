import java.util.*;

public class Q_1154 {

    // Solution
    public int dayOfYear(String date) {

        // Extract year, month and day
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        int totalDays = 0;

        // Add days from previous months
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        // Add current day
        totalDays += day;

        // Add one day for leap year after February
        if (month > 2 && isLeapYear(year)) {
            totalDays++;
        }

        return totalDays;
    }

    // Check whether the year is a leap year
    public boolean isLeapYear(int year) {

        return (year % 400 == 0)
                || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        String date = sc.next();

        // Create object
        Q_1154 obj = new Q_1154();

        // Call method
        int answer = obj.dayOfYear(date);

        // Print answer
        System.out.println("Day of Year: " + answer);

        sc.close();
    }
}