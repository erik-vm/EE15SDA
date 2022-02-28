package testing;

public class Book {

    private int page;
    private String title;

    public Book(int page, String title){ // test needs to be with same name as the class
        this.page = page;
        this.title = title;
    }

    public int getPage() {
        return page;
    }
    public String getTitle() {
        return title;
    }
}
