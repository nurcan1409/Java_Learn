package HalukJava.j10_StringManipulations;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        int sayı = 20;
        if (sayı <= 50) {
            System.out.println("sayı buyuk yada esıt yaz");
        } else {
            System.out.println("sayı kucuk yada esıt yaz");
        }
        String cinsiyet = "K";
        int sayı1 = (-3);
       if(sayı1>0) {
           System.out.println("sayı pozıtıftır");
       } else if (sayı<0) {
           System.out.println("sayı negatıftır");
       } else {
           System.out.println("sayı 0 a esıt");

       }

String gun="pazar";
       if(gun.equals("pazar")) {
           System.out.println("pazar gunundesınz");
       } else if (gun.equals("cumartesı")) {
           System.out.println("cumartesı gunundesınız");
       } else {
           System.out.println("hafta ıcındesınız");
       }
        System.out.println("merhaab");

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen yasınızı gırınız");
        int yas= scan.nextInt();
        System.out.println("lutfen cinsiyetınızı gırınız");
       String cınsıyet= scan.next();
      if(cınsıyet.equalsIgnoreCase("E")) {

          if(yas>=20) {
              System.out.println("askere gıdebılırsınz");
          }
















    } }}