/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int i = 0;
        System.out.println("(0, 0)");
        while (Math.abs(x) + Math.abs(y) != r) {
            double prob1 = Math.random();
            if (prob1 < 0.25) x++;
            else if (prob1 < 0.5) x--;
            else if (prob1 < 0.75) y++;
            else y--;
            System.out.println("(" + x + ", " + y + ")");
            i++;
        }
        System.out.println("steps = " + i);
    }
}
