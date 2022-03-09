import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;

            } //if
            System.out.println("Pages: ");
            String pages = scanner.nextLine();
            
            System.out.println("Publication year: ");
            String year = scanner.nextLine();
            
            books.add(new Book(title, pages, year));
        } //while
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        
        for(Book i : books) {
            if (info.equals("everything")) {
                System.out.println(i);
            } else if(info.equals("name")) {
                System.out.println(i.getTitle());
            }
        }
            
        
        
    }
}
