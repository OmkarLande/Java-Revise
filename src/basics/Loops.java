package basics;

public class Loops {
    public static void main(String[] args) {
        // Loops
        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop: " + i);
        }

        // While loop
        int i = 0;
        while (i < 5) {
            System.out.println("While loop: " + i);
            i++;
        }

        // Do-while loop
        i = 0;
        do {
            System.out.println("Do-while loop: " + i);
            i++;
        } while (i < 5);

        // Break & continue statement
        for (int j = 0; j < 5; j++) {
            if (j == 2) {
                continue;
            }
            if (j == 4) {
                break;
            }
            System.out.println("Break & continue: " + j);
        }

        // Nested loops
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                System.out.println("Nested loops: " + k + " " + l);
            }
        }

        // Enhanced for loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Enhanced for loop: " + number);
        }

        // Labelled break & continue statement
        outer: for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                if (m == 1) {
                    continue outer;
                }
                if (n == 1) {
                    break outer;
                }
                System.out.println("Labelled break & continue: " + m + " " + n);
            }
        }
    }
}
