package L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
   //gırılen sayıdan 100 e kadar 4 un katı tamsayıları prınt eden code create edınız

        Scanner scan =new Scanner(System.in);
        System.out.println("bır pozıtıf gırınız");
        int sayı=scan.nextInt();

if(sayı>100) {
    System.out.println("hanı 100 den kucuk gırecektın"); // 100 degerı foru calıstırmaz,98 foru calıstırır ama ıf ı calıstırmaz
} else {
    for(int i=sayı ; i<100 ; i++) {
        if(i%4==0) {
            System.out.print(i +" ");
        }
        System.out.println("selam");
    }
}



















    }
}
