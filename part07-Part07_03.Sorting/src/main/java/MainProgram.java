
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {6, 5, 8, 7, 11};
        int[] numbersFrom = {-1, 6, 9, 8, 12};
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        System.out.println(MainProgram.indexOfSmallestFrom(numbersFrom, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbersFrom, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbersFrom, 2));

        int[] numbersSwap = {3, 2, 5, 4, 8};
        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(array));
        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(array));

        int[] numbersSort = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbersSort);

    } // end of main method

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < indexOfSmallest) {
                indexOfSmallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int indexOfSmallest = table[index];

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < indexOfSmallest) {
                indexOfSmallest = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] numbersSwap, int index1, int index2) {
        int temp = numbersSwap[index1];
        numbersSwap[index1] = numbersSwap[index2];
        numbersSwap[index2] = temp;

    }

    public static void sort(int[] numbersSort) {
        int index = 0;
        System.out.println(Arrays.toString(numbersSort));
        
        while (index < numbersSort.length) {
            swap(numbersSort, index, indexOfSmallestFrom(numbersSort, index));
            System.out.println(Arrays.toString(numbersSort));
            
            index += 1;
        } //while

    }

} // end of class
