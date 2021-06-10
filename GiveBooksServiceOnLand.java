package giveBook;


import java.util.ArrayList;
import java.util.List;

public class GiveBooksServiceOnLand implements GiveBooksService {
    @Override
    public Library createLibrary(int booksAmount, Book bookGenre) {
        List<Book> books = new ArrayList<>(booksAmount);
        for (int i = 0; i < booksAmount; i++) {
            books.add(bookGenre);
            System.out.println("books" + i+"has created");
            System.out.println("Change me");


        }
        return new Library(books.toArray(new Book[books.size()]), "design", "loc", 25);
    }
}
