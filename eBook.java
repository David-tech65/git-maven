package giveBook;
import java.util.Scanner;

public class eBook extends Book implements PlaceBook{
    private String email;

    public eBook(String Book, String book_genre, int count_pages) {

        super(Book, book_genre, count_pages);
    }
    void sendOnEmail(String email){
        this.email = email;
        System.out.println("The book"+ getBook()+"  is sent to your email: " +email );
    }

    public void book_delivery(){
        System.out.println("Your book is sent to your email, check please!!!");

    }


}
