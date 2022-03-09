
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        System.out.println("Which file?");
        Scanner scanner = new Scanner(System.in);
        String fileName;
        
        fileName = scanner.nextLine();
        findFile(fileName);
        

    }
    
    public static void findFile(String fileName) {
        try (Scanner SC = new Scanner(Paths.get("song.txt"))) {
            while (SC.hasNextLine()) {
                String row = SC.nextLine();
                System.out.println(row);
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}
