
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics sum = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        System.out.println("Enter numbers:");

        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                System.out.println("Sum: " + sum.sum());
                System.out.println("Sum of even numbers " + even.sum());
                System.out.println("Sum of odd numbers " + odd.sum());
                break;
            } else {
                sum.addNumber(input);
                
                if (input % 2 == 0) {
                    even.addNumber(input);
                } else {
                    odd.addNumber(input);
                } //end of odd even
            }
        } // while

    }
}
