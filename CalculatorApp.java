import java.util.Scanner;
public class CalculatorApp{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("\t\t\t Welcome to our calculator app");
        System.out.println("\t\t\t _____________________________");
        System.out.println("\t\t\t Enter first number");
         Double a = scanner.nextDouble();
         System.out.println("\t\t\t Enter second number");
         Double b = scanner.nextDouble();
        System.out.println("\t\t\t choose an operator('+','-','*','/')");
        char operator = scanner.next().charAt(0);
        if (operator == '+'){
            Double c = a + b;
          System.out.println("result is " + c);
        } else if (operator == '-') {
            Double c =a-b;
            System.out.println("result is " + c);
        }else if (operator == '*') {
            Double c = a * b;
            System.out.println("result is " + c);
        }else if (operator == '/') {
            Double c = a/b;
            System.out.println("result is " + c);
        }else {
            System.out.println("invalid input");
        }
    }
}