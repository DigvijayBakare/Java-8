package OtherAPIs;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTimeAPI {
    public static void localTimeAPI() {
        LocalDate date = LocalDate.now();                       // will give us current date
        System.out.println("The current date is " + date);

        LocalTime time = LocalTime.now();                       // will give us current time
        System.out.println("Current time is " + time);

        LocalDateTime dateTime = LocalDateTime.now();           // will give us both current date and time
        System.out.println("Current date and time is " + dateTime);

        // printing date and time in particular format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        String formatedDateTime = dateTime.format(formatter);
        System.out.println("The date and time in formatted manner: " + formatedDateTime);

        // printing months, day, hours and seconds
        Month month = dateTime.getMonth();
        int day = dateTime.getDayOfMonth();
        int hours = dateTime.getHour();
        int seconds = dateTime.getSecond();
        System.out.println("Month: " + month + "\tDay: " + day + "\tHour: " + hours + "\tSeconds: " + seconds);

        // printing specified date
        LocalDate dateS = LocalDate.of(1950, 1, 26);
        System.out.println("The Republican day: " + dateS);

        // printing specific date with current timing
        LocalDateTime speDate = dateTime.withDayOfMonth(2).withYear(2024);
        System.out.println("The specific date with current time: " + speDate);
    }

    public static void zonedDateTime() {
        ZonedDateTime currentZone = ZonedDateTime.now();                  // will get current zone
        System.out.println("The current zone is " + currentZone);

        // for getting time zone of specific place we use withZoneSameInstant(): it is used to return the copy of this date-time
        // with a different time zone, retaining the instant
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
        System.out.println("Tokyo time zone is " + tokyoZone);

        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        String formatted = tokyoZone.format(formatDateTime);
        System.out.println("Formatted Tokyo time zone: " + formatted);
    }

    public static void periodAndDuration() {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);
        Period gap = Period.between(date2, date1);                                  // for finding the gap between to dates
        System.out.println("The gap between " + date2 + " and " + date1 + " is " + gap);

        // similarly we can calculate the gap between 2 times
        LocalTime time1 = LocalTime.now();
        System.out.println("Current time is " + time1);
        Duration hrs = Duration.ofHours(5);
        LocalTime time2 = time1.plus(hrs);              // adding 5 hrs to the current time
        System.out.println("New time after adding 5 hrs of duration: " + time2);

        // calculate the gap
        Duration timeGap = Duration.between(time2, time1);
        System.out.println("The duration gap between " + time2 + " and " + time1 + " is " + timeGap);
    }

    public static void main(String[] args) {
//        localTimeAPI();
//        zonedDateTime();
        periodAndDuration();
    }
}
