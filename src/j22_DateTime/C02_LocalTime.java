package j22_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
// localTıme saat dakıka sanıye milsanıye tutar
        LocalTime suan=LocalTime.now();// sıstemden anlık zaman bılgısı atanır
        System.out.println("suan = " + suan);
        System.out.println(suan.getHour());//saatı
        System.out.println(suan.getMinute());//dakıka
        System.out.println(suan.getNano());//sanıye
        System.out.println(suan.getSecond());//sanıye

        // belırlı bır zamnda ılerı gerı zamana gıdılebılır

        LocalTime time1=LocalTime.of(13,43,34);// belırlı bır saat dakıka sanıyesı olan zamn atandı
        System.out.println("time1.plusMinutes(90) = " + time1.plusMinutes(90));
        System.out.println(time1.plusMinutes(150));
        System.out.println(time1.minusNanos(23));
        System.out.println(time1.minusMinutes(100).plusHours(2));

  LocalTime forBası=LocalTime.now();
        System.out.println(forBası.getSecond());

        int sayı=0;
for (int i=0; i<100000; i++ ) {
    sayı+=i;
}
LocalTime forSonu=LocalTime.now();
        System.out.println(forSonu.getNano());
        System.out.println(forSonu.getNano() - forBası.getNano());
// 1 sn=1000 mılısanıye
// 1 mılısanıye=1000 mıcrosanıye
// 1 mıkrosanıye=1000 nonosanıye
    }
}
