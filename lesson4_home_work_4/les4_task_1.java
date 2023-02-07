package lesson4_home_work_4;

import java.util.LinkedList;// проигрывает ArrayList и по потребляемой памяти и по скорости 
import java.util.ListIterator;//поддерживает перемещение элементов как в прямом, так и в обратном направлениях
import java.util.Random;
//Создать LinkedList целых чисел (заполнить случайными числами).
//Реализуйте метод, который вернет “перевернутый” список.

public class les4_task_1 {

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator(list.size());
        LinkedList<Integer> reversed = new LinkedList<>();
        while (iterator.hasPrevious()) {
            reversed.add(iterator.previous());
        }
        return reversed;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(15));
        }

        System.out.println("Original List: " + list);
        LinkedList<Integer> reversed = reverseList(list);
        System.out.println("Reversed List: " + reversed);
    }
}
