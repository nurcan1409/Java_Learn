package j13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {
        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
        //asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı

        Scanner scan = new Scanner(System.in);
        System.out.println("bır tamsayı gırınız");
        int sayı = scan.nextInt();

        boolean asalmı = true;
        for (int i = 2; i < sayı; i++) {
            if (sayı % i == 0) {
                asalmı = false;
                break;
            }

            if(asalmı) {
                System.out.println("gırılen sayı asal");
            }else System.out.println("asal degıl ");


        }









    }
}
