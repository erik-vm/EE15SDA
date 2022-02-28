package basic2;

import java.time.*;

public class TimeAndDate {
    public static void main(String[] args) {

        //LocalTime example

        LocalTime localTime = LocalTime.now().withNano(0); //Setting nano to zero, loses milliseconds

        System.out.println("Current time: " + localTime);
        System.out.println(localTime.getHour());
        System.out.println("//"+localTime.getHour()+"//"+localTime.getMinute()+"//");

        localTime = localTime.plusMinutes(15);
        System.out.println("Added 15 min to current time: " + localTime);

        //Date

        LocalDate localDate = LocalDate.now();
        System.out.println("Today is: " + localDate);
        System.out.println("Year: " + localDate.getYear());
        System.out.println("Day of the week: " + localDate.getDayOfWeek());
        System.out.println("Day of the year: " + localDate.getDayOfYear());
        System.out.println("Week of the year: " + ((localDate.getDayOfYear()/7)+1));

        LocalDate localDate1 = LocalDate.of(1988, 6, 5);
        System.out.println(localDate1);

        LocalDate covidStartDate = LocalDate.of(2019, Month.MARCH, 14);
        System.out.println("Fkng covid started: " + covidStartDate);

        System.out.println("Covid has lasted: " + Period.between(localDate, covidStartDate));
        System.out.println("I am " + Period.between(localDate, localDate1) + " old");

        //LocalDateTime

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime);

        LocalDateTime myExactBirthDate = LocalDateTime.of(1988, Month.JUNE, 5, 23, 55);

    }
}
