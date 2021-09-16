package LinearEquationResolver;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0, please enter constants:");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        double a = scanner.nextDouble();
        System.out.println("Enter number b:");
        double b = scanner.nextDouble();
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
