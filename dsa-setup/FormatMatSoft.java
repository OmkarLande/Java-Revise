import java.util.*;

public class FormatMatSoft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        
        int[][][] mat = new int[N][r][c];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    mat[i][j][k] = scanner.nextInt();
                }
            }
        }
        
        //matrix list
        List<Integer> selections = new ArrayList<>();
        while (scanner.hasNextInt()) {
            selections.add(scanner.nextInt());
        }

        //resultting list
        List<Integer> result = new ArrayList<>();
        
        for (int m : selections) {
            m--; //convert to 0-based index
            
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    result.add(mat[m][i][j]);
                }
            }
        }
        
        boolean firstLine = true;
        for (int i = 0; i < result.size(); i++) {
            if (firstLine) {
                System.out.print(result.get(i) + " ");
                if (i == 2) {
                    System.out.println("");
                    firstLine = false;
                }
            } else {
                System.out.print(result.get(i) + " ");
                if ((i + 1) % (c*c) == 0) {
                    System.out.println( "");
                }
            }
        }
        
        scanner.close();
    }
}