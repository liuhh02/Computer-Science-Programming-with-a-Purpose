/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // n is the no. of days
        int trials = Integer.parseInt(args[1]);
        double[] countarr = new double[n + 2];
        for (int i = 0; i < trials; i++) {
            boolean found = false;
            boolean[] twin = new boolean[n];
            int count = 0;
            while (!found) {
                double birthday = n * Math.random();
                int bday = (int) birthday;
                if (twin[bday]) {
                    found = true;
                    countarr[count] += 1.0;
                }
                else {
                    twin[bday] = true;
                    count++;
                }
            }

        }
        double frac = 0.0;
        int i = 0;
        while (frac < 0.5) {
            double dtrials = trials;
            frac += countarr[i] / dtrials;
            System.out.print(i + 1 + "\t" + (int) countarr[i] + "\t" + frac);
            System.out.println();
            i++;
        }
    }
}

