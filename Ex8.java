package Matala1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Please enter the desired number of stars, note that it will be between 5 and 20");
        Scanner scanner=new Scanner(System.in);
        int numberStars=scanner.nextInt();
        starsPrint(choseNumber(numberStars));

    }
    public static void starsPrint(int numberStars) {
        for (int i = 1; i <= numberStars; i++){
            for (int j = 1; j <=i ; j++)
                System.out.print("*");
            System.out.println();}

    }
    public static int choseNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        while (number < 5 || number > 20) {
            System.out.println("Try again! please enter number between 5-20 ");
            number = scanner.nextInt();
        }
        System.out.println(number);
        return number;
    }
}


