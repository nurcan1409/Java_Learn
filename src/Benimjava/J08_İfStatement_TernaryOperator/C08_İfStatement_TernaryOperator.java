package Benimjava.J08_İfStatement_TernaryOperator;

import java.util.Scanner;

public class C08_İfStatement_TernaryOperator {
    public static void main(String[] args) {

        int kerimYas = 45;
        int ismYas = 63;
        if (kerimYas == ismYas) ;
        {
            System.out.println("aynı yastasınız guzel ınsanlar");
            System.out.println("yoksa siz ıkız mısınz");


            if (kerimYas >= 40)
                System.out.println("kerım bey olgunluk yasındasınız");
            System.out.println("bu yazıyı okuduysanız 12.satırdakı iften bagımsız");
        }


        if (kerimYas + ismYas > 100) ;

/*
TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("yasınızı gırınız");
        int yas = scan.nextInt();
        if (yas > 18) {
            System.out.println("yasınız 18 den buyuk ");

        }
 /*
TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
18 den kuçuk ise ehliyet alamzsınız print ediniz
 */
        Scanner sc = new Scanner((System.in));
        System.out.println("yasınızı gırınız");
        if (yas >= 18) {
            System.out.println("yasınız 18 den kucuk degıl ");
        }

            System.out.println("ehlıyet alamazsın");







        }


    }


