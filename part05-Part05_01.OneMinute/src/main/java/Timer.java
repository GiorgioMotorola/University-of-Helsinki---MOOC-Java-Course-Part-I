
public class Timer {
    private ClockHand hunSecs;
    private ClockHand seconds;
    
    public Timer() {
       this.hunSecs = new ClockHand(100);
       this.seconds = new ClockHand(60);
       
        
    }
    
    public String toString() {
        return this.seconds + ":" + this.hunSecs;
    }
    
    public void advance() {
        this.hunSecs.advance();
        
        if(this.hunSecs.value() == 0) {
            this.seconds.advance();
        }
    }
    
    
}
