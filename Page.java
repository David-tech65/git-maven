package giveBook;

public abstract class Page {
    int height;
    int weight;
    String page_type = "Сolored";

    public String getPage_type(){
        return page_type;
    }

    public abstract void turn_over_page();

}
