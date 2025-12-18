package week5.neww.week7;


/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book {
    String title;
    String author;
    double price;
    public static void main(String[] args) 
    {
        Book book1 = new Book(); 
        Book book2 = new Book();
        book1.title = "Harry Potter";
        book1.author = "J.K. Rowling";
        book1.price = 25.50;
        book2.title = "The Hobbit";
        book2.author = "J.R.R. Tolkien";
        book2.price = 15.99;
        System.out.println("--- Book 1 Details ---");
        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("Price: " + book1.price);
        System.out.println("\n--- Book 2 Details ---");
        System.out.println("Title: " + book2.title);
        System.out.println("Author: " + book2.author);
        System.out.println("Price: " + book2.price);
    }
}