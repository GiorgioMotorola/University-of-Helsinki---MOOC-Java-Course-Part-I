
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");

    }

    public static void printSquare(int size) {
        for (int counter = 1; counter <= size; counter++) {
            printStars(size);
            System.out.print("");
        }
        
    }

    public static void printRectangle(int width, int height) {
        int star = 0;
        while(star <= width) {
            printStars(width);
            star++;
            if(star == height) {
                break;
            }
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
            System.out.print("");
        }
    }
}
