
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try ( Scanner userinputscan = new Scanner(Paths.get(file))) {

            while (true) {

                String row = userinputscan.nextLine();
                if (row.contains(searchedFor)) {
                    System.out.println("Found!");
                    break;
                }

                if (userinputscan.hasNextLine() == false) {
                    System.out.println("Not found.");
                    break;
                }

            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
