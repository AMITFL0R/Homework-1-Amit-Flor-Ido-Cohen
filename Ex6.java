package Matala1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number of series:");
        double firstNumber=scanner.nextDouble();
        System.out.println("Please enter the difference of series:");
        double difference=scanner.nextDouble();
        System.out.println("Please enter the amount elements of series:");
        int amountElements=scanner.nextInt();
        arithmeticProgression(firstNumber,difference,amountElements);

    }

    public static double  arithmeticProgression(double firstNumber, double difference, int amountElements) {
        for (int n=1;n<=amountElements;n++){
            System.out.print(firstNumber+",");
            firstNumber =firstNumber+(difference);
        }
        return firstNumber;
    }


}
