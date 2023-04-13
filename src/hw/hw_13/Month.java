package hw.hw_13;

public final class Month {

    private final String monthName;

    private final int days;

    private final int workDays;


    public Month(String monthName, int days, int workDays) {
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
