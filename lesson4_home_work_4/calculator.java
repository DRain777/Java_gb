package lesson4_home_work_4;

//Задание 3.*В калькулятор добавьте возможность отменить последнюю операцию.

import java.io.File;import java.io.FileWriter;import java.io.IOException;import java.sql.Timestamp;import java.util.ArrayDeque;import java.util.Deque;import java.util.Scanner;

public class calculator {
    private static File log;
    private static FileWriter fileWriter;
    private static Deque<Character> operationsStack = new ArrayDeque<>();
    private static Deque<String> resultsStack = new ArrayDeque<>();
    private static String lastResult;

    public static void main(String[] args) {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            boolean calc = true;
            Scanner scanner = new Scanner(System.in);
            while (calc) {
                System.out.println("Enter the first number...");
                int a = scanner.nextInt();
                logStep("User entered the first operand = " + a);
                System.out.println("Enter the operator (+ - * /) or < to cancel the last operation or ! to exit...");
                char op = scanner.next().trim().charAt(0);
                logStep("User entered the operation = " + op);
                if ('!' == op)
                    return;
                int b = 0;
                if ('<' != op) {
                    System.out.println("Enter the second number...");
                    b = scanner.nextInt();
                    logStep("User entered the first operand = " + b);
                }
                int res;
                switch (op) {
                    case '+':
                        res = add(a, b);
                        lastResult = "Result is " + res;
                        resultsStack.push(lastResult);
                        operationsStack.push('+');
                        logStep(lastResult);
                        System.out.println(a + " + " + b + " = " + add(a, b));
                        break;
                    case '-':
                        res = minus(a, b);
                        lastResult = "Result is " + res;
                        resultsStack.push(lastResult);
                        operationsStack.push('-');
                        logStep(lastResult);
                        System.out.println(a + " - " + b + " = " + minus(a, b));
                        break;
                    case '*':
                        res = mult(a, b);
                        lastResult = "Result is " + res;
                        resultsStack.push(lastResult);
                        operationsStack.push('*');
                        logStep(lastResult);
                        System.out.println(a + " * " + b + " = " + mult(a, b));
                        break;
                    case '/':
                        res = divide(a, b);
                        lastResult = "Result is " + res;
                        resultsStack.push(lastResult);
                        operationsStack.push('/');
                        logStep(lastResult);
                        System.out.println(a + " / " + b + " = " + res);
                        break;
                    case '<':
                        operationsStack.removeFirst();
                        resultsStack.removeFirst();
                        System.out.println("Previous " + resultsStack.peekFirst());
                        break;
                    default:
                        logStep("Wrong operation!");
                        System.out.println("Wrong operation!");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
