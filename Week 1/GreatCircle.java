/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double xr1 = Math.toRadians(x1);
        double yr1 = Math.toRadians(y1);
        double xr2 = Math.toRadians(x2);
        double yr2 = Math.toRadians(y2);
        double inparens1 = ((xr2 - xr1) / 2);
        double cosx = (Math.cos(xr1) * Math.cos(xr2));
        double inparens2 = ((yr2 - yr1) / 2);
        double sinsq1 = (Math.sin(inparens1) * Math.sin(inparens1));
        double sinsq2 = (Math.sin(inparens2) * Math.sin(inparens2));
        double sqrt = Math.sqrt(sinsq1 + (cosx * sinsq2));
        double radius = 6371.0;
        double distance = (2 * radius * Math.asin(sqrt));
        System.out.println(distance + " kilometers");
    }
}
