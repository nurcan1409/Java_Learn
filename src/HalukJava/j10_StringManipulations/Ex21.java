package HalukJava.j10_StringManipulations;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

      String isim="hamza";
        System.out.println(isim);
        System.out.println(isim.length());
        String ad="nur";
        String meslek="ascı";
        System.out.println(ad.concat(meslek));
       String diller=("ingilizce,almanca,arapca");
        System.out.println(diller.contains("ali"));
        System.out.println(diller.charAt(5));

        Scanner scan= new Scanner(System.in);
        System.out.println("bır mail adresı gırınız");
        String eposta=scan.nextLine();
        String gmail= "@gmail.com";
        System.out.println(gmail.contains("gmail?"));

















    }
}
