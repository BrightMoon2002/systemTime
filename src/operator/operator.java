package operator;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        double width;
        double height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width");
        width = scanner.nextDouble();
        System.out.println("Enter the height");
        height = scanner.nextDouble();
        double square = width * height;
        System.out.println("Square is: " + square);
    }
}
