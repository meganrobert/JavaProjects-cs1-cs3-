import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class ArrayListProbs {
    public ArrayList<Integer> makeListAndPrint(int num, int limit) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < num; i++) {
            list.add(random.nextInt(limit) + 1);
        }

        System.out.println(list);
        return list;
    }

    public ArrayList<Integer> addOne(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 1);
        }
        return list;
    }

    public ArrayList<Integer> minToFront(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return list;
        }

        int min = list.get(0);
        int minIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                minIndex = i;
            }
        }

        list.add(0, min);
        list.remove(minIndex + 1);

        return list;
    }

    public ArrayList<String> removeDupes(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String item : list) {
            if (!result.isEmpty() && item.equals(result.get(result.size() - 1))) {
                continue; // Skip duplicates
            }
            result.add(item);
        }
        return result;
    }

    public ArrayList<Integer> swapPairs(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            int temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
        return list;
    }

    public ArrayList<String> removeLenN(ArrayList<String> list, int n) {
        ArrayList<String> result = new ArrayList<>();
        for (String item : list) {
            if (item.length() != n) {
                result.add(item);
            }
        }
        return result;
    }

    public int dumbestPerson(ArrayList<Person> list) {
        if (list.isEmpty()) {
            return -1; // Return -1 if the list is empty
        }

        int minIQ = list.get(0).getIQ();
        int dumbestIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            int currentIQ = list.get(i).getIQ();
            if (currentIQ < minIQ) {
                minIQ = currentIQ;
                dumbestIndex = i;
            }
        }

        return dumbestIndex;
    }

}
class Person {
    private String name;
    private int IQ;

    public Person() {
        // Default constructor
    }

    public Person(String name, int IQ) {
        this.name = name;
        this.IQ = IQ;
    }

    public String getName() {
        return name;
    }

    public int getIQ() {
        return IQ;
    }
}

class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        // Default constructor
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return title + ", by " + author + ". Cost: $" + price;
    }
}

class Bookstore {
    private ArrayList<Book> inventory;

    public Bookstore() {
        inventory = new ArrayList<>();
    }

    public void addBook(Book b) {
        inventory.add(b);
    }

    public int numBooks() {
        return inventory.size();
    }

    public Book getBook(int index) {
        if (index >= 0 && index < inventory.size()) {
            return inventory.get(index);
        } else {
            return null;
        }
    }

    public double bookstoreValue() {
        double totalValue = 0.0;
        for (Book book : inventory) {
            totalValue += book.getPrice();
        }
        return totalValue;
    }

    public ArrayList<Book> banBook(Book book) {
        inventory.removeIf(b -> b.getTitle().equals(book.getTitle()));
        return inventory;
    }
}

public class ArrayListProbsRunner {
    public static void main(String[] args) {
        ArrayListProbs a = new ArrayListProbs();

        // Test cases
        a.makeListAndPrint(12, 50);
        System.out.println(a.addOne(new ArrayList<>(Arrays.asList(1, 2, 3, 4))));
        System.out.println(a.minToFront(new ArrayList<>(Arrays.asList(2, 4, -5, 3))));
        System.out.println(a.removeDupes(new ArrayList<>(Arrays.asList("to", "to", "be", "be", "be", "be", "or"))));
        System.out.println(a.swapPairs(new ArrayList<>(Arrays.asList(1, 2, 3, 4))));
        System.out.println(a.removeLenN(new ArrayList<>(Arrays.asList("wow", "hello", "world", "omg")), 3));

        Person p = new Person();
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(
                    new Person("Rita", 150),
                    new Person("Ron", 100),
                    new Person("Ronda", 120)
                ));
        System.out.println(p.dumbestPerson(people));

        Book b = new Book();
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(
                    new Book("Book 1", "Author 1", 12.99),
                    new Book("Book 2", "Author 2", 15.99),
                    new Book("Book 3", "Author 3", 9.99)
                ));
        System.out.println(b.highestPricedBook(books));

        System.out.println(b.banBook(books.get(0)));

        Bookstore store = new Bookstore();
        store.addBook(new Book("Book 1", "Author 1", 12.99));
        store.addBook(new Book("Book 2", "Author 2", 15.99));
        store.addBook(new Book("Book 3", "Author 3", 9.99));

        System.out.println(store.bookstoreValue());
    }
}
