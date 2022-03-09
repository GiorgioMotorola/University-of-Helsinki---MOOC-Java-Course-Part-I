
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        int j = size - 1;
        while (i <= size && j >= 0) {
            printSpaces(j);
            printStars(i);
            i++;
            j--;
        }
    }

    public static void christmasTree(int height) {
        int i = 1;
        int j = height - 1;
        while (i <= height * 2 && j >= 0) {
            printSpaces(j);
            printStars(i);
            i = i + 2;
            j--;
            if (j == -1) {
                printSpaces(height - 2);
                System.out.println("***");
                printSpaces(height - 2);
                System.out.println("***");
            }
        }
    }

    public static void main(String[] args) {
        printSpaces(1);
        System.out.println("");
        printTriangle(1);
        System.out.println("---");
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
