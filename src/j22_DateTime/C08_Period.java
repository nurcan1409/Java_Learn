package j22_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        //Period-> iki tarih arasında geçen tekrarlanabilen zamanı tutar..

        LocalDate bugun=LocalDate.now();

       LocalDate nurcandogumgunu=LocalDate.of(1988,1,6);
       Period fark=Period.between(nurcandogumgunu,bugun);
        System.out.println("fark = " + fark);
        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());// farjk datasının ay bılgısı
        System.out.println("fark.getDays() = " + fark.getDays());// fark datasının gun bılgısı

        System.out.println(" ***");
        System.out.println("bugun = " + bugun);
        Period perıod5gun=Period.ofDays(5);//5gun gunde bır tekrarlayan perıod
Period period7ay=Period.ofMonths(7);// 7 ayda bır tekrarlayn perıod
  Period periodX= Period.ofMonths(7).ofDays(21);//7 ayda bır tekrarlanan perıod
        bugun=bugun.plus(perıod5gun);// bugne 5 gunluk perıod eklendı
        System.out.println("bugun = " + bugun);
        bugun=bugun.minus(period7ay);//bugune 7 aylık perıod gerı gıdıldı
        System.out.println("bugun = " + bugun);
        bugun=bugun.plus(periodX);
        System.out.println("bugun = " + bugun);
// TRICK perıod da coklu tanımlamada sondakı gecerlı olur dıgerlerı ezılır
     //Task> 5.9.2022 de baslayan kur 9 ay olduguna gore bıtıs tarıhını prınt eden code create edınız

LocalDate baslangıc=LocalDate.of(2022,9,5);
        System.out.println("baslangıc = " + baslangıc);
        Period kurssure=Period.ofMonths(9);// kurs suresı 9 ay olarak atandı
        System.out.println("baslangıc.plus(kurssure) = " + baslangıc.plus(kurssure));

        System.out.println("baslangıc.plus(kurssure).format(DateTimeFormatter.ISO_DATE) = " + baslangıc.plus(kurssure).format(DateTimeFormatter.ISO_DATE));
// ISO > Internatıon Organızatıon for Standardızatıon

    }
}
