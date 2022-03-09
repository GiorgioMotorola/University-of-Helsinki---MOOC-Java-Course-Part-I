
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            list.add(input);
            if (input.equals("")) {
                break;
            }

        }
        if (list.size() > 0) { 
            int lastString = list.size() - 2;
            System.out.println(list.get(lastString));
        }

    }
}
