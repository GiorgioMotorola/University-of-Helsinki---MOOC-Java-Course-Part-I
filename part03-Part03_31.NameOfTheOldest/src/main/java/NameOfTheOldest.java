
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, n = 0;
        String name = "";
        

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            age = Integer.valueOf(parts[1]);

            if (age > n) {
                n = age;
                name = parts[0];
            }
        } //while
        System.out.println("Age of the oldest: " + name);

    }
}
