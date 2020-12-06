/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int sum = 0;
        int[] s = new int[args.length + 1];
        for (int i = 1; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        // System.out.println("sum is " + sum);
        s[0] = 0;
        for (int i = 1; i < args.length; i++) {
            s[i] = Integer.parseInt(args[i]) + s[i - 1];
        }
        s[args.length] = s[args.length - 1] + 1;
        for (int i = 0; i < m; i++) {
            double rand = sum * Math.random();
            int randi = (int) rand;
            // System.out.println("random number is " + randi);
            for (int j = 0; j < args.length; j++) {
                if (randi >= s[j] && randi < s[j + 1]) {
                    System.out.print(j + 1 + " ");
                    break;
                }
            }
            // System.out.println("random number is " + randi);
            // System.out.print(randi + " ");
        }
        System.out.println();
    }
}
