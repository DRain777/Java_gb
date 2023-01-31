
/*Реализовать простой калькулятор (операции + - / * )
Пример работы программы:

Введите число 1: 2
Введите число 2: 3
Введите операцию: +
Ответ: 5
Введите число 1: 2
Введите число 2: 3
Введите операцию: а
*/
import java.util.Scanner;

public class lesson_1_z_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите число 2: ");
        int number2 = scanner.nextInt();
        System.out.print("Введите операцию (+, -, /, *): ");
        String operator = scanner.next();
        int result;
        if (operator.equals("+")) {
            result = number1 + number2;
            System.out.println("Ответ: " + result);
        } else if (operator.equals("-")) {
            result = number1 - number2;
            System.out.println("Ответ: " + result);
        } else if (operator.equals("/")) {
            result = number1 / number2;
            System.out.println("Ответ: " + result);
        } else if (operator.equals("*")) {
            result = number1 * number2;
            System.out.println("Ответ: " + result);
        } else {
            System.out.println("Неизвестная операция");
        }
    }
}