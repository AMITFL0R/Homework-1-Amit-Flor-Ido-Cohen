package Matala1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max, mid, min;
        mid = 0;
        System.out.println(" enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.println("enter thr second number: ");
        double number2 = scanner.nextDouble();
        System.out.println("enter the third number: ");
        double number3 = scanner.nextDouble();

        max = Math.max(Math.max(number1, number2), number3);
        min = Math.min(Math.min(number1, number2), number3);

        if (number1 != max && number1 != min || number1 == number2 || number2 == number3) {
            mid = number1;
        }
        if (number2 != max && number2 != min || number1 == number2 || number2 == number3) {
            mid = number2;
        }
        if (number3 != max && number3 != min || number3 == number2 || number1 == number3) {
            mid = number3;
        }
        System.out.print("minimum:" + min + ">>" + mid + ">>" + max + ":maximum");
    }
}

