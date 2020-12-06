/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] seq = new int[n];
        seq[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) seq[i] = seq[i / 2];
            else seq[i] = 1 - seq[i - 1];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (seq[i] == seq[j]) System.out.print("+  ");
                else System.out.print("-  ");
            }
            System.out.println();
        }
    }
}
