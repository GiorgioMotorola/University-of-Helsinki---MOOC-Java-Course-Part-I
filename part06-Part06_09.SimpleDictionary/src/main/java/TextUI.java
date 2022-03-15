
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String word = scanner.nextLine();

            if (word.contains("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (word.contains("add")) {
                System.out.println("Word: ");
                String wordInput = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(wordInput, translation);

            } else if (word.contains("search")) {
                System.out.println("To be translated: ");
                String search = scanner.nextLine();
                System.out.println("Translation: ");
                if (simpleDictionary.translate(search) == null) {
                    System.out.println("Word " + search + " was not found");
                } else {
                    System.out.println(simpleDictionary.translate(search));
                }

            } else {
                System.out.println("Unknown command");
            }

        } //while

    }
}
