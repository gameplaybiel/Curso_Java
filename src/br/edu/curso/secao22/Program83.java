package br.edu.curso.secao22;

import java.time.*;
import java.time.format.DateTimeFormatter;

/*
Datas

*/
public class Program83 {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today); // Formato ISO (Internacional)

        LocalDate new_year = LocalDate.of(2023, Month.JANUARY, 1);
        System.out.println(new_year); // Formato ISO (Internacional)

        int year = new_year.getYear();
        Month month = new_year.getMonth();
        int day = new_year.getDayOfMonth();

        System.out.println("O ano novo será em " + day + " de " + month + " de " + year);

        Period period = Period.between(today, new_year);
        System.out.println(period);

        System.out.println("Faltam " + period.getYears() + " anos " + period.getMonths() + " meses e " + period.getDays() + " dias");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(today.format(formatter));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); //Formato ISO (Internacional)

        DateTimeFormatter formatter_hours = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(now.format(formatter_hours));

        LocalTime breakTime = LocalTime.of(9, 30);
        System.out.println(breakTime);
    }
}
