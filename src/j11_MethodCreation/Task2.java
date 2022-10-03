package j11_MethodCreation;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("adınızı gırınız");
        String ad = scan.next();
        System.out.println("soyadınızı gırınız");
        String soyad = scan.next();
        isimKontrol(ad, soyad);


    }

    private static void isimKontrol(String ad, String soyad) {
        ad = ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase();
        soyad = soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();
        System.out.println(ad + " " + soyad);
    }



    }


