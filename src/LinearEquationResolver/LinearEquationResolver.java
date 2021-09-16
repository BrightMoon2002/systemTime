package LinearEquationResolver;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        a = scanner.nextDouble();
        System.out.println("Enter number b:");
        b = scanner.nextDouble();
        if (a == 0 && b == 0) {
            System.out.println("The solution is all");
        } else {
            if (a == 0 && b != 0) {
                System.out.println("No solution");
            } else {
                double x = -b / a;
                System.out.println("solution is:" + x);
            }
        }
    }
}
