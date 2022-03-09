
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word: ");
        String word = String.valueOf(scanner.nextLine());
        
        System.out.print(word + word + word);

    }
}
