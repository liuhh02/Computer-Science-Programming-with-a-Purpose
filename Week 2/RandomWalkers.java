/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double n = trials;
        int sum = 0;
        for (int j = 0; j < trials; j++) {
            int x = 0;
            int y = 0;
            int i = 0;
            while (Math.abs(x) + Math.abs(y) != r) {
                double prob1 = Math.random();
                if (prob1 < 0.25) x++;
                else if (prob1 < 0.5) x--;
                else if (prob1 < 0.75) y++;
                else y--;
                i++;
            }
            sum += i;
        }
        double dsum = sum;
        double avg = dsum / n;
        System.out.println("average number of steps = " + avg);

    }
}
