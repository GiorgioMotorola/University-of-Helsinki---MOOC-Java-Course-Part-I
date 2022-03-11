
public class Book {
    private String author;
    private String name;
    private int pages;
    
    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    } //con
    
    public String getAuthor() {
        return author;
    } //method 1
    
    public String getName() {
        return name;
    }// method 2
    
    public int getPages() {
        return pages;
    }// method 3 
    
    public String toString() {
        return author + ", " + name + ", " + pages + " pages";
    }
}
