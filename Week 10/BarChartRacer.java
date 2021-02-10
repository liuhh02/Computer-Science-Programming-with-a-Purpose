/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Arrays;

public class BarChartRacer {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(1000, 700);
        StdDraw.enableDoubleBuffering();

        String fileName = args[0];
        int k = Integer.parseInt(args[1]);
        In in = new In(fileName);
        String title = in.readLine();
        String xAxis = in.readLine();
        String source = in.readLine();
        in.readLine();

        BarChart chart = new BarChart(title, xAxis, source);
        while (in.hasNextLine()) {
            int n = Integer.parseInt(in.readLine());
            Bar[] bars = new Bar[n];
            String year = "";
            for (int i = 0; i < n; i++) {
                String record = in.readLine();
                String[] recordarr = record.split(",");
                year = recordarr[0];
                String name = recordarr[1];
                int value = Integer.parseInt(recordarr[3]);
                String category = recordarr[4];
                bars[i] = new Bar(name, value, category);
            }
            Arrays.sort(bars);
            chart.setCaption(year);
            for (int i = bars.length - 1; i > bars.length - 1 - k; i--) {
                chart.add(bars[i].getName(), bars[i].getValue(), bars[i].getCategory());
            }
            StdDraw.clear();
            chart.draw();
            StdDraw.show();
            StdDraw.pause(100);
            chart.reset();
            in.readLine();
        }
        chart.reset();
    }
}
