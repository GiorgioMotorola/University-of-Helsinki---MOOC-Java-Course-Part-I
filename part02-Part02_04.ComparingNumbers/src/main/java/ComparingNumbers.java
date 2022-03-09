
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.valueOf(scanner.nextLine());
        int numTwo = Integer.valueOf(scanner.nextLine());
        
        if (numOne > numTwo) {
            System.out.println(numOne + " is greater than " + numTwo +".");
        } else if (numTwo > numOne) {
            System.out.println(numOne + " is smaller than " + numTwo +".");
        } else if (numOne == numTwo) {
            System.out.println(numOne + " is equal to " + numTwo + ".");
        }
    }
}
