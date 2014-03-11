package nl.sogeti.jct.java8party;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Using the new Date Time API we get a more fluent code.
 * <p/>
 * The lambda expression of the TemporalAdjuster could also be written as a class to reuse.
 */
public class NextFriday13th8 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        LocalDate nextFriday13th = now.with(temporal -> {
            LocalDate localDate = LocalDate.from(temporal);
            if (localDate.getDayOfMonth() > 13) {
                localDate = localDate.plusMonths(1);
            }
            localDate = localDate.withDayOfMonth(13);
            while (!localDate.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
                localDate = localDate.plusMonths(1);
            }
            return localDate;
        });

        System.out.println(nextFriday13th);
    }

}
