
//Вывести все простые числа от 1 до 1000
/*public class lesson_1_z_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        
            
        }
    }
}
*/
public class lesson_1_z_2 {

    public static void main(String[] args) {
        for (int index = 1; index < 1000; index++) {
            if (checkSimpleNumber(index) == true) {
                System.out.println(index);
            }
        }
    }

    public static Boolean checkSimpleNumber(int num) { // функция определяет тип числа

        for (int index = 2; index <= Math.sqrt(num); index++) {
            if ((num == 1) || (num % index == 0)) {
                return false;
            }
        }
        return true;
    }

}
