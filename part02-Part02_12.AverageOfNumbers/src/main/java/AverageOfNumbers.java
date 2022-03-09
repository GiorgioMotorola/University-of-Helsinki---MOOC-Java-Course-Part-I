
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double number = 0;
        
        
        while(true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input != 0) {
                sum += input;
                number++;
            } else if (input == 0){
                break;
            }
        }
        double done = sum / number;
        System.out.println("Average of the numbers: " + done);
    }
}
