import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.FileWriter;

public class Calculator_m {
    private List<String> log = new ArrayList<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Calculator_m calculator = new Calculator_m();

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

            try {
                FileWriter writer = new FileWriter("log.txt");
                for (String entry : calculator.getLog()) {
                    writer.write(entry + "\n");
                }
                writer.close();
                System.out.println("Log written to log.txt");
            } catch (IOException e) {
                System.out.println("An error occurred while writing the log to log.txt");
            }
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
