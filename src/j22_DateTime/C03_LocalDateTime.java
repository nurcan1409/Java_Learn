package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        // LocalDateTime -> tarih(yıl ay gun) ve zaman (saat dakika saniye mlsn)  bilgilerini tutar

      LocalDateTime ldt=LocalDateTime.now();
        System.out.println("ldt = " + ldt);//2022-10-26   15:19:44.09999
        LocalDate d=LocalDate.of(2016,3,13); // TARIH ATAMASI
        LocalTime t=LocalTime.of(14,45,35);// ZAMAN ATAMASI

        LocalDateTime trhzamn=LocalDateTime.of(d,t);
        System.out.println("trhzamn = " + trhzamn);

LocalDateTime ldt1=LocalDateTime.of(2018, Month.MAY,19,20,30);
        System.out.println("ldt1 = " + ldt1);
        System.out.println("trhzamn.getDayOfMonth() = " + trhzamn.getDayOfMonth());
        System.out.println("trhzamn.getDayOfWeek() = " + trhzamn.getDayOfWeek());
        System.out.println("trhzamn.getHour() = " + trhzamn.getHour());
        System.out.println("trhzamn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72) = " + trhzamn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72));

    }








}
