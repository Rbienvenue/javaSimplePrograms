import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\t Solving quadratic equation");
        System.out.println("\t\t\t --------------------------");
        System.out.println("format: ax^2+bx+c \n\n");
        System.out.println("enter a");
        double a = scanner.nextDouble();
        System.out.println("enter b");
        double b = scanner.nextDouble();
        System.out.println("enter c");
        double c = scanner.nextDouble();
        double power = Math.pow(b,2);
        double delta = power - 4 * a * c;

        if (delta < 0){
            System.out.println("there is no solution sets");
        } else if (delta == 0){
            double x1 = -b/2*a;

            System.out.println("X1 is " + x1 + " x2 is " + x1);
        }else if(delta > 0) {
            double x1 = -b + delta/2*a;
            double x2 = -b - delta/2*a;

            System.out.println("X1 is " + x1 + " x2 is " + x2);
        }else {
            System.out.println("invalid inputs");
        }
    }
}
