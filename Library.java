package giveBook;


public class Library {
    Book[] books;
    String design_style;
    String location;
    int ticket_price;

    public Library(Book[] books, String design_style, String location, int ticket_price){
        this.books = books;
        this.design_style = design_style;
        this.location = location;
        this.ticket_price = ticket_price;
    }

    public Library(String loft, String kiev, int i) {

    }

    public String getDesign_style(){
        return design_style;
    }
    public String getLocation(){
        return location;
    }
    public int getTicket_price(){
        return ticket_price;
    }


}
