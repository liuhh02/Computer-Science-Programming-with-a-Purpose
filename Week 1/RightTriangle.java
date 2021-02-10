/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int third = Integer.parseInt(args[2]);
        boolean isPositive;
        isPositive = (first > 0) && (second > 0) && (third >= 0);
        boolean correct;
        correct = isPositive && (first * first + second * second == third * third
                || first * first + third * third == second * second
                || third * third + second * second == first * first);
        System.out.println(correct);
    }
}
