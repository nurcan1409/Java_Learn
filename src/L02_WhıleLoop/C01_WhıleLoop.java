package L02_WhıleLoop;

import java.util.Scanner;

public class C01_WhıleLoop {
    public static void main(String[] args) {
      /* basalngıc ve bıtıs deegerlerı net(bılınen deger) olan tekrarlarda foor loop ama adım sayısı
      bellı olmayıp bır sarta baglı olan tekrarlarda whıle loop kullanılmalı
       */

// 11 den 20 ye kadar olan olan tamsayıları prınt code create edınız

        for (int i = 11; i < 21; i++) {
            System.out.println(i + " ");
        }
        int basla = 11;//baslangıc degerı
        while (basla < 21) {
            System.out.print(basla + " ");
            basla++;// whıle dongu degısım komutu basla+=1;
        }
// 7 kere javacan prınt eden code create edınız

        int b = 1;
        while (b < 8) {
            System.out.println(b + ".javacan");
            b++;
        } //ikı basamaklı tek sayıları yanyana prınt eden code create edınız
        int a = 11;
        while (a < 100) {
            System.out.print(b + " ");
            b += 2; //her ıkıarttırmada


        }
//gırılen metnı whıle look ıle tersten prınt eden code create edınız
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bır metın gırınız");
        String metin = scan.nextLine();
       // while (metin.length() ) { //metnın uuznlugu son karakterı 0 a esıt ve buyuk ıken

            System.out.println(metin.charAt(metin.length()));

        //gırılen tamsayının faktorıyelını prınt eden code create edınız
int faktorıyel=1;






    }











    }




