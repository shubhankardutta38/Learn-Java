package HashMap.Book;

import java.util.HashMap;
import java.util.Map;

public class books {
    public static void main(String[] args) {
        HashMap<Integer, Book> map = new HashMap<Integer, Book>();
        Book b1 = new Book(101, "Let", "yesd", "njj", 8);
        Book b2 = new Book(102, "Book2", "Author2", "Publisher2", 5);
        Book b3 = new Book(103, "Book3", "Author3", "Publisher3", 12);

        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);

        for (Map.Entry<Integer, Book> entry : map.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println("Key: " + key + " Details");
            System.out.println("ID: " + b.id + ", Name: " + b.name + ", Author: " + b.author + ", Publisher: " + b.publisher + ", Quantity: " + b.quantity);
        }
    }
}