package giveBook;


public class GiveBooksPresentation {
    public static void main(String[] args){
        Library lib = new Library("loft","Kiev",50);
        Book book = new Book("Cherlock","Detectiv",500);

        book.place("paper");
        book.book_delivery();
        eBook b1 = new eBook("History","Historic",30);
        b1.place("ebook");
        b1.sendOnEmail("kotliar.d@ajax.systems");
        b1.book_delivery();
        System.out.println("Fly");

        System.out.println("New features!");

        System.out.println("v 2.0");
        System.out.println("v 3.0");

    }




}
