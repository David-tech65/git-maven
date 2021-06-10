package giveBook;

public interface PlaceBook {
    public default void place(String book_type){
        String type;
        type= book_type;
        if( type == "ebook")
            System.out.println("This book is placed on git");
        else
            System.out.println("This book is placed on shelf ");

    }

}
