package j11_MethodCreation;

import java.util.Scanner;

public class Ex_222 {
    public static void main(String[] args) {

/*
 cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
  */
        /*Scanner scan =new Scanner(System.in);
        System.out.println("bır m yı km ye donusturmek ıcın ıstedıgınız sayıyı gırınız");
        double sentimeter=scan.nextDouble();
        System.out.println(meter(sentimeter));
        System.out.println(kılometre(sentimeter));

    }

    public static double meter(double x) {

        return x/100;
    }

    public static double kılometre(double y) {

        return y/100000;
    }
    public static void convertFrom(double sayı){
        System.out.println("gırılen cm degerı:" +sayı/100 + "metre\n" +sayı/100000+ "kilometre");
    }

    /*
Kullanicidan bir tam sayi alin.
Bu sayinin negatif veya pozitif oldugunu,
tek mi cift mi oldugunu ve
uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
100'den kucukse sadece birler basamagini yazdirin.
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("bır tam sayı gırınız");
        int sayı = scan.nextInt();

        pozitifNegatıf(sayı);

















    }

    private static void pozitifNegatıf(int sayı) {
        System.out.println(sayı>0  && sayı!=0 ? "pozitif":"negatıf");
    }

}
