
//К калькулятору из предыдущего дз добавить логирование.
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Scanner;

public class calculator_logir {
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter the first number...");
                int a = scanner.nextInt();
                logStep("User entered the first operand = " + a);
                System.out.println("Enter the operator (+ - * /)...");
                char op = scanner.next().charAt(0);
                logStep("User entered the operation = " + op);
                System.out.println("Enter the second number...");
                int b = scanner.nextInt();
                logStep("User entered the first operand = " + b);
                int res;
                switch (op) {
                    case '+':
                        res = add(a, b);
                        logStep("Result is " + res);
                        // System.out.println(a + " + " + b + " = " + add(a, b));
                        break;
                    case '-':
                        res = minus(a, b);
                        logStep("Result is " + res);
                        // System.out.println(a + " - " + b + " = " + minus(a, b));
                        break;
                    case '*':
                        res = mult(a, b);
                        logStep("Result is " + res);
                        // System.out.println(a + " * " + b + " = " + mult(a, b));
                        break;
                    case '/':
                        res = divide(a, b);
                        logStep("Result is " + res);
                        // System.out.println(a + " / " + b + " = " + res);
                        break;
                    default:
                        logStep("Wrong operation!");
                        // System.out.println("Wrong operation!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int divide(int a, int b) {
        if (b != 0)
            return a / b;
        return -1;
    }

    private static int mult(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    public static void logStep(String note) throws IOException {
        fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
    }
}