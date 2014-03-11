package nl.sogeti.jct.java8party;

import java.util.Calendar;

/**
 * Calculates when the next friday the 13th will be.
 * <p/>
 * Using the Calendar class is a bit hard and ugly because of all the constants.
 * <p/>
 * How can this be done using the new Date Time API from Java SE 8?
 */
public class NextFriday13th7 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        if (calendar.get(Calendar.DAY_OF_MONTH) > 13) {
            calendar.add(Calendar.MONTH, 1);
        }
        calendar.set(Calendar.DAY_OF_MONTH, 13);
        while (!(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY)) {
            calendar.add(Calendar.MONTH, 1);
        }

        System.out.println(calendar);
    }

}
