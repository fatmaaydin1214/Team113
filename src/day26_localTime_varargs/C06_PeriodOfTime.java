package day26_localTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {
        LocalDate dogumTarihi = LocalDate.of(1984,9,1);
        LocalDate bugun= LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun));
        System.out.println(Period.between(dogumTarihi, bugun).getYears());
        System.out.println(Period.between(dogumTarihi, bugun).getDays());


    }
}
