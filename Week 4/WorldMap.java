/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class WorldMap {
    public static void main(String[] args) {
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0.0, width);
        StdDraw.setYscale(0.0, height);
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int vertices = StdIn.readInt();
            double[] xCoord = new double[vertices];
            double[] yCoord = new double[vertices];
            for (int i = 0; i < vertices; i++) {
                xCoord[i] = StdIn.readDouble();
                yCoord[i] = StdIn.readDouble();
            }
            StdDraw.polygon(xCoord, yCoord);
        }
    }
}
