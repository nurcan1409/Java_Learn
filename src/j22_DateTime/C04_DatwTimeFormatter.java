package j22_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DatwTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime ltd=LocalDateTime.now();
        System.out.println("ltd = " + ltd);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd//MMM//YY");// gun ay ısmı ve yıl format tanımlandı
        System.out.println("dtf.format(ltd) = " + dtf.format(ltd));//25 ekım 2022
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("hh:mm:ss a");//saat dakıka ve sanıye am format tanımlandı
        System.out.println("dtf1.format(ltd) = " + dtf1.format(ltd));
    }
}
