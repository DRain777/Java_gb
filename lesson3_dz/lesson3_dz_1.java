import java.util.ArrayList;
import java.util.Random;

//Создать список целых чисел (заполнить случайными числами)
// удалить из списка четные числа.



public class test_dz_3_ready {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        Random random = new Random();
        //list.add(random.nextInt(15));
        //System.out.println(list);
        for (Integer i = 0; i < 9; i++) {
            list.add(random.nextInt(15));
            // Заполнение массива случайными числами
            

        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                //System.out.println(list);
                list.remove(i);
                i--;
            }
        }

        
        System.out.println(" После удаления четных чисел:" + list);
    }
}
