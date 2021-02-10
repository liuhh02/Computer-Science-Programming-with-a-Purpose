/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Clock {
    private static final int MINUTES_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;
    private int hour, min;

    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m) {
        hour = h;
        min = m;
        if (hour < 0 || hour >= HOURS_PER_DAY || min < 0 || min >= MINUTES_PER_HOUR)
            throw new IllegalArgumentException();
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {
        if (!s.contains(":")) throw new IllegalArgumentException();
        int i = s.indexOf(':');
        String shour = s.substring(0, i);
        String smin = s.substring(i + 1);
        if (shour.length() != 2 || smin.length() != 2) throw new IllegalArgumentException();
        hour = Integer.parseInt(shour);
        min = Integer.parseInt(smin);
        if (hour < 0 || hour >= HOURS_PER_DAY || min < 0 || min >= MINUTES_PER_HOUR)
            throw new IllegalArgumentException();
    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String shour = Integer.toString(hour);
        String smin = Integer.toString(min);
        if (shour.length() == 1) shour = "0" + shour;
        if (smin.length() == 1) smin = "0" + smin;
        return shour + ":" + smin;
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        return (hour < that.hour) || (hour == that.hour && min < that.min);
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        if (min != MINUTES_PER_HOUR - 1) min++;
        else if (hour == HOURS_PER_DAY - 1) {
            hour = 0;
            min = 0;
        }
        else {
            hour++;
            min = 0;
        }
    }

    // Adds Δ minutes to the time on this clock.
    public void toc(int delta) {
        if (delta < 0) throw new IllegalArgumentException();
        int minRepresentation = hour * MINUTES_PER_HOUR + min;
        minRepresentation += delta;
        int newHour = minRepresentation / MINUTES_PER_HOUR;
        int newMin = minRepresentation - MINUTES_PER_HOUR * newHour;
        hour = newHour % HOURS_PER_DAY;
        min = newMin % MINUTES_PER_HOUR;
    }

    public static void main(String[] args) {
        Clock userTime = new Clock(23, 55);
        Clock otherTime = new Clock("08:45");
        StdOut.println(userTime.toString());
        userTime.tic();
        StdOut.println(userTime.toString());
        userTime.toc(15);
        StdOut.println(userTime.toString());
        StdOut.println(userTime.isEarlierThan(otherTime));
        StdOut.println(otherTime.toString());
        otherTime.toc(1441);
        StdOut.println(otherTime.toString());
    }
}
