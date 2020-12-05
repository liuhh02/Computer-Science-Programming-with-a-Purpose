/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++) { // i is the row no.
            for (int j = 0; j < n; j++) { // j is the col no.
                if (Math.abs(j - i) > width) System.out.print("0  ");
                else System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
