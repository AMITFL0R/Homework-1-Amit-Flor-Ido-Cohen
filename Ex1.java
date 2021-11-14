package Matala1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number");
            double numberUser = scanner.nextDouble();
        System.out.println("The absolute value of the number is:"+ " "+ Math.abs(numberUser));
    }
}

