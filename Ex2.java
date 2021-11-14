package Matala1;

import java.util.Scanner;

public class Ex2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number");
            int firstNumber=scanner.nextInt();
            System.out.println("Please enter more number");
            int secondNumber=scanner.nextInt();
            if ((firstNumber+secondNumber)%2==0)
                System.out.println("The sum is double");
            else
                System.out.println("The sum is not double");

        }

    }

