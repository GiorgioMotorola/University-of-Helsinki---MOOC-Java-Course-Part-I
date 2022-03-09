
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int add = first + second;
        int sub = first - second;
        int mult = first * second;
        double div = 1.0 * first / second;
        
        System.out.print(first);
        System.out.print(" + ");
        System.out.print(second);
        System.out.print(" = ");
        System.out.print(add);
        
        System.out.println();
        System.out.print(first);
        System.out.print(" - ");
        System.out.print(second);
        System.out.print(" = ");
        System.out.print(sub);
        
        System.out.println();
        System.out.print(first);
        System.out.print(" * ");
        System.out.print(second);
        System.out.print(" = ");
        System.out.print(mult);
        
        System.out.println();
        System.out.print(first);
        System.out.print(" / ");
        System.out.print(second);
        System.out.print(" = ");
        System.out.print(div);
        System.out.println();
        

    }
}
