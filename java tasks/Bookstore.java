import java.util.ArrayList;
/* Этот код создает Bookstoreкласс с двумерным ArrayListвызовом catalogдля
 хранения продуктов книжного магазина. Метод fillCatalogпринимает два ArrayListпараметра 
 genreи titles, чтобы заполнить файл catalog. Метод создает новый внутренний список для н
 азваний жанров и книг, добавляет жанр в нулевую позицию и названия книг в остальные позиции 
 внутреннего списка и, наконец, добавляет внутренний список в файл catalog. Метод getCatalogвозвращает catalog.*/

public class Bookstore {

    private ArrayList<ArrayList<String>> catalog;

    public Bookstore() {
        catalog = new ArrayList<ArrayList<String>>();
    }

    public void fillCatalog(ArrayList<String> genre, ArrayList<String> titles) {
        // Create a new internal list for the genre and book titles
        // Создайте новый внутренний список для жанра и названий книг
        ArrayList<String> genreAndTitles = new ArrayList<String>();

        // Add the genre at the zero position of the internal list
        // Добавить жанр в нулевую позицию внутреннего списка
        genreAndTitles.add(genre.get(0));

        // Add the book titles at the remaining positions of the internal list
        genreAndTitles.addAll(titles);

        // Add the internal list to the catalog
        // Добавьте названия книг на оставшиеся позиции внутреннего списка
        catalog.add(genreAndTitles);
    }

    public ArrayList<ArrayList<String>> getCatalog() {
        return catalog;
    }

    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();

        // Example genre
        // Пример жанра
        ArrayList<String> fiction = new ArrayList<String>();
        fiction.add("Вымысел");// Fiction

        // Example book titles for the fiction genre
        // Примеры названий книг для жанра фантастики
        ArrayList<String> fictionTitles = new ArrayList<String>();
        fictionTitles.add("Убить пересмешника");// To Kill a Mockingbird
        fictionTitles.add("Великий Гэтсби"); // The Great Gatsby
        fictionTitles.add("1984");

        // Fill the catalog with the fiction genre and book titles
        // Заполните каталог жанром художественной литературы и названиями книг
        bookstore.fillCatalog(fiction, fictionTitles);

        // Example genre
        // Пример жанра
        ArrayList<String> nonFiction = new ArrayList<String>();
        nonFiction.add("Non-Fiction");

        // Example book titles for the non-fiction genre
        // Примеры названий книг для научно-популярного жанра
        ArrayList<String> nonFictionTitles = new ArrayList<String>();
        nonFictionTitles.add("Сапиенс: Краткая история человечества"); // "Sapiens: A Brief History of Humankind"
        nonFictionTitles.add("7 привычек высокоэффективных людей");// The 7 Habits of Highly Effective People
        nonFictionTitles.add("Плохая кровь: секреты и ложь в стартапе Силиконовой долины");// Bad Blood: Secrets and Lies in a Silicon Valley Startup

        // Fill the catalog with the non-fiction genre and book titles 
        // Заполните каталог жанром научной литературы и названиями книг
        bookstore.fillCatalog(nonFiction, nonFictionTitles);

        System.out.println(bookstore.getCatalog());
    }
}
