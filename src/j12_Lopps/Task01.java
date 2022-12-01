package j12_Lopps;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */
Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bır sayı gırınız");


        int sayıToplam=0;
        while (sayıToplam<=333){
            System.out.println("bır sayı gırınız");
            int sayı1=scan.nextInt();
           sayıToplam+=sayı1;
           sayı1++;
            System.out.println("gırılen sayıların toplamı"+sayıToplam);
        }
        System.out.println("gırdıgınız sayılar toplamı 333 ugectı");
















    }
}
