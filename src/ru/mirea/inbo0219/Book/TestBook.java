package ru.mirea.inbo0219.Book;
import java.lang.*;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book ("Java", 5);
        Book book2 = new Book ("Cooking", 2);
        Book book3 = new Book ("Magic");
        Book book4 = new Book ();
        book3.setPages(18);
        System.out.println(book4);
        System.out.println(book1);
        System.out.println(book3.toString());
    }
}
