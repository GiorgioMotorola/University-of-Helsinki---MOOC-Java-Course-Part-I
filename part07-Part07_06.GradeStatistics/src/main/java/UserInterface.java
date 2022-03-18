
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Grade grade;

    public UserInterface(Scanner scanner, Grade grade) {
        this.scanner = scanner;
        this.grade = grade;
    }

    public void start() {
        System.out.println("Enter points total, -1 stops:");
        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                grade.print();
                break;
            } else {
                grade.addGrade(input);
            }
            
        }
    }
}
