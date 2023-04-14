package hw.hw_13;

import java.util.Arrays;

public class MonthUtils {

    final public static Month jan = new Month("jan", 31, 22);
    final public static Month feb = new Month("feb", 28, 22);
    final public static Month mar = new Month("mar", 30, 22);
    final public static Month apr = new Month("apr", 31, 22);
    final public static Month may = new Month("may", 30, 22);
    final public static Month jun = new Month("jun", 31, 22);
    final public static Month jul = new Month("jul", 30, 22);
    final public static Month aug = new Month("aug", 31, 22);
    final public static Month sep = new Month("sep", 30, 22);
    final public static Month oct = new Month("oct", 31, 22);
    final public static Month nov = new Month("nov", 30, 22);
    final public static Month dec = new Month("dec", 31, 22);

    final public static Month[] year = {jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec};

    public static Month[] quartaRet(int numberOfQuartal) {
        if (numberOfQuartal == 1) {
            return Arrays.copyOfRange(year, 0, 3);
        } else if (numberOfQuartal == 2) {
            return Arrays.copyOfRange(year, 3, 6);
        } else if (numberOfQuartal == 3) {
            return Arrays.copyOfRange(year, 6, 9);
        } else if (numberOfQuartal == 4) {
            return Arrays.copyOfRange(year, 9, 12);
        } else {
            return null;
        }
    }

    public static Month[] halfyearRet(int numberOfhalfYear) {
        if (numberOfhalfYear == 1) {
            return Arrays.copyOfRange(year, 0, 6);
        } else if (numberOfhalfYear == 2) {
            return Arrays.copyOfRange(year, 6, 12);
        } else {
            return null;
        }
    }

    public static Month[] yearRet() {
        return year;
    }

    public static final class Month {

        private final String monthName;

        private final int days;

        private final int workDays;


        private Month(String monthName, int days, int workDays) {
            this.monthName = monthName;
            this.days = days;
            this.workDays = workDays;
        }

        public String getMonthName() {
            return monthName;
        }

        public int getDays() {
            return days;
        }

        public int getWorkDays() {
            return workDays;
        }

    }


}
