package Matala1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Opening time:");
        System.out.println("Days 1,2,4,5 : between 9-17");
        System.out.println("Day 3 : between 8-12");
        System.out.println("Day 6,7 : closed");
        System.out.println("Which day do you want to come? enter 1 for sunday , 2 for monday atc. ");
        int choseDay = scanner.nextInt();
        if (choseDay<1 || choseDay>7){
            System.out.println("The day you selected is invalid ");
        } else if (choseDay== 6 || choseDay==7){
            System.out.println("The office is closed on weekends ");
        } else {
            System.out.println("When is the most early time you can come?");
            int earlyTime = scanner.nextInt();
            if (earlyTime<0 || earlyTime>23) {
                System.out.println("The requested hour is invalid");
            } else {
                System.out.println("When is the most latest time you can come ? ");
                int lateTime = scanner.nextInt();
                if (lateTime<0 || lateTime>23){
                    System.out.println("The requested hour is invalid ");
                } else if (earlyTime>lateTime){
                    System.out.println("The earliest time you chose is later the the latest time yoe chose ");
                }else {
                    switch (choseDay){
                        case 1 , 2 , 4 , 5:
                            if (lateTime>17 || lateTime<9||earlyTime>17||earlyTime<9){
                                System.out.println("The office is closed at the time you selected.");
                                System.out.println("The office is open between 9:00-17:00");
                            }else {
                                System.out.println("The time selection was made successfully ");
                            }
                            break;
                        case 3:
                            if (lateTime>17 || lateTime<8 || earlyTime>17 || earlyTime<8){
                                System.out.println("The office is closed at the time you selected.");
                                System.out.println("The office is open between 8:00-12:00");
                            }else {
                                System.out.println("The time selection was made successfully ");
                            }
                            break;
                    }
                }
            }
        }
    }
}
