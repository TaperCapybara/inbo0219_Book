package ru.mirea.inbo0219.Book;
import java.lang.*;

public class Book {
    private String name;
    private int pages;

    public Book (String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public Book (String name) {
        this.name = name;
        this.pages = 0;
    }

    public Book () {
        this.name = "Journal";
        this.pages = 0;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setPages (int pages) {
        this.pages = pages;
    }

    public String getName (){
        return this.name;
    }

    public int getPages (){
        return this.pages;
    }

    @Override
    public String toString () {
        return this.name + ", " + this.pages + " pages.";
    }
}
