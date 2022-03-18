
public class Bird {

    private String name;
    private String latinName;
    private int observation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public Bird(String name, String latinName, int observation) {
        this.name = name;
        this.latinName = latinName;
        this.observation = observation;

    }

    public String getName() {
        return this.name;
    }

    public void Observation() {
        this.observation++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observation + " observations";
        
    }
}
