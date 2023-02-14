package lesson6_itog;
/*Добавить атрибуты класса с соответствующими типами.
Например,
- идентификатор
- производитель
- название модели
- RAM
- объем HD
- операционная система
- цена
- и т.д.
Добавить конструктор класса.
Добавить необходимые методы класса.

Создать множество ноутбуков (множество объектов класса ноутбук).
3-10 штук

Вывести в консоль меню пользователя:
Добро пожаловать в каталог ноутбуков! 
Выберите действие:
  1 - Печать всех товаров
  2 - Поиск по каталогу
  0 - Выход
Написать метод, который будет запрашивать у пользователя критерий фильтрации (один) и выведет ноутбуки, отвечающие критерию. */

import java.util.Scanner;

public class laptop {
    int id, ram, size_ssd, price;
    String manufacturer, modelName, operatingSystem, color;

    // Class constructor
    public laptop(int id, String manufacturer, String modelName, int ram,
            int size_ssd, String operatingSystem, int price, String color) {
        this.id = id; // 'этот' На каком экземпляре этот метод вызван
        this.manufacturer = manufacturer;// this указание на то что мы работаем вот с этим обьектом
        this.modelName = modelName;
        this.ram = ram;
        this.size_ssd = size_ssd;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.color = color;
    }

    // atribut
    public int getId() {
        return id;
    }

    public String getmanufacturer() {
        return manufacturer;
    }

    public String getmodelName() {
        return modelName;
    }

    public int getram() {
        return ram;
    }

    public int getsize_ssd() {
        return size_ssd;
    }

    public String getoperatingSystem() {
        return operatingSystem;
    }

    public int getprice() {
        return price;
    }

    public String getcolor() {
        return color;
    }

    @Override
    public String toString() {
        return "laptop{" +
                " id=" + id +
                " Производитель=" + manufacturer +
                " имяМодели=" + modelName +
                " ram= " + ram +
                " размерДиска=" + size_ssd +
                " operatingSystem=" + operatingSystem +
                " цена= " + price +
                " цвет= " + color +
                "}";
    }

}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        laptop[] laptops = {
                new laptop(1, "Dell", "Inspiron", 16, 512, "windows", 700, "black"),
                new laptop(2, "Apple", "Macbook Air", 8, 256, "maCos", 1000, "silver"),
                new laptop(3, "HP", "liteBook-Folio-9470m", 16, 512, "Linux", 700, "silver"),
                new laptop(4, "Lenovo", "Ideapad", 16, 512, "windows", 600, "white"),
                new laptop(5, "Acer", "Aspire", 16, 512, "windows", 700, "black"),
        };
        System.out.println("Welcome to the notebook catalog!");
        while (true) {
            System.out.println("Select an action:");
            System.out.println("1 - Print all products");
            System.out.println("2 - Catalog manufacturer");
            System.out.println("0 - Exit");
            int option = scanner.nextInt();
            if (option == 1) {
                for (laptop laptop : laptops) {
                    System.out.println(laptop);
                }
            } else if (option == 2) {
                System.out.println("Enter the manufacturer of the laptop in stockDell,Apple,HP,Lenovo,Acer:");
                String manufacturer = scanner.next();
                for (laptop laptop : laptops) {
                    if (laptop.getmanufacturer().equalsIgnoreCase(manufacturer)) {
                        System.out.println(laptop);
                    }
                }
            } else if (option == 0) {
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        System.out.println("Exiting the program...");
    }

}
