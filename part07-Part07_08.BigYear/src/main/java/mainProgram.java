
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       Scanner scanner = new Scanner(System.in);
        BirdDatabase birdDataList = new BirdDatabase();
        
        UserInterface userInterface = new UserInterface(scanner, birdDataList);
        
        
        userInterface.Start();
    }

}
