
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> person = new ArrayList<>();

    public Room() {
        this.person = new ArrayList<>();
    }

    public void add(Person person) {
        this.person.add(person);
    }

    public boolean isEmpty() {
        boolean isEmpty = false;

        if (this.person.isEmpty()) {
            isEmpty = true;
        }
        return isEmpty;
    }

    public ArrayList<Person> getPersons() {
        return this.person;
    }

    public Person shortest() {
        if (person.isEmpty()) {
            return null;
        }
        Person shortPerson = this.person.get(0);

        for (Person p : person) {
            if (p.getHeight() < shortPerson.getHeight()) {
                shortPerson = p;
            }
        }
        return shortPerson;
    }

    public Person take() {
        if (person.isEmpty()) {
            return null;
        }
        Person shortPerson = shortest();

        this.person.remove(shortPerson);

        return shortPerson;
    }

}
