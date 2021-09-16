package Hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Display hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.printf("Hello %s", name);
    }
}
