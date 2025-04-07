package unit9;

public class Main {
    public static void main(String[] args) {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        leapYearChecker.isLeapYear(2023);

        LeapYearChecker leapYearChecker1 = new LeapYearChecker(-1);

        boolean isLeapYear = (leapYearChecker1.getYear() % 4 == 0 && leapYearChecker1.getYear() % 100 != 0) || leapYearChecker1.getYear() % 400 == 0 ? true : false;
        System.out.println("Is leap year? -> " + isLeapYear);
    }
}