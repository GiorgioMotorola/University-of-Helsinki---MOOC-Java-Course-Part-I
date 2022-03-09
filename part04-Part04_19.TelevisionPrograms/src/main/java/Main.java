
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;

            } //if

            System.out.println("Duration: ");
            int dur = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(name, dur));
        } //while
        System.out.println("Program's maximum duration? ");
        int input = scanner.nextInt();
        
        for(TelevisionProgram tv :programs) 
            if(tv.getDuration() <= input) {
                System.out.println(tv);
            }

    }

}
