package task1;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

Scanner scan =new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı giriniz:");
        int sayı = scan.nextInt();
        int birler= sayı%10;//sayının 1 ler basamağı
        sayı/=10;
        int onlar=sayı%10;
        int yüzler=sayı/10;
        System.out.println("girdiğiniz sayının birler basamağı:"+birler+"\nGirdiginiz sayının onlar basamağı:"+onlar+"\ngirdiğiniz sayının yüzler basamağı:"+yüzler);









    }
}
