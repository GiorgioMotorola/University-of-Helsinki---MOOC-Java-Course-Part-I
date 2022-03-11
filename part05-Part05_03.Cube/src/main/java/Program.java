
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cube testCubeOne = new Cube(4);

        System.out.println(testCubeOne.volume());
        System.out.println(testCubeOne);

        Cube testCubeTwo = new Cube(2);

        System.out.println(testCubeTwo.volume());
        System.out.println(testCubeTwo);
    }
}
