package j11_MethodCreation;

import java.util.Scanner;

public class Ex_223 {
    public static void main(String[] args) {

//Kullaniciya kac sayi toplamak istedigini sorun.
//Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
//Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
//2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("kac tane sayı gıreceksınız");
        int sayı = scan.nextInt();
         if(sayı<2) {
             System.out.println("en az ıkısayı gırınız");
         }else if(sayı==3) {
             System.out.println();
         }else if(sayı==4) {
             System.out.println();
         }


    }





}
