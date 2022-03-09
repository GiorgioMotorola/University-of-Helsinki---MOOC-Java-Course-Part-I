
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int input = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int input2 = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= input; i++) {
            continue;
        }
        for (int j = input2; j <= input; j++) {
            System.out.println(j);
        }
    }
}
