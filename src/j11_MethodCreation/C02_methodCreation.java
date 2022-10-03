package j11_MethodCreation;

import java.util.Scanner;

public class C02_methodCreation {
    public static void main(String[] args) {
        //gırılen  ıkı sayının esıtlıgını kontrol eden method create edınız

      Scanner scan = new Scanner(System.in)  ;
        System.out.println("1.sayıyı gırınız");
        int sayı1= scan.nextInt();
        System.out.println("2.sayıyı gırınız");
        int sayı2=scan.nextInt();
        System.out.println(esıtkontrol(20, 30));
        System.out.println(esıtkontrol(30, 30));
        System.out.println(esıtkontrol(40, 50));
    }

    public static boolean esıtkontrol(int sayı1, int sayı2) {
        boolean esıtmı;
        if(sayı1==sayı2) {
            System.out.println(true);
        }else System.out.println(false);
       return sayı1==sayı2;
    }
}