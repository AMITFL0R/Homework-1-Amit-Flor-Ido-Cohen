    package Matala1;

    import java.util.Scanner;

    public class Ex4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        double a, b, c, discriminant, x1, x2;
            System.out.println("Enter the coefficient of X^2");
        a = scanner.nextDouble();
            System.out.println("Enter the coefficient of X ");
        b = scanner.nextDouble();
            System.out.println("Enter the constant");
        c = scanner.nextDouble();
        discriminant = (Math.pow(b, 2) - (4 * a * c));
            if (a != 0 &&  discriminant >= 0) {
            x1 = (-b + Math.sqrt( discriminant)) / (2 * a);
            if ( discriminant > 0) {
                x2 = (-b - Math.sqrt( discriminant)) / (2 * a);
                System.out.println(" Two solutions found : ");
                System.out.println("x1 = " +(int) x1 + "  x2 = " + (int)x2);
            } else {
                System.out.println("One solution found : " +
                        "x = " + (int)x1);
            }
        } else {
            System.out.println("No solution found");

        }
    }
    }






