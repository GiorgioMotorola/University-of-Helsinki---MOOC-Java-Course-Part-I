
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private BirdDatabase birdList;

    public UserInterface(Scanner scanner, BirdDatabase birdList) {
        this.scanner = scanner;
        this.birdList = birdList;
    }

    public void Start() {

        boolean end = true;

        while (end) {
            
            
            String input = scanner.nextLine();
            
            if (input.equals("Quit")) {
                System.out.print("? ");
                end = false;
                break;
            }
            
            if (input.equals("Add")) {
                System.out.println("Name ");
                String name = scanner.nextLine();
                
                System.out.println("Name in Latin ");
                String latin = scanner.nextLine();
                
                birdList.addBird(new Bird(name, latin));
            } else if (input.equals("Observation")) {
                String obserAdd = scanner.nextLine();
                birdList.addObservationFromDB(obserAdd);
                
            } else if (input.equals("All")) {
                birdList.printDatabase();
            } else if (input.equals("One")) {
                String one = scanner.nextLine();
                
                birdList.printBird(one);
            }

        }// while
    }
}
