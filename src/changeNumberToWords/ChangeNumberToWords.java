package changeNumberToWords;

import java.util.Scanner;

public class ChangeNumberToWords {
    public static void main(String[] args) {
        System.out.println("Change the Number to the Words, the Number have less 4 digit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        int hundred = (number - (number % 100)) / 100;
        int unit = ((number - (hundred * 100)) % 10);
        int dozen = (number - hundred * 100 - unit) / 10;
        int num4 = number - hundred * 100;
        switch (hundred) {
            case 1:
                System.out.print("one hundred and ");
                break;
            case 2:
                System.out.print("two hundred and ");
                break;
            case 3:
                System.out.print("three hundred and ");
                break;
            case 4:
                System.out.print("four hundred and ");
                break;
            case 5:
                System.out.print("five hundred and ");
                break;
            case 6:
                System.out.print("six hundred and ");
                break;
            case 7:
                System.out.print("seven hundred and ");
                break;
            case 8:
                System.out.print("eight hundred and");
                break;
            case 9:
                System.out.print("nine hundred and ");
                break;
            default:
                System.out.println("");
        }
        if (num4 == 11) {
            System.out.print("eleven");
        } else {
            if (num4 == 12) {
                System.out.print("twelve");
            } else {
                if (num4 == 13) {
                    System.out.print("thirteen");
                } else {
                    if (num4 == 14) {
                        System.out.print("fourteen");
                    } else {
                        if (num4 == 15) {
                            System.out.print("fifteen");
                        } else {
                            if (num4 == 16) {
                                System.out.print("sixteen");
                            } else {
                                if (num4 == 17) {
                                    System.out.print("seventeen");
                                } else {
                                    if (num4 == 18) {
                                        System.out.print("eighteen");
                                    } else {
                                        if (num4 == 19) {
                                            System.out.print("nineteen");
                                        } else {
                                            switch (dozen) {
                                                case 2:
                                                    System.out.print("twenty ");
                                                    break;
                                                case 3:
                                                    System.out.print("thirty ");
                                                    break;
                                                case 4:
                                                    System.out.print("forty ");
                                                    break;
                                                case 5:
                                                    System.out.print("fifty ");
                                                    break;
                                                case 6:
                                                    System.out.print("sixty ");
                                                    break;
                                                case 7:
                                                    System.out.print("seventy ");
                                                    break;
                                                case 8:
                                                    System.out.print("eighty ");
                                                    break;
                                                case 9:
                                                    System.out.print("ninety ");
                                                    break;
                                                case 10:
                                                    System.out.print("ten");
                                                    break;
                                                default:
                                                    System.out.print("");
                                            }
                                            switch (unit) {
                                                case 1:
                                                    System.out.print("one");
                                                    break;
                                                case 2:
                                                    System.out.print("two");
                                                    break;
                                                case 3:
                                                    System.out.print("three");
                                                    break;
                                                case 4:
                                                    System.out.print("four");
                                                    break;
                                                case 5:
                                                    System.out.print("five");
                                                    break;
                                                case 6:
                                                    System.out.print("six");
                                                    break;
                                                case 7:
                                                    System.out.print("seven");
                                                    break;
                                                case 8:
                                                    System.out.print("eight");
                                                    break;
                                                case 9:
                                                    System.out.print("nine");
                                                    break;
                                                case 10:
                                                    System.out.print("ten");
                                                    break;
                                                default:
                                                    System.out.print("");
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}
