package HalukJava.j10_StringManipulations;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
      String diller=("arapca,ingilizce,almanca");
      if(diller.contains("turkce")) {
          System.out.println("turkce bılıyorsunz");
      }
      if(true) {
          System.out.println("ingilizce biliyorsunz");
      }
String cinsiyet=("E");
      int yas= 25;
      if ( yas >=20 && cinsiyet==("E")) {
          System.out.println("askere gıdebılırsınz");
          System.out.println("cinsiyet:" +cinsiyet);
          System.out.println("yas:" +yas);

      }
        Scanner scan = new Scanner(System.in);

        System.out.println("işlem secınız");
        String secım= scan.next();
        System.out.println("ilk sayıyı gırınız");
        int sayı1= scan.nextInt();
        System.out.println("ıkıncı sayıyı gırınız");
        int sayı2= scan.nextInt();
        System.out.println(sayı1+sayı2);

        if(secım.equals("+")) {
            System.out.println("toplam:" +sayı1+sayı2);
        }
        if(secım.equals("*")) {
            System.out.println("çarpım:" +sayı1*sayı2);
        }


















    }
}
