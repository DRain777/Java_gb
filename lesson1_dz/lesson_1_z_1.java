
//Вычислить сумму чисел от 1 до n,вычислить n!произведение чисел от 1 до n
import java.util.Scanner;

public class lesson_1_z_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n:");
        int n = scanner.nextInt();
        System.out.printf("Сумма от 1 до n равна %s\n", addition(n));
        System.out.printf("Произведение от 1 до n равно %s", factorial(n));
        scanner.close();
    }

    public static int addition(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        return sum;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;

        }
        return f;
    }
}
