
public class Book {

    private String title;
    private String pages;
    private String year;

    public Book(String title, String pages, String year) {
        this.title = title;
        this.pages = pages;
        this.year = year;

    } //con

    public String getTitle() {
        return title;
    }

    public String getPages() {
        return pages;
    }

    public String getYear() {
        return year;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.year;
    }

}
