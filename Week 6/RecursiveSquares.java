/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RecursiveSquares {
    public static void drawSquare(double x, double y, double length) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, 0.5 * length);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(x, y, 0.5 * length);
    }

    public static void draw(int n, double x, double y, double length) {
        if (n == 0) return;
        draw(n - 1, x - length / 2, y + length / 2, length / 2);
        draw(n - 1, x + length / 2, y + length / 2, length / 2);
        drawSquare(x, y, length);
        draw(n - 1, x - length / 2, y - length / 2, length / 2);
        draw(n - 1, x + length / 2, y - length / 2, length / 2);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        draw(n, 0.5, 0.5, 0.5);
    }
}
