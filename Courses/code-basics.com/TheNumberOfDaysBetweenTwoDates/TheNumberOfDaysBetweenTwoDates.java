/*
Напишем код в стиле "повтори за учителем". 
Рассчитаем количество дней между двумя датами используя встроенные возможности Java. 
Попробуйте "поиграть" с датами.
 */

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class TheNumberOfDaysBetweenTwoDates {
    public static void main(String[] args) {
        // BEGIN (write your solution here)
        System.out.println("Количество дней между двумя датами");

        // С даты
        LocalDate dateFrom = LocalDate.of(2025, Month.JANUARY, 1);
        // По дату
        LocalDate dateTo = LocalDate.of(2025, Month.OCTOBER, 9);
        
        // Количество дней между этими датами
        System.out.print("Количество дней между " + dateFrom + " и " + dateTo + ": ");
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);
        // END

    }
}
