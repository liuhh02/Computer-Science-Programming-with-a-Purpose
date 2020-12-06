/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int[][] mine = new int[m + 2][n + 2];
        int[][] minenum = new int[m + 2][n + 2];
        int landmines = 0;
        while (landmines < k) {
            double rand = Math.random() * m * n;
            double randx = rand / n;
            int randxd = (int) randx;
            double randy = rand % n;
            int randyd = (int) randy;
            if (mine[randxd + 1][randyd + 1] != 1) {
                mine[randxd + 1][randyd + 1] = 1;
                landmines++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mine[i + 1][j + 1]
                        == 0) { // (1, 1) = (0, 1) + (1, 0) + (1, 2) + (2, 1) + (0, 0) + (2, 2) + (2, 0) + (0, 2)
                    minenum[i + 1][j + 1] = mine[i][j + 1] + mine[i + 1][j] + mine[i + 1][j
                            + 2] + mine[i + 2][j + 1] + mine[i][j] + mine[i + 2][j + 2] + mine[i
                            + 2][j] + mine[i][j + 2];
                }
                else minenum[i + 1][j + 1] = 1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mine[i + 1][j + 1] == 1) System.out.print("*  ");
                else System.out.print(minenum[i + 1][j + 1] + "  ");
            }
            System.out.println();
        }
    }
}
