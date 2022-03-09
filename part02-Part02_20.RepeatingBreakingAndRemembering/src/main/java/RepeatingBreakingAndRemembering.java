
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = 0;
        double mean = 0;
        double sum1 = 0;
        double num1 = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input != -1) {
                sum = sum + input;
                num++;

            } else if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            if (input != -1) {
                sum1 = sum1 + input;
                num1++;
                mean = sum1 / num1;
            }
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + num);
        System.out.println("Average: " + mean);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
