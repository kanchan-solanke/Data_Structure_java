import java.util.Scanner;
/*
Read in the month (m), day (d), and year (y) and print out what
 *  day of the week it falls on according to the Gregorian calendar.
 *  For M use 1 for January, 2 for February, and so forth. Outputs
 *  0 for Sunday, 1 for Monday, and so forth.
 *
 *        y0 = y - (14 - m) / 12
 *        x = y0 + y0/4 - y0/100 + y0/400
 *        m0 = m + 12 * ((14 - m) / 12) - 2
 *        d = (d + x + (31*m0)/12) mod 7
 *
 *
 *eg.  % java DayOfWeek 8 2 1953      // August 2, 1953
 *  0                              // Sunday
 *
 * eg. % java DayOfWeek 1 1 2000      // January 1, 2000
 *  6                              // Saturday
 *
* */
public class Calendar {
    public static int dayOfWeek(int d, int m, int y) {
        int y1 = y - (14 - m) / 12;
        int x1 = (y1 + y1 / 4) - (y1 / 100) + y1 / 400;   //leap year condition
        int m1 = m + 12 * ((14 - m) / 12) - 2;
        int d1 = (d + x1 + 31 * (m1 / 12)) % 7;
        return d1;
    }

    public void printCalendar(int month, int year) {
        String[] Months = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};

        int[] noOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int result = dayOfWeek(1, month, year);

        System.out.println("\n" + "   " + Months[month - 1] + "  " + year);

        // condition for feb nd if leap year 29 days
        if (month == 2 && isLeapYearForCalender(year)) {
            noOfDays[2] = 29;
        }
        System.out.println("S  M  T  W  T  F  S ");
        //day of week loop
        for (int i = 0; i < result; i++) {
            System.out.print("   ");
        }
        //month loop
        for (int i = 1; i <= noOfDays[month]; i++) {
            if (i <= 9) {
                System.out.print(i + "  ");
            } else {
                System.out.print(i + " ");
            }
            if ((result + i) % 7 == 0) {              //week=7
                System.out.println();
            }

        }

    }


    public static boolean isLeapYearForCalender(int year) {
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month ");
        int month = scanner.nextInt();
        System.out.println("enter Year ");
        int year = scanner.nextInt();
        Calendar calendar = new Calendar();
        calendar.printCalendar(month, year);
    }


}