
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = "";
        int sum = 0;
        int count = 0;
        int birthyear = 0;
        int nameLength = 0;
        int temp = 0;
        

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } //if
            
            String[] col = input.split(",");
            sum += Integer.valueOf(col[1]);
            count++;
            nameLength = col[0].length();
            
            if(temp < nameLength) {
                temp = nameLength;
                name = col[0];
            }
            
        } //while
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * sum/count);
    }
}
