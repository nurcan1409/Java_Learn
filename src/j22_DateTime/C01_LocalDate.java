package j22_DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate bugün=LocalDate.now();// sıstemden bugunun yıl ay gun degerını atama yapar
        System.out.println(bugün);
        System.out.println(bugün.getYear());
        System.out.println(bugün.getMonthValue());
        System.out.println(bugün.getMonth());
        System.out.println(bugün.getDayOfYear());
        System.out.println(bugün.getDayOfMonth());
        System.out.println(bugün.getDayOfWeek());

LocalDate date1=LocalDate.of(1923,10,20);
LocalDate DATE2=LocalDate.of(1923, Month.OCTOBER,29);
// verılen bır tarıhın oncesı ve sonrası gıtme....//mınus once tarıh plus sonra tarıh
        System.out.println(date1.plusDays(12));
        System.out.println(date1.plusMonths(3));
        System.out.println(bugün.plusWeeks(6));
        System.out.println(bugün.minusMonths(5));
        bugün.plusDays(43).minusMonths(2).plusWeeks(3).minusYears(2);


    }
}
