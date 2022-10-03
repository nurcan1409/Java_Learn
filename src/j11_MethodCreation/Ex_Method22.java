package j11_MethodCreation;

import javax.swing.*;
import java.util.Scanner;

public class Ex_Method22 {
    public static void main(String[] args) {

/*
  Kullanicidan bir kelime girmesini isteyin.
  * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
  * kelimenin ortasindaki karakteri yazdirin.
  */
        Scanner scan = new Scanner(System.in);
        System.out.println("bır kelıme gırınız");
        String kelıme = scan.next();
        char ortancakrk = kelıme.charAt((kelıme.length() - 1) / 2);
        if (kelıme.length() % 2 == 1 && kelıme.length() >= 3) {

        } else System.out.println("tek sayıda karakter ıceren kelıme gırınız");


// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("isim");
        String isim = sc.nextLine();
        System.out.println("soyisim ");
        String soyisim = sc.nextLine();
        if (isim.length() > soyisim.length()) {
            System.out.println("isminiz soy ismınızden buyuk ");
        }else if (isim.length()==soyisim.length());
        System.out.println("isim ve soyisim esıt");*/


        Scanner s =new Scanner(System.in);
        System.out.println("bır kelıme gırınız");
        String str=s.nextLine();
        int bosluk =str.indexOf(" ");

        if(bosluk ==-1 && !str.isEmpty()) {
            System.out.println("sartlara uygun");
        }else System.out.println("bosluk uygun degıldır");














    }

// Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
// Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.



















}