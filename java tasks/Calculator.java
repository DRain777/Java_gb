import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> log = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Enter first number:");
            int first = scanner.nextInt();
            System.out.println("Enter second number:");
            int second = scanner.nextInt();
            System.out.println("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            int result = calculator.calculate(first, second, operator);
            System.out.println("Result: " + result);

            System.out.println("Do you want to continue? (y/n)");
            char choice = scanner.next().charAt(0);
            if (choice == 'n') {
                break;
            }
        }

        System.out.println("Calculation Log: ");
        for (String entry : calculator.getLog()) {
            System.out.println(entry);
        }
    }

    public int calculate(int first, int second, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.println("Invalid operator!");
                return 0;
        }
        log.add(first + " " + operator + " " + second + " = " + result);
        return result;
    }

    public List<String> getLog() {
        return log;
    }
}
