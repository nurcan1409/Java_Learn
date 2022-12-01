package j22_DateTime;

import java.time.LocalDate;

public class C07_ComparingDataTime {
    public static void main(String[] args) {
        LocalDate bugün=LocalDate.now();
        LocalDate falangün=bugün.minusDays(24);
        LocalDate nurcandogumgunu=LocalDate.of(1988,1,6);
        System.out.println("bugün = " + bugün);
        System.out.println("falangün = " + falangün);

        LocalDate fesmekangun=bugün.plusDays(3);
        System.out.println("bugün = " + bugün);
        System.out.println("fesmekangun = " + fesmekangun);
        //TRICK> is ıle baslayan methodlar boolean return eder
        System.out.println("bugün.isBefore(falangün) = " + bugün.isBefore(falangün));
        System.out.println("bugün.isBefore(fesmekangun) = " + bugün.isBefore(fesmekangun));
        System.out.println("falangün.isBefore(fesmekangun) = " + falangün.isBefore(fesmekangun));
        System.out.println("bugün.isAfter(falangün) = " + bugün.isAfter(falangün));
        System.out.println("falangün.isAfter(fesmekangun) = " + falangün.isAfter(fesmekangun));
        System.out.println("bugün.isLeapYear() = " + bugün.isLeapYear());

       int fark= bugün.compareTo(falangün);
        System.out.println("fark = " + fark);
       int fark1= falangün.compareTo(fesmekangun);
        System.out.println("fark1 = " + fark1);

        System.out.println("bugün.compareTo(nurcandogumgunu) = " + bugün.compareTo(nurcandogumgunu));
        //2022.10.27 > 1988 5 06 yı karsılastırdı


/*     ComperaTo komutu işlevi:
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */

    }
}
