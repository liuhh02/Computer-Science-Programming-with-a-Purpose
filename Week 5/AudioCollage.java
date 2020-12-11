/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class AudioCollage {
    public static double[] amplify(double[] a, double alpha) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * alpha;
        }
        return b;
    }

    public static double[] reverse(double[] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[a.length - i - 1] = a[i];
        }
        return b;
    }

    public static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        return c;
    }

    public static double[] mix(double[] a, double[] b) {
        if (a.length == b.length) {
            double[] c = new double[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] + b[i];
            }
            return c;
        }
        else if (a.length < b.length) {
            double[] c = new double[b.length];
            double[] d = new double[b.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i];
            }
            for (int i = 0; i < b.length; i++) {
                d[i] = c[i] + b[i];
            }
            return d;
        }
        else {
            double[] c = new double[a.length];
            double[] d = new double[a.length];
            for (int i = 0; i < b.length; i++) {
                c[i] = b[i];
            }
            for (int i = 0; i < a.length; i++) {
                d[i] = a[i] + c[i];
            }
            return d;
        }
    }

    public static double[] changeSpeed(double[] a, double alpha) {
        double samples = (a.length / alpha);
        int samp = (int) samples;
        double[] b = new double[samp];
        for (int i = 0; i < samp; i++) {
            b[i] = a[(int) (i * alpha)];
        }
        return b;
    }

    public static void main(String[] args) {
        double[] sample1 = StdAudio.read("cow.wav");
        double[] sample2 = StdAudio.read("silence.wav");
        double[] sample3 = StdAudio.read("piano.wav");
        double[] sample4 = StdAudio.read("harp.wav");
        double[] sample5 = StdAudio.read("chimes.wav");
        double[] edit1 = amplify(sample1, 0.5);
        double[] edit2 = reverse(sample3);
        double[] edit3 = merge(edit1, sample4);
        double[] edit4 = changeSpeed(sample5, 1.2);
        double[] edit5 = mix(edit2, edit4);
        double[] edit6 = merge(edit3, edit5);
        double[] edit7 = merge(edit6, sample2);
        StdAudio.play(edit7);
    }
}
