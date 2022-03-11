
public class HealthStation {
    
    private int weighingsAdd;
    
    public int weigh(Person person) {
        weighingsAdd += 1;
        return person.getWeight();
    }

    public void feed(Person person) {

        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return weighingsAdd;
    }
}
