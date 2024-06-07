package basics;

public class Arrays {
    public static void main(String[] args) {
        // Arrays
        // Single-dimensional array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println("Single-dimensional array: " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3] + " " + numbers[4]);
        System.out.println(numbers.length);

        // Multi-dimensional array
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        System.out.println("Multi-dimensional array: " + matrix[0][0] + " " + matrix[0][1] + " " + matrix[1][0] + " " + matrix[1][1]);

        // Enhanced for loop
        int[] randomNumbers = {1, 2, 3, 4, 5};
        for (int number : randomNumbers) {
            System.out.println("Enhanced for loop: " + number);
        }

        // Array of objects
        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            System.out.println("Array of objects: " + name);
        }
    }
}
