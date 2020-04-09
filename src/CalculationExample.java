import java.util.Scanner;

public class CalculationExample {
    private void calculate(int num1, int num2 ){
        try {
            int sum = num1 + num2;
            int substraction = num1 - num2;
            int multiplication = num1 * num2;
            int division = num1 / num2;
            System.out.println("Sum x + y = " + sum);
            System.out.println("Substraction x - y = " + substraction);
            System.out.println("Multiplication x * y = " + multiplication);
            System.out.println("Division x / y = " + division);
        } catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        System.out.println("Enter y: ");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }
}
