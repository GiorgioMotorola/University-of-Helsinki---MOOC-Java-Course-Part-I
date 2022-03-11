
public class Cube {
    private int edgeLength;
    
    public Cube (int edgeLength) {
        this.edgeLength = edgeLength;
    } //con
    
    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    } // method 1
    
    public String toString() {
        return "The length of the edge is " + edgeLength +  " and the volume " + volume();
    }
}
