
public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maxHeartRate = 0;
        double sum = 0;
        maxHeartRate = 206.3 - (0.711 * age);
        sum = (maxHeartRate - restingHeartRate) * (percentageOfMaximum) + restingHeartRate;

        return sum;
    }

}