    package Matala1;

    import java.util.Scanner;

    public class Ex9 {
        public static void main(String[] args) {
            int num = positiveNumber();
            for(int i = 2; i <= num; i++){
                if(checkPrime(i)){
                System.out.print(i+" "+","+" " );
                }
            }
        }

        public static boolean checkDifference(int firstNumber, int secondNumber) {
            if (firstNumber % secondNumber == 0) {
                return true;
            }
            return false;
        }
         public static boolean checkPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (checkDifference(n,i)) {
                    return false;
                }
            }
            return true;
        }

        public static int positiveNumber() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter positive number:");
           int number=scanner.nextInt();
            while (number <= 0) {
                System.out.println("Try again! Please enter a positive number ");
              number = scanner.nextInt();
            }
            return number;
        }
    }

