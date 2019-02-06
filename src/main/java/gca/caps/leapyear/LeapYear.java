package gca.caps.leapyear;

public class LeapYear {
    public boolean isLeap(int year) {


        return isTypicalLeapYear(year) && (!isAtypicalCommonYear(year) || isAtypicalLeapYear(year));

    }

    private boolean isAtypicalLeapYear(int year) {
        return year % 400 == 0;
    }

    private boolean isAtypicalCommonYear(int year) {
        return year % 100 == 0;
    }

    private boolean isTypicalLeapYear(int year) {
        return year % 4 == 0;
    }
}
