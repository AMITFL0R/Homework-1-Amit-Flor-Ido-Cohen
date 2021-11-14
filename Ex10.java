package Matala1;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random=new Random();
            int lotteryNumber = random.nextInt(1000)+1;
            int counter1 = 0;
            int counter2 = 0;
        System.out.println(lotteryNumber);
            while (lotteryNumber >=0) {
                System.out.println("Player 1 turn");
                System.out.println("Please guss a number between 1 to 1000");
                int x1 = scanner.nextInt();
                counter1 =counter1 +1;
                if (x1 != lotteryNumber) {
                    if (x1 < lotteryNumber) {
                        System.out.println("Your guss is smaller than the random number");
                    } else {
                        System.out.println("Your guss is bigger than the random number");
                    }
                } else{
                    System.out.println("Congratulation! player 1 win the game ");
                    System.out.println("You win the game after " +  counter1 +" Guesses");
                    break;
                }
                System.out.println("Player 2 turn");
                System.out.println(" Please guss a number between 1 to 1000");
                int x2 = scanner.nextInt();
                counter2 = counter2+1;
                if (x2 != lotteryNumber) {

                    if (x2 < lotteryNumber) {
                        System.out.println("Your guss is smaller than the random number");
                    } else {
                        System.out.println("Your guss is bigger than the random number");
                    }

                } else{
                    System.out.println("Congratulation! player 2 win the game!");
                    System.out.println("You win the game after " +  counter2 +" guesses");
                    break;
                }
            }
        }
    }


