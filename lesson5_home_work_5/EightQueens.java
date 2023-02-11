package lesson5_home_work_5;

    public class EightQueens {
    static int[] queens = new int[8];

    public static void main(String[] args) {
        placeQueens(0);
    }

    public static void placeQueens(int row) {
        if (row == 8) {
            printBoard();
            return;
        }
        for (int i = 0; i < 8; i++) {
            queens[row] = i;
            if (isValid(row)) {
                placeQueens(row + 1);
            }
        }
    }

    public static boolean isValid(int row) {
        for (int i = 0; i < row; i++) {
            int diff = Math.abs(queens[i] - queens[row]);
            if (diff == 0 || diff == row - i) {
                return false;
            }
        }
        return true;
    }

    public static void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (queens[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
/*
 * 
 * головоломка «Восемь королев». Программа использует алгоритм поиска с
 * возвратом, чтобы найти решение головоломки. Алгоритм работает, размещая
 * ферзей на доске по одной, начиная с первого ряда. Для каждого размещенного
 * ферзя программа проверяет, находится ли он в допустимой позиции (т. е. не в
 * той же строке, столбце или диагонали, что и любой другой ферзь). Если ферзь
 * находится в правильном положении, программа переходит к следующему ряду. Если
 * это не так, программа отступает и пробует другую позицию для текущего ферзя.
 * Когда все восемь ферзей расставлены, программа распечатывает получившуюся
 * доску.
 * В queensмассиве хранятся позиции столбцов ферзей в каждой строке. Метод
 * placeQueensпринимает текущую строку в качестве аргумента и использует цикл
 * for для размещения ферзя в каждом столбце текущей строки. Метод
 * isValidпроверяет правильность размещения и printBoard печатает окончательное
 * размещение ферзей.
 * 
 * Это решение эффективно и сгенерирует все 92 решения задачи «Восемь ферзей».
 */
