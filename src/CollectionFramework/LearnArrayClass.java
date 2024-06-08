package CollectionFramework;
import java.util.Arrays;
public class LearnArrayClass {
    public static void main(String[] args) {
        //Binary Search
        // Array must be sorted
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("Index of 5 is: " + index);

        //sort
        Integer[] numbers2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Arrays.sort(numbers2);
        //print array
        for(int i: numbers2){
            System.out.print(i + " ");
        }

        Arrays.fill( numbers2, 2, 5, 10);
        //print array
        for(int i: numbers2){
            System.out.print(i + " ");
        }
    }
}
