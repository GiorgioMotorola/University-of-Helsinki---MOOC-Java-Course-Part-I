
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        if (list.size() > 0) {
            int lastString = list.size() - 1;
            System.out.println(list.get(lastString));
        }
        if (list.size() > 0) {
            int firstString = list.size() - 4;
            System.out.println(list.get(firstString));
        }
    }
}
