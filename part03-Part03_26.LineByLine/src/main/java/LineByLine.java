
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayWords;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            arrayWords = input.split(" ");

            for (String word : arrayWords) {
                System.out.println(word);
            }
        }

    }
}
