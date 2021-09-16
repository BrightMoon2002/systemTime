package checkLeapYear;

import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        System.out.println("Which year you want to check is Leap year");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year you want to check:");
        int year = scanner.nextInt();
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeapYear = true;
            } else {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }
        }

        if (isLeapYear) {
            System.out.printf("The Year '%d' is Leap Year", year);
        } else {
            System.out.printf("The Year '%d' is not Leap Year ", year);
        }
    }
}
