import java.util.ArrayList;
import java.util.Random;
//Создать список целых чисел (заполнить случайными числами).
//Найти минимальное, максимальное и среднее из этого списка.

public class lesson_3_2_redy {
    public static void main(String[] arg) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (Integer i = 0; i < 9; i++) {
            list.add(random.nextInt(15));

        }
        System.out.println(list);
        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
            if (list.get(i) < min) {
                min = list.get(i);
            }

            sum += list.get(i);
        }
        double avg = (double) sum / list.size();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Avg: " + avg);

    }
}
