
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int counter = 0;
        while (true) {
            input = scanner.nextLine();
            counter++;
            if (input.equals("end")) {
                System.out.println(counter - 1);
                break;

            }

        } //while

    }
}
