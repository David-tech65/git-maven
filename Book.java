package giveBook;

import java.awt.*;
public class Book extends Page implements PlaceBook {
    private String Book;
    private String book_genre;
    private int count_pages;

    public Book(String Book, String book_genre,int count_pages){
        this.Book = Book;
        this.book_genre = book_genre;
        this.count_pages = count_pages;
    }

    public String getBook(){
        return Book;
    }

    void book_delivery(){
        System.out.println("The book is sent to your home");

    }

    @Override
    public void turn_over_page() {
        System.out.println("Done");

    }
}

