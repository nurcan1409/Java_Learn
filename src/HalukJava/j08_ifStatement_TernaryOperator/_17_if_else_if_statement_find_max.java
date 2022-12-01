package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */


        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.


        Scanner scan =new Scanner(System.in);
        System.out.println("1.sayıyı gırınız");
        int sayı1=scan.nextInt();
        System.out.println("2.sayıyı gırınız");
        int sayı2=scan.nextInt();
        System.out.println("3.sayıyı gırınız");
        int sayı3=scan.nextInt();
        if((sayı1>sayı2) &&(sayı1>sayı3)) {
            System.out.println("gırmıs oldugunuz en buyuk sayı sayı 1:" +sayı1);

        } else if ((sayı2>sayı1) &&(sayı2>sayı3)) {
            System.out.println("gırmıs oldugunuz en buyuk sayı sayı2" +sayı2);

        }else System.out.println("gırmıs oldugunuz en buyuk sayı sayı3" +sayı3);


    }
}
