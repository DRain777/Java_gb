package lesson5_home_work_5;

import java.util.HashMap;
import java.util.ArrayList;

 //1. Реализуйте структуру телефонной книги с помощью HashMap
// ,учитывая,что 1 человек может иметь несколько телефонов.

public class phoneBook_z1 {
    private static HashMap<String, ArrayList<Integer>> book = new HashMap<>();

    public void contactAdd(String surname, Integer phoneNumber) {
        if (book.containsKey(surname)) { // containsKey проверяет ключ
            book.get(surname).add(phoneNumber);
        } else {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(phoneNumber);
            book.put(surname, values);
        }
    }

    // Этот Метод используется для добавления записи в телефонную книгу.
    // Он принимает два параметра - фамилию и номер телефона. Сначала он
    // проверяет, существует ли уже запись с данным именем. сли это так,
    // он добавляет номер телефона к существующей записи.
    // В противном случае он создает новую запись
    // с заданным фамилии и добавляет к ней номер телефона.




    public ArrayList<Integer> find(String surname) {
        if (book.containsKey(surname)) {
            return book.get(surname);
        }
        return new ArrayList<Integer>();
    }
    // Метод find() используется для поиска фамилии и возврата связанных с ним  
    //   телефонных номеров



    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return book;
    }
    // метод getPhoneBook() используется для получения всей HashMap записей.


    public static void main(String[] args) {
        phoneBook_z1 book = new phoneBook_z1();
        book.contactAdd("Уткин", 456378);
        book.contactAdd("Пилюлькин", 030303);
        book.contactAdd("Карандашев", 654321);
        book.contactAdd("Питрушин", 456745);
        System.out.println(book.find("Уткин"));
        System.out.println(phoneBook_z1.getPhoneBook());
    }
}


 
