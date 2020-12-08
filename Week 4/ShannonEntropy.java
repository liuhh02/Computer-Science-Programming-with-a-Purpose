/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] arr = new int[m];
        double count = 0.0;
        double entropy = 0.0;
        while (!StdIn.isEmpty()) {
            int k = StdIn.readInt();
            arr[k - 1] += 1;
            count++;
        }
        for (int i = 0; i < m; i++) {
            if (arr[i] != 0) {
                double prop = arr[i] / count;
                entropy -= prop * (Math.log(prop) / Math.log(2));
            }
        }
        StdOut.printf("%.4f\n", entropy);
    }
}
