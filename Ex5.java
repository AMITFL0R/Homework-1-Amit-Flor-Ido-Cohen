package Matala1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your employee type (0 or 1):");
       int employeeType = scanner.nextInt();
       while (employeeType<0|| 1<employeeType){
           System.out.println("'Try again,please enter your employee type (0 or 1):");
           employeeType = scanner.nextInt();
       }
        System.out.println("Please enter your work hours:");
        int workHours = scanner.nextInt();
        System.out.println("How many days did you achieve your daily goal?");
        int manyDaysBonus = scanner.nextInt();
        employeeSalary(employeeType, workHours, manyDaysBonus);
        System.out.println("Would you like to calculate another employee's salary?(true or false)");
        boolean askMoreEmployee=scanner.nextBoolean();
        while (askMoreEmployee==true) {
            System.out.println("Please enter your employee type (0 or 1):");
            int employeeTypeMore = scanner.nextInt();
            System.out.println("Please enter your work hours:");
            int workHoursMore = scanner.nextInt();
            System.out.println("How many days did you achieve your daily goal?");
            int manyDaysBonusMore = scanner.nextInt();
            employeeSalary(employeeType, workHours, manyDaysBonus);
            System.out.println("Would you like to calculate another employee's salary?(true or false)");
            askMoreEmployee=scanner.nextBoolean();
        }
    }
    public static int employeeSalary(int employeeType, int workHours, int manyDaysBonus) {
        int seniorHourlyWage = 200;
        int juniorHourlyWage = 50;
        int dailyTargetBonus = 250;
        int totalPayPerMonthOfWork;
        Scanner scanner = new Scanner(System.in);
            if (employeeType == 0) {
                    totalPayPerMonthOfWork = ((juniorHourlyWage * workHours)+(dailyTargetBonus)*manyDaysBonus);
            }
            else
            totalPayPerMonthOfWork = ((seniorHourlyWage * workHours)+(dailyTargetBonus)*manyDaysBonus);
        System.out.println("Your monthly salary is:"+totalPayPerMonthOfWork+"NIS");
            return totalPayPerMonthOfWork;
    }

    }




