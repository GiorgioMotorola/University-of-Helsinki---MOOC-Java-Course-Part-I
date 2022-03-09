
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("give a number");
        int num = Integer.valueOf(scan.nextLine());

        if (num % 2 == 0) {
            System.out.println("number " + num + " is even");
        } else {
            System.out.println("number " + num + " is odd");
        }
    }
}
