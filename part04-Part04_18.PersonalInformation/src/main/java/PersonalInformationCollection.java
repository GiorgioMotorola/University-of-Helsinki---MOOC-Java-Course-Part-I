
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name: ");
            String first = scanner.nextLine();
            if (first.isEmpty()) {
                break;
            }
            System.out.println("Last name: ");
            String last = scanner.nextLine();

            System.out.println("Identification number: ");
            String id = scanner.nextLine();

            infoCollection.add(new PersonalInformation(first, last, id));
        } //while

        for (PersonalInformation i : infoCollection) {
            System.out.println(i.getFirstName() + " " + i.getLastName());

        }

    }
}
