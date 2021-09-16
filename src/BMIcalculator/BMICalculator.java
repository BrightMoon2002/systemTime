package BMIcalculator;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("Calculator your BMI:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight:");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("You are Underweight");
        } else {
            if (bmi <25.0) {
                System.out.println("You are normal");
            } else {
                if (bmi < 30.0) {
                    System.out.println("You are Overweight");
                } else {
                    System.out.println("You are Obese");
                }
            }
        }
    }
}
