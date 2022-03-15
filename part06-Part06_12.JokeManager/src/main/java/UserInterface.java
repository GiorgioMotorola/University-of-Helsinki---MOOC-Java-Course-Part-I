
import java.util.Scanner;


public class UserInterface {
    private JokeManager jManager; //joke manager
    private Scanner scanner;

    public UserInterface(JokeManager jManger, Scanner scanner) {
        this.jManager = jManger;
        this.scanner = scanner;
    }

    public void start() {

        boolean shouldLoop = true;
        while (shouldLoop) {
            System.out.print("Commands:" + "\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop\n");

            String userInput = scanner.nextLine();

            switch (userInput) {
                case "X":
                    shouldLoop = false;
                    break;
                case "1":

                    System.out.print("Write the joke to be added:");
                    String jokeToAdd = scanner.nextLine();
                    //adds joke to jokemanager / array list
                    jManager.addJoke(jokeToAdd);

                    break;
                case "2":
                    System.out.println(jManager.drawJoke());

                    break;
                case "3":
                    jManager.printJokes();

                    break;
                default:
                    System.out.println("Unknown command");

            }

        }

    }

}
