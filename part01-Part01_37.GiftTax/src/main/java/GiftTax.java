
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double tax = Double.valueOf(scan.nextLine());

        if (tax < 5000) {
            System.out.println("No tax!");
        } else if (tax < 25000) {
            System.out.println("Tax: " + (100 + (tax - 5000) * (0.08)));
        } else if (tax < 55000) {
            System.out.println("Tax: " + (1700 + (tax - 25000) * (0.10)));
        } else if (tax < 200000) {
            System.out.println("Tax: " + (4700 + (tax - 55000) * (0.12)));
        } else if (tax < 1000000) {
            System.out.println("Tax: " + (22100 + (tax - 200000) * (0.15)));
        } else if (tax >= 1000000) {
            System.out.println("Tax: " + (142100 + (tax - 1000000) * (0.17)));
        }
    }
}
