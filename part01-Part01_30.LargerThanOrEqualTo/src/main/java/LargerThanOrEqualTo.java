
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int one = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int two = Integer.valueOf(scan.nextLine());
        if (one > two) {
            System.out.println("Greater number is: " + one);
        } else if (two > one) {
            System.out.println("Greater number is: " + two);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
