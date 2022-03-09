
public class Gauge {
    private int value;
    
    public void increase() {
        if (this.value < 5) {
            this.value = this.value + 1;
        }
    } // method 2
    public void decrease() {
        if (this.value > 0) {
            this.value = this.value - 1;
        }
    } // method 3
    public int value() {
        return this.value;
    } //method 4
    
    public boolean full() {
        while (value == 5) {
            return true;
        }
        return false;
    }
    
    
    
} //end
