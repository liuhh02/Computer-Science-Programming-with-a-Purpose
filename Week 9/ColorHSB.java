/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ColorHSB {
    private static final int ANGLE = 360;
    private final int hue, sat, bright;

    public ColorHSB(int h, int s, int b) {
        hue = h;
        sat = s;
        bright = b;
        if (hue < 0 || hue >= ANGLE)
            throw new IllegalArgumentException("the hue must be between 0 and 359");
        if (sat < 0 || sat > 100)
            throw new IllegalArgumentException("the saturation must be between 0 and 100");
        if (bright < 0 || bright > 100)
            throw new IllegalArgumentException("the brightness must be between 0 and 100");

    }

    // Returns a string representation of this color, using the format (h, s, b).
    public String toString() {
        return "(" + hue + ", " + sat + ", " + bright + ")";
    }

    // Is this color a shade of gray?
    public boolean isGrayscale() {
        return (sat == 0 || bright == 0);
    }

    // Returns the squared distance between the two colors.
    public int distanceSquaredTo(ColorHSB that) {
        if (that == null) throw new IllegalArgumentException("please input a color");
        int h1 = that.hue;
        int s1 = that.sat;
        int b1 = that.bright;
        return Math.min((h1 - hue) * (h1 - hue),
                        (ANGLE - Math.abs(h1 - hue)) * (ANGLE - Math.abs(h1 - hue)))
                + (s1 - sat) * (s1
                - sat) + (b1 - bright) * (b1 - bright);
    }

    public static void main(String[] args) {
        int h = Integer.parseInt(args[0]);
        int s = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        ColorHSB color = new ColorHSB(h, s, b);
        ColorHSB bestColor = color;
        int minDist = ANGLE * ANGLE * ANGLE;
        String cbest = "";
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int h2 = StdIn.readInt();
            int s2 = StdIn.readInt();
            int b2 = StdIn.readInt();
            ColorHSB color2 = new ColorHSB(h2, s2, b2);
            if (color.distanceSquaredTo(color2) < minDist) {
                minDist = color.distanceSquaredTo(color2);
                bestColor = color2;
                cbest = name;
            }
        }
        StdOut.println(cbest + " " + bestColor.toString());
    }
}
