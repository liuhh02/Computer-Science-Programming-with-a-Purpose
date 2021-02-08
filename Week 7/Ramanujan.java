/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Ramanujan {
    public static boolean isRamanujan(long n) {
        int count = 0;
        int satisfied = 0;
        for (long i = 1; i < Math.cbrt(n); i++) {
            double b = Math.cbrt(n - i * i * i);
            if (Math.floor(b) == b) {
                if (count == 0) {
                    satisfied = (int) b;
                    count++;
                }
                else if (i != satisfied) count++;
                if (count == 2) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        StdOut.println(isRamanujan(n));
    }
}
