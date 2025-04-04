package unit9;

public class LeapYearChecker {

    private  int year;

    public LeapYearChecker() {
    }
    public LeapYearChecker(int year) {
        this.year = year;
    }


    public int getYear() {
       return this.year;
    }


    void isLeapYear(int year) {
        // is leap year when:
        // year is dividable by 4
        // year is not dividable by 100 is not leap
        // but if it's dividable by 400 it is leap
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        if (isLeapYear)  {
            System.out.println("Given year is leap.");
        } else {
            System.out.println("Given year is not leap.");
        }
    }
}
