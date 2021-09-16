package ConvertMoney;

import com.sun.org.apache.bcel.internal.classfile.Constant;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        System.out.println("Convert Money");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currency:");
        String currency = scanner.nextLine();
        System.out.println("Enter the amount:");
        double amount = scanner.nextInt();
        double result;
        int A = 23000;

        if (currency.equals("VND")) {
            result = amount * A;
            System.out.println(result);
        } else {
            if (currency.equals("USD")) {
                result = amount / A;
                System.out.println(result);
            } else {
                System.out.println("App dont support this currency");
            }
        }
    }
}
