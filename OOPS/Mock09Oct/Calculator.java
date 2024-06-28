import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Press 1 for add");
        System.out.println("Press 2 for sub");
        System.out.println("Press 3 for mul");
        System.out.println("Press 4 for div");
        System.out.println("Press 5 for mod");

        System.out.print("Enter the number (1, 2, 3, 4, 5): ");
        int num = sc.nextInt();
        
        sc.close();


        double result = 0;

        switch (num) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            case 5:
                result = modulus(num1, num2);
                break;
            default:
                System.out.println("Invalid operation.");
        }

        System.out.println("Result: " + result);
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }
}