
import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<Bird> birdList;

    public BirdDatabase() {
        this.birdList = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        birdList.add(bird);
    }

    public void printDatabase() {

        for (Bird e : birdList) {
            System.out.println(e);
        }

    }

    public void printBird(String name) {

        for (Bird e : birdList) {

            if (e.getName().equals(name)) {

                System.out.println(e);
            }
        }
    }

    
    public void addObservationFromDB(String name) {

        for (Bird e : birdList) {
            if (e.getName().toLowerCase().equals(name.toLowerCase())) {

                e.Observation();
            }

        }

    }

}
