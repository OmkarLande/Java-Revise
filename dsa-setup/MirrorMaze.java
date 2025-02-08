import java.util.*;

public class MirrorMaze {

    static int M, N;
    static char[][] grid;
    static boolean[][][] visited;
    static int maxCells = 0;

    // Directions: up, right, down, left
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input grid dimensions
        M = sc.nextInt();
        N = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Initialize grid
        grid = new char[M][N];
        for (int i = 0; i < M; i++) {
            String line = sc.nextLine();
            grid[i] = line.replace(" ", "").toCharArray();
        }

        // Visited array: visited[x][y][direction]
        visited = new boolean[M][N][4];

        // Explore the grid
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                for (int d = 0; d < 4; d++) {
                    if (!visited[i][j][d]) {
                        explore(i, j, d);
                    }
                }
            }
        }

        // Output the maximum number of cells in a loop
        System.out.println(maxCells);
    }

    // Explore the grid from a starting cell and direction
    static void explore(int x, int y, int dir) {
        Set<String> path = new HashSet<>();
        int cells = 0;
        int startX = x, startY = y, startDir = dir;

        while (true) {
            if (x < 0 || x >= M || y < 0 || y >= N || grid[x][y] == '0') {
                // Out of bounds or empty cell
                return;
            }

            String Item = x + "," + y + "," + dir;
            if (path.contains(Item)) {
                // Loop detected
                maxCells = Math.max(maxCells, cells);
                return;
            }

            if (visited[x][y][dir]) {
                // Already visited in this direction
                return;
            }

            // Mark current Item as visited
            visited[x][y][dir] = true;
            path.add(Item);
            cells++;

            // Reflect direction based on the mirror type
            if (grid[x][y] == '/') {
                dir = reflectSlash(dir);
            } else if (grid[x][y] == '\\') {
                dir = reflectBackslash(dir);
            }

            // Move to the next cell
            x += dx[dir];
            y += dy[dir];
        }
    }

    // Reflect direction for '/' mirror
    static int reflectSlash(int dir) {
        if (dir == 0) return 1; // up -> right
        if (dir == 1) return 0; // right -> up
        if (dir == 2) return 3; // down -> left
        return 2; // left -> down
    }

    // Reflect direction for '\\' mirror
    static int reflectBackslash(int dir) {
        if (dir == 0) return 3; // up -> left
        if (dir == 1) return 2; // right -> down
        if (dir == 2) return 1; // down -> right
        return 0; // left -> up
    }
}
